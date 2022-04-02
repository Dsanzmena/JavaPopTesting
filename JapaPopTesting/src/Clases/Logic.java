
package Clases;
import java.awt.Image;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



public class Logic {
    
    private ArrayList<Cliente> clientes;
    private Cliente clienteActual;
    private String path;
    private String iconoJava;
     

    //ARRAYLIST DE PRODUCTOS VENDIDOS
    private ArrayList<Producto> productosVendidos=new ArrayList();
    
    //ARRAYLIST DE PRODUCTOS SELECCIONADOS EN LA BUSQUEDA
    private ArrayList<Producto> muyProximos=new ArrayList();
    private ArrayList<Producto> proximos=new ArrayList();
    private ArrayList<Producto> noProximos=new ArrayList();
    
    
    
    
    public Logic(ArrayList<Cliente> clientes,String path) {
        this.clientes = clientes;  
        this.path=path;
        this.iconoJava=path.toString()+"JavaPop.png";
    }
    
    public String getImagen(){
        return iconoJava;
    }
    
    public String getPath(){
        return path;
    }
    
    public ArrayList<Producto> getProductosVendidos(){
        return productosVendidos;
    }
    
    public void setProductosVendidos(ArrayList<Producto> vendidos){
        productosVendidos=vendidos;
    }
    
    public Cliente getClienteActual(){
        return clienteActual;
    }
    
    public void setClienteActual(Cliente c){
        this.clienteActual=c;
    }
    
    public ArrayList<Cliente> getClientes(){
        return clientes;
    }
    
    public ArrayList<Producto> getMuyProximos(){
        return muyProximos;
    }
    
    public ArrayList<Producto> getProximos(){
        return proximos;
    }
  
    public ArrayList<Producto> getNoProximos(){
        return noProximos;     
    }
    
    public boolean correoUsado(String correo){//COMPRUEBA SI EL CORREO YA ESTA SIENDO USADO POR OTRO CLIENTE
        boolean usado=false;
        for(Cliente c: getClientes()){
               if(correo.equals(c.getEmail())){
                   usado=true;
                } 
        }
        return usado;
    }
    
    
    public  ArrayList<String> separarPalabras(String p){//SEPARA LAS PALABRAS EN FUNCION DE LOS ESPACIOS DE UN STRING DADO
        
        ArrayList<String>  palabras=new ArrayList();
        StringTokenizer st2 = new StringTokenizer(p.concat(" "), " ");

        while (st2.hasMoreElements()) {
            palabras.add(st2.nextToken());
        } 
        return palabras;     
    }

    
    public void buscarProducto(String categoria, String palabrasClave){
        
        
        ArrayList<Producto> resultado=new ArrayList();
        ArrayList<String>  palabras=new ArrayList();
  
        palabras=separarPalabras(palabrasClave);//palabras separadas
          
        for(int j=0;j<getClientes().size();j++){  //BUSCA ENTRE LOS CLIENTES Y COGE UNO
            Cliente c=getClientes().get(j);
            
            if(c.equals(clienteActual)){
                
                if(j+1==getClientes().size()){ //SI EL CLIENTE ACTUAL ES EL ULTIMO DE LA LISTA DE CLIENTES
                    break;//PARAMOS DE BUSCAR POR QUE NO QUEREMOS QUE SE MUESTREN LOS PRODUCTOS DEL PROPIO CLIENTE ACTUAL
                }else{//SI NO COGEMOS AL SIGUIENTE CLIENTE
                    j++;
                    c=getClientes().get(j);
                }
              
            }
            for(int k=0;k<c.getProductos().size();k++){ //BUSCA ENTE LOS PRODUCTOS Y COGE UNO
                Producto p =c.getProductos().get(k);
                   
                if(p.getCategoria().equals(categoria)){//SI COINCIDE LA CATEGORIA
                    
                    if(palabras.isEmpty()){//EN EL CASO DE QUE NO ESCRIBIRSE NINGUNA PALABRA CLAVE SE AÑADEN LOS PRODUCTOS DE LA CATEGORIA SELECCIONADA
                        resultado.add(p);
                    }
                    for(int i=0; i<palabras.size(); i++){//COGE LAS PALABRAS CLAVE
                       
                        for(int z=0; z<p.getTitulo().size(); z++){
                                                
                            if(palabras.get(i).equals(p.getTitulo().get(z))){//COMPARA CADA PALABRA INTRODUCIDA CON LAS DEL PRODUCTO                    
                                
                                resultado.add(p);
                                break;
                                
                            }
                        }
                        break;
                    }       
                }
            }
        }
        
        this.muyProximos=new ArrayList();
        this.proximos=new ArrayList();
        this.noProximos=new ArrayList();
        
        if(resultado.size()>0){
            ordenarBusqueda(resultado);  
          
        }
        
         
    }
    
    
    public void ordenarBusqueda(ArrayList<Producto> productos){
      
        ArrayList<Producto> ordenado1=new ArrayList();
        ArrayList<Producto> ordenado2=new ArrayList();
        ArrayList<Producto> ordenado3=new ArrayList();
        ArrayList<Producto> copia=productos;
        
        this.muyProximos=new ArrayList();
        this.proximos=new ArrayList();
        this.noProximos=new ArrayList();
        
        
        int tamaño=copia.size();
        for(int i=0; i<copia.size();i++){//PRIMERO COGEMOS LOS PRODUCTOS URGENTES METIENDO LOS MUY PROXIMOS EN UNA LISTA, LOS PROXIMOS EN OTRA Y LOS NO PROXIMOS EN OTRA.
            Producto p=copia.get(copia.size()-1); 
            int proximidad=0;
            
            proximidad = compararUbicacion(clienteActual.getUbicacion(),p.getUbicacion());//CALCULAMOS LA DISTANCIA QUE HAY ENTRE AMBAS UBICACIONES
            if((proximidad==1)&&(p.isUrgente())){
                ordenado1.add(p);
                copia.remove(p);
            }
            else if((proximidad==2)&&(p.isUrgente())){
                ordenado2.add(p);
                copia.remove(p);
                
            }else if((proximidad==3)&&(p.isUrgente())){
                ordenado3.add(p);
                copia.remove(p);
            }
        }
        
        tamaño=copia.size();
        for(int i=0; i<tamaño;i++){//HACEMOS UNA SEGUNDA PASADA PARA AÑADIR LOS PRODUCTOS RESTANTES
            
            Producto p=copia.get(copia.size()-1);
            
            int proximidad = compararUbicacion(clienteActual.getUbicacion(),p.getUbicacion());
            if(proximidad==1){
                ordenado1.add(p);
                copia.remove(p);
            }
            else if(proximidad==2){
                ordenado2.add(p);
                copia.remove(p);
            }
            else if(proximidad==3){
                ordenado3.add(p);
                copia.remove(p);
            }
        }
        
        this.muyProximos=ordenado1;
        this.proximos=ordenado2;
        this.noProximos=ordenado3; 
       
       
    }
    
    
    public int compararUbicacion(Ubicación ubCliente, Ubicación ubProducto){
        /*
        pos 1--> muy proximo
        pos 2--> proximo
        pos 3--> no proximo
        */
        int pos=3;
        String codCliente, codProducto;
           
        codCliente= ubCliente.getCodigoPostal().substring(0,3);//COGE LAS TRES PRIMERAS CIFRAS DEL CP DEL CLIENTE
        codProducto= ubProducto.getCodigoPostal().substring(0, 3);//COGE LAS TRES PRIMERAS CIFRAS DEL CP DEL PRODUCTO
     
        if(codCliente.equals(codProducto)){//SI COINCIDEN LAS TRES CIFRAS
            pos=1;
        }else if(codCliente.substring(0, 2).equals(codProducto.substring(0,2))){//SI COINCIDEN LAS DOS PRIMERAS CIFRAS
            pos=2;
        }else{//SI NO COINCIDEN NINGUNA
            pos=3;
        }
        return pos;
    }
     
    
    
