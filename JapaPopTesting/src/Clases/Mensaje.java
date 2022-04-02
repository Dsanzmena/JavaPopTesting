
package Clases;

import java.io.Serializable;



public class Mensaje implements Serializable  {

    public Mensaje(String tituloMensaje, String contenido,Producto p) {
        this.tituloMensaje = tituloMensaje;
        this.contenido = contenido;
        this.producto=p;
        
    }
    
    
    private String tituloMensaje;
    private String contenido;
    private Producto producto;

    
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto p) {
        this.producto = p;
    }
    
    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }


    public String getTituloMensaje() {
        return tituloMensaje;
    }

    public void setTituloMensaje(String tituloMensaje) {
        this.tituloMensaje = tituloMensaje;
    }

    @Override
    public String toString() {
        return "Mensaje: "+ tituloMensaje;
    }

}
