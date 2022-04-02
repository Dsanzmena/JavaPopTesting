
package Clases;

import java.io.*;
import java.time.*;
import Interfaz.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JFrame;


public class JavaPopMain implements Serializable{
    
    public boolean inicializado;

    public static void guardarDatos(ArrayList<Cliente> clientes,String nombreFichero){
         
        try {
            ObjectOutputStream ficheroSalida = new ObjectOutputStream(new FileOutputStream(nombreFichero));
            ficheroSalida.writeObject(clientes);
            ficheroSalida.flush();
            ficheroSalida.close();
            
 
        } catch (FileNotFoundException fnfe) {
            System.out.println("Error escritura: El fichero no existe. " + fnfe.toString());
        } catch (IOException ioe) {
            System.out.println("Error escritura: Fallo en la escritura en el fichero. " + ioe.toString());
        }
    }

    public static ArrayList<Cliente> recuperarDatos(String fichero){
        
        ArrayList<Cliente> datosRecuperados = new ArrayList<>();
        try{
            ObjectInputStream ficheroEntrada;
            ficheroEntrada = new ObjectInputStream(new FileInputStream(fichero));
            datosRecuperados= (ArrayList<Cliente>) ficheroEntrada.readObject();
            ficheroEntrada.close();         
            
        }catch (FileNotFoundException fnfe){
            System.out.println("Error lectura: Fichero no existe" + fnfe.toString());
        }catch (IOException ioe){
            System.out.println("Error en la lectura del fichero" + ioe.toString());
        } catch (ClassNotFoundException ex) {
            System.out.println("Error lectura:" +  ex.toString());
        }       
        
        return datosRecuperados;
    }
    
