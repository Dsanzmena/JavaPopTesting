
package Clases;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.io.Serializable;


public class Producto implements Serializable {
    
    private ArrayList<String> titulo=new ArrayList();
    private String descripcion;
    private String categoria;
    private String estado;
    private double precioVenta;
    private String fotografia;
    private boolean urgente;
    private Ubicación ubicacion;
    private LocalDateTime fechaPublicacion;
    private LocalDateTime fechaVenta;
    private Cliente vendedor;
    private Cliente posibleComprador;
    private String sinImagen;

   

    //CONSTRUCTOR CON EL PATH DE LA IMAGEN CALCULADO
    public Producto(ArrayList<String> titulo, String descripcion, int categoria, int estado, double precioVenta, boolean urgente,Ubicación ubi,Cliente vendedor,String imagenPath,String nombreImagen){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.categoria = setCategoria(categoria);
        this.estado = setEstado(estado);
        this.precioVenta = precioVenta;
        this.urgente = urgente;
        this.fechaPublicacion= LocalDateTime.now();
        this.ubicacion= ubi;
        this.vendedor=vendedor;
        this.fotografia=imagenPath+nombreImagen;
        this.sinImagen=imagenPath+"sinimagen.png";
        
        
    }
    //CONSTRUCTOR CON EL PATH DE LA IMAGEN YA DADO(ALTA DE PRODUCTO)
     public Producto(ArrayList<String> titulo, String descripcion, int categoria, int estado, double precioVenta, boolean urgente,Ubicación ubi,Cliente vendedor,String nombreImagen){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.categoria = setCategoria(categoria);
        this.estado = setEstado(estado);
        this.precioVenta = precioVenta;
        this.urgente = urgente;
        this.fechaPublicacion= LocalDateTime.now();
        this.ubicacion= ubi;
        this.vendedor=vendedor;
        this.fotografia=nombreImagen;
     
        
        
    }
    public Producto(){
        
    }
    
    public String getSinImagen(){
        return sinImagen;
    }
    public void setPosibleComprador(Cliente c){
        this.posibleComprador=c;
    }
    
    public Cliente getPosibleComprador(){
        return posibleComprador;
    }
   
    public Cliente getVendedor(){
        return vendedor;
    }
    
    public void setFechaVenta(LocalDateTime fechaVenta) {
        this.fechaVenta=fechaVenta;
    }

    public LocalDateTime getFechaVenta() {
        return fechaVenta;
    }

    public LocalDateTime getVendido(boolean vendido) {
        return fechaVenta;
    }
    
    public LocalDateTime getFechaPublicacion(){
        return fechaPublicacion;
    }
    
    public void setFechaPublicacion(LocalDateTime fechaPublicacion){
        this.fechaPublicacion = fechaPublicacion;
    }
    
    public Ubicación getUbicacion(){
        return ubicacion;
    }
    
    public void setUbicación(Ubicación ubicacion){
        this.ubicacion= ubicacion;
    }
    
    public boolean isUrgente() {
        return urgente;
    }

    public void setUrgente(boolean urgente) {
        this.urgente = urgente;
    }

    public String getFotografia() {
        return fotografia;
    }

    public void setFotografia(String fotografia) {
        this.fotografia = fotografia;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getEstado() {
        return estado;
    }

    public String setEstado(int estado) {
        String est="";
       
        switch(estado){
            case 1:
                est="Nuevo ";
                break;
            case 2:
                est="Como nuevo";
                break;
            case 3:
                est="Bueno";
                break;
            case 4:
                est="Aceptable";
                break;
            case 5:
                est="Regular";
                break;
        }
        return est;
    }

    public String getCategoria() {
        return categoria;
    }

    public String setCategoria(int categoria) {
        String cat="";
    
        switch(categoria){
            
            case 1:
                cat="Moda y accesorios";
                break;
            case 2:
                cat="TV, audio y foto";
                break;
            case 3:
                cat="Móviles y telefonía";
                break;
            case 4:
                cat="Informática y electrónica";
                break;
            case 5:
                cat="Consolas y videojuegos";
                break;
            case 6:
                cat="Deporte y ocio";
                break;
           
        }
        
        return cat;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<String> getTitulo() {
        return titulo;
    }

    public void setTitulo(ArrayList<String> titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Producto: " + titulo.toString();

    }

    public String descripcion(){
        return "Producto{" + "titulo=" + titulo + ", descripcion=" + descripcion + ", categoria=" + categoria + ", estado=" + estado + ", precioVenta=" + precioVenta + ", fotografia=" + fotografia + ", urgente=" + urgente + ", ubicacion=" + ubicacion + ", fechaPublicacion=" + fechaPublicacion + ", fechaVenta=" + fechaVenta + ", vendedor=" + vendedor + ", posibleComprador=" + posibleComprador + ", sinImagen=" + sinImagen + '}';
    }
    
}
