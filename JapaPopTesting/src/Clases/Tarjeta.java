
package Clases;
import java.io.Serializable;

public class Tarjeta implements Serializable {

    public Tarjeta(String numTarjeta, double saldo) {
        this.numTarjeta = numTarjeta;
        this.saldo = saldo;
    }
    
    private String numTarjeta;
    private double saldo;

    
    public void restar(double cantidad){
        this.saldo=saldo-cantidad;
    }
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = Math.round(saldo*100)/100.0;
    }


    public String getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

}
