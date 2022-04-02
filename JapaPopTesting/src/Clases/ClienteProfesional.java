

package Clases;
import java.time.LocalTime;
import java.util.ArrayList;

public class ClienteProfesional extends Cliente {

    public ClienteProfesional(String descripción, String telefono, String urlWeb, LocalTime horarioApertura, String dni, String nombre, String email, String clave, Tarjeta tarjeta, Ubicación ubicacion, boolean pro) {
        super(dni, nombre, email, clave, tarjeta, ubicacion, pro);
        this.descripción = descripción;
        this.telefono = telefono;
        this.urlWeb = urlWeb;
        this.horarioApertura = horarioApertura;
    }

    
    
    private String descripción;
    private String telefono;
    private String urlWeb;
    private LocalTime horarioApertura;
    
    
    public LocalTime getHorarioApertura(){
        return horarioApertura;
    }
    
    public void setHorarioApertura(LocalTime horarioApertura){
        this.horarioApertura = horarioApertura;
    }

    public String getUrlWeb() {
        return urlWeb;
    }

    public void setUrlWeb(String urlWeb) {
        this.urlWeb = urlWeb;
    }


    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    @Override
    public String toString() {
        return "Cliente profesional dni: "+super.getDni();
    }
  

}
