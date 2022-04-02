
package Clases;
import java.io.Serializable;
import java.util.ArrayList;

public class Cliente implements Serializable{

    public Cliente(String dni, String nombre, String email, String clave, Tarjeta tarjeta, Ubicación ubicacion, boolean pro)  {
        this.dni = dni;
        this.nombre = nombre;
        this.email = email;
        this.clave = clave;
        this.tarjeta = tarjeta;
        this.ubicacion = ubicacion;
        this.esProfesional=pro;
        this.inicializado=true;
    }
    
    private boolean inicializado=false;
    private String dni;
    private String nombre;
    private String email;
    private String clave;
    private Tarjeta tarjeta;
    private Ubicación ubicacion;
    private ArrayList<Mensaje> mensajes=new ArrayList();
    private ArrayList<Producto> productos=new ArrayList();
    private boolean esProfesional;
    
    
    
    public boolean getInicializado() {
        return inicializado;
    }
    
    public boolean esProfesional() {
        return esProfesional;
    }

    public void setClave(boolean pro) {
        this.esProfesional = pro;
    }
    
    public void setMensajes(ArrayList<Mensaje> mensajes){
        this.mensajes=mensajes;
    }
    
    public ArrayList<Mensaje> getMensajes(){
        return mensajes;
    }
    
    public void setProductos(ArrayList<Producto> productos){
        this.productos=productos;
    }
    
    public ArrayList<Producto> getProductos(){
        return productos;
    }
    public Ubicación getUbicacion(){
        return ubicacion;
    }
    
    public void setUbicación(Ubicación ubicacion){
        this.ubicacion= ubicacion;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Cliente dni: " + dni;
    }

    
}