    public boolean comprobarSaldoParaCompra(double precioCompra){//COMPRUEBA SI EL CLIENTE TIENE SALDO PARA LA COMPRA
        boolean puedeComprar=false;
        
        if(clienteActual.getTarjeta().getSaldo()>=precioCompra){
            puedeComprar=true;
        }  
        return puedeComprar;
    }
    
 
    public Mensaje mensajeriaCuota(Producto p,int tipoMensaje){//CREA UN MENSAJE EN FUNCIÓN DEL TIPO QUE SE DESEE
        String contenido="";
        String titulo="";
        /*
        Tipo 1. Mensaje bienvenida
        Tipo 2. Mensaje cuota mensual
        Tipo 3. Promocion producto
        Tipo 4. Nueva compra
        */
        switch(tipoMensaje){
            case 1:
                contenido="¡Bienvenido a JavaPop, empieza a comprar y vender ya!";
                titulo="¡Bienvenido!";
                break;
            case 2:
                contenido="La cuota de cliente profresional (30€) ha sido cobrada en tu tarjeta "+ clienteActual.getTarjeta().getNumTarjeta();
                titulo="Cuota cobrada";
                break;
            case 3:   
                contenido="El producto "+p.toString()+" ha sido promocionado (5€) que se han cargado a tu tarjeta "+clienteActual.getTarjeta().getNumTarjeta();
                titulo="Producto promocionado";
                break;
            case 4:   
                contenido="El producto "+p.toString()+" ha sido comprado!. La factura ha sido generada correctamente en tu escritorio.";
                titulo="Nueva compra";
                break;
                
        }
        
        Mensaje m=new Mensaje(titulo,contenido,p);
        return m;
    } 
    
    public void comprarProducto(Producto productoComprado){
        
        Cliente comprador=productoComprado.getPosibleComprador();//OBTENEMOS AL COMPRADOR
        comprador.getTarjeta().restar(productoComprado.getPrecioVenta());//LE RESTAMOS EL IMPORTE DEL PRODUCTO A SU CUENTA
        Cliente vendedor=productoComprado.getVendedor();//OBTENEMOS AL VENDEDOR
        vendedor.getProductos().remove(productoComprado);//LE QUITAMOS EL PRODUCTO DE LA LISTA DE SUS PRODUCTOS
            
        LocalDateTime hora= LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy 'a las' hh:mm a");
        dtf.format(hora);
            
        productoComprado.setFechaVenta(hora);//LE DAMOS AL PRODUCTO LA HORA DE LA VENTA
        productosVendidos.add(productoComprado);//AÑADIMOS EL PRODUCTO A LA LISTA DE VENDIDOS
        System.out.println(productosVendidos.size());
        Mensaje m=mensajeriaCuota(productoComprado,4);//CREAMOS UN NUEVO MENSAJE
        productoComprado.getPosibleComprador().getMensajes().add(m);//LE PONEMOS EL MENSAJE AL COMPRADOR
        
    }
}