    public static void main(String[] args) {
        
        String fichero="ficheroClientes";
        
        //Obtenemos el path de las imagenes mediante ruta absoluta
        ArrayList<Cliente> clientes=recuperarDatos(fichero);
        String abs=(new File(".").getAbsolutePath()); 
        String finalPath=abs.replace(".","images\\");
        
        try{
            if(!clientes.get(0).getInicializado()){//SI LOS DATOS NO HAN SIDO INICIALIZADOS
                clientes=inicializar(finalPath);//INICIALIZA CON EL PATH DE LAS IMAGENES
            }
            
        }catch(Exception e){
            clientes=inicializar(finalPath);//INICIALIZA CON EL PATH DE LAS IMAGENES
        }
      
        Logic l=new Logic(clientes,finalPath);
    
        JFrameInicio ventanaInicio=new JFrameInicio(l);
        ventanaInicio.setLocationRelativeTo(null);
        ventanaInicio.setVisible(true);    
        guardarDatos(clientes,fichero);
        
    }
        
        
        
        
    
    
    public static ArrayList<Cliente> inicializar(String finalPath){
        
        ArrayList<String> titulo=new ArrayList();
        titulo.add("tecnologia");
        titulo.add("juego");
        //------------------------TARJETAS------------------------
        Tarjeta tarj=new Tarjeta("1916 3234 5523 3511",231.23);
        Tarjeta tarj1=new Tarjeta("6216 3124 4223 2181",1230.09);
        Tarjeta tarj2=new Tarjeta("2316 4234 5123 0981",2103.67);
        Tarjeta tarj3=new Tarjeta("8916 2344 2341 2381",1123.23);
        Tarjeta tarj4=new Tarjeta("5616 3567 5523 1581",223.64);
        
        //------------------------UBICACIONES------------------------
        Ubicación ubi=new Ubicación("Guadalajara","19002");
        Ubicación ubi1=new Ubicación("Madrid","19302");
        Ubicación ubi2=new Ubicación("Pamplona","20302");
        Ubicación ubi3=new Ubicación("Alcalá","19102");
        Ubicación ubi4=new Ubicación("Guadalajara","19002");
        
        //------------------------HORARIOS------------------------
        String horario1="08:00";
        String horario2="15:30";
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("HH:mm");
        LocalTime hora1= LocalTime.parse(horario1,dtf);
        LocalTime hora2= LocalTime.parse(horario2,dtf);
        
        //------------------------CLIENTES------------------------
        Cliente cliente1 =new Cliente("03217394W","Daniel","daniel_perez@gmail.com","danielperez",tarj,ubi,false);
        Cliente cliente2 =new Cliente("03217394E","Jose","jose23@outlook.com","jose23",tarj1,ubi1,false);
        Cliente cliente3 =new Cliente("02317394R","Paula","paulagar@gmail.com","paulagar",tarj2,ubi2,false);
        ClienteProfesional cliente4 =new ClienteProfesional("Oils es una tienda dedicada a la venta de ropa para mujeres.","622628376","www.oils.com",hora1,"03492281C","Laura","laura.sanchez@oils.com","",tarj3,ubi3,true);
        ClienteProfesional cliente5 =new ClienteProfesional("Game es una tienda de videojuegos con grandes ofertas.","612312358","www.game.es",hora2,"02212341K","Fernando","fer_360@game.com","fer_360",tarj4,ubi4,true);
        
        
        //------------------------PRODUCTOS------------------------
        
        //Productos cliente 1
        ArrayList<String> titulop=new ArrayList();
        titulop.add("tecnologia");
        titulop.add("juego");
        Producto p = new Producto(titulop,"Juego muy bueno y barato casi nuevo", 5, 1, 23.12,true,cliente1.getUbicacion(),cliente1,finalPath,"juego.jpg");
        
        ArrayList<String> titulop1=new ArrayList();
        titulop1.add("ropa");
        titulop1.add("zapatos");
        Producto p1 = new Producto(titulop1,"Zapatos marrones con cordones nuevos, sin usar", 1, 1, 15.19,false,cliente1.getUbicacion(),cliente1,finalPath,"zapatos.jpg");
        
        //Productos cliente 2
        ArrayList<String> titulop2=new ArrayList();
        titulop2.add("tecnologia");
        Producto p2 = new Producto(titulop2,"Altavoces nuevos color gris", 4, 1, 20,true,cliente2.getUbicacion(),cliente2,finalPath,"altavoces.jpg");
        
        ArrayList<String> titulop3=new ArrayList();
        titulop3.add("pelota");
        titulop3.add("futbol");
        Producto p3 = new Producto(titulop3,"Pelota de plastico para niños", 6, 3, 5.50,false,cliente2.getUbicacion(),cliente2,finalPath,"pelota.png");
      
        //Productos cliente 3
        ArrayList<String> titulop4=new ArrayList();
        titulop4.add("movil");
        titulop4.add("iphone");
        Producto p4 = new Producto(titulop4,"Iphone 5 6GB de ram", 3, 1, 60.50,true,cliente3.getUbicacion(),cliente3,finalPath,"iphone.jpg");
        
        ArrayList<String> titulop5=new ArrayList();
        titulop5.add("pelicula");
        Producto p5 = new Producto(titulop5,"Pelicula el Joker incluye carcasa en buen estado", 2, 3, 5.50,false,cliente3.getUbicacion(),cliente3,finalPath,"joker.jpg");
        
        //Productos cliente 4
        ArrayList<String> titulop6=new ArrayList();
        titulop6.add("ropa");
        titulop6.add("blusa");
        Producto p6 = new Producto(titulop6,"Blusa negra con hilos plateados ", 1, 1, 9.99,false,cliente4.getUbicacion(),cliente4,finalPath,"blusa.jpg");
        
        ArrayList<String> titulop7=new ArrayList();
        titulop6.add("ropa");
        titulop7.add("falda");
        Producto p7 = new Producto(titulop7,"Falda rodillera beige con flecos", 1, 1, 15.50,false,cliente4.getUbicacion(),cliente4,finalPath,"falda.jpg");
        
        //Productos cliente 5
        ArrayList<String> titulop8=new ArrayList();
        titulop8.add("juego");
        titulop8.add("ps4");
        Producto p8 = new Producto(titulop8,"GTA V estado seminuevo ", 5, 2, 20.99,true,cliente5.getUbicacion(),cliente5,finalPath,"gta5.jpg");
        
        ArrayList<String> titulop9=new ArrayList();
        titulop9.add("juego");
        titulop9.add("pc");
        Producto p9 = new Producto(titulop9,"Bioshock Infinite (2013) ", 5, 1, 7.50,false,cliente5.getUbicacion(),cliente5,finalPath,"bioshock.jpg");
        
        
        cliente1.getProductos().add(p);
        cliente1.getProductos().add(p1);
        
        cliente2.getProductos().add(p2);
        cliente2.getProductos().add(p3);
        
        cliente3.getProductos().add(p4);
        cliente3.getProductos().add(p5);
        
        cliente4.getProductos().add(p6);
        cliente4.getProductos().add(p7);
        
        cliente5.getProductos().add(p8);
        cliente5.getProductos().add(p9);
        
       
        //------------------------ARRAYLIST CLIENTES------------------------
        ArrayList<Cliente> clientes=new ArrayList();
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);
        clientes.add(cliente5);
        
        return clientes;
    }
    
    
    
}
