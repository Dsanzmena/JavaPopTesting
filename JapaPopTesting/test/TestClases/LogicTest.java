
package TestClases;

import Clases.Cliente;
import Clases.Logic;
import Clases.Mensaje;
import Clases.Producto;
import static Clases.JavaPopMain.recuperarDatos;
import java.io.File;
import java.util.ArrayList;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import org.junit.*;

public class LogicTest {
    private String fichero = "ficheroClientes";
    private ArrayList<Cliente> clientes = recuperarDatos(fichero);
    private final String finalPath = new File(".").getAbsolutePath().replace(".","images\\");

    
    public LogicTest() {
    }
    
    public void setUp() {
    }
    

    public void tearDown() {
    }


    @Test
    public void testGetProductosVendidos() {
        System.out.println("Test de prueba productos vendidos");
        
        //Creamos instancia de Logica
        Logic instance = new Logic(clientes,finalPath);
        
        //Obtenemos un producto y lo vendemos y hacemos que lo compre otro cliente
        Producto p = clientes.get(0).getProductos().get(0);
        p.setPosibleComprador(clientes.get(1));

        instance.comprarProducto(p);
       
        //Resultado esperado
        ArrayList<Producto> expResult = new ArrayList<>();
        expResult.add(p);
        
        //Resultado 
        ArrayList<Producto> result = instance.getProductosVendidos();
        
        //Comprobación
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSepararPalabras() {
        System.out.println("Test de prueba separar palabras");
        
        //Creamos instancia de Logica
        Logic instance = new Logic(clientes,finalPath);
        
        //Creamos un String cualquiera que contenga varias palabras separadas por espacios
        String categorias = "Tecnología Altavoces Informatica Sonido";

        //Resultado esperado
        ArrayList<String> expResult = new ArrayList<>();
        expResult.add("Tecnología"); expResult.add("Altavoces"); expResult.add("Informatica"); expResult.add("Sonido"); 
        
        //Resultado 
        ArrayList<String> result = instance.separarPalabras(categorias);
        
        //Comprobación
        assertEquals(expResult, result);
    }

    @Test
    public void testBuscarProducto() {
        System.out.println("Test de prueba buscar producto");
        
        //Creamos instancia de Logica
        Logic instance = new Logic(clientes,finalPath);
        
        //Decimos una categoria válida y ninguna palabra clave
        String categoria = "TV, audio y foto";
        String palabrasClave = "";
        
        //Resultado esperado    
        ArrayList<Producto> expResult = new ArrayList<>();
        
            //Cogemos el producto que deberia salir en el array de Productos no proximos (con respecto al cliente 3
            Producto p = clientes.get(2).getProductos().get(1);
            expResult.add(p);
            
        //Resultado 
        Cliente noProximo = clientes.get(0);
        instance.setClienteActual(noProximo);
        instance.buscarProducto(categoria, palabrasClave);
        ArrayList<Producto> result = instance.getNoProximos();
         
        //Comprobación
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCorreoUsado() {
        System.out.println("Test de prueba determinar si correo está en uso");
        
        //Creamos instancia de Logica
        Logic instance = new Logic(clientes,finalPath);
        
        //Resultado esperado 
        boolean expResult = true;
            //Ponemos un correo que YA está en uso 
            String correo = "jose23@outlook.com";
            
        //Resultado
        boolean result = instance.correoUsado(correo);
        
        //Comprobación
        assertEquals(expResult, result);   
    }
    
    @Test
    public void testComprobarSaldoParaCompra() {
        System.out.println("Test de prueba determinar si el cliente tiene saldo para la compra");
        
        //Creamos instancia de Logica
        Logic instance = new Logic(clientes,finalPath);
        
        //Resultado esperado 
        boolean expResult = true;
            //Ponemos precio  
            double precioCompra = 42.60;

        //Resultado 
        //Seleccionamos un cliente que SI que tiene saldo para pagar.
        instance.setClienteActual(clientes.get(0));
        boolean result = instance.comprobarSaldoParaCompra(precioCompra);
        
        //Comprobación
        assertEquals(expResult, result);  
    }
   
    @Test
    public void testMensajeriaCuota() {
        System.out.println("Test de prueba determinar si se envia el mensaje correspondiente");
        
        //Creamos instancia de Logica
        Logic instance = new Logic(clientes,finalPath);
        
        //Resultado esperado
            //Mensaje de promocion de un producto del cliente 1
            Producto p = clientes.get(0).getProductos().get(1);
            String contenido = "El producto "+p.toString()+" ha sido promocionado (5€) que se han cargado a tu tarjeta "+clientes.get(0).getTarjeta().getNumTarjeta();
            String titulo="Producto promocionado";
            Mensaje expResult = new Mensaje(titulo,contenido,p);
            
        //Resultado
        int tipoMensaje = 3;
        instance.setClienteActual(clientes.get(0));
        Mensaje result = instance.mensajeriaCuota(p, tipoMensaje);
        
        //Comprobación
        assertEquals(expResult.getContenido(), result.getContenido());   
    }
    
   
    
}
