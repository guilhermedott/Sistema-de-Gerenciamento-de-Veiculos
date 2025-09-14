package models;
public class Carro {
    private String modelo;
    private String chassis;
    
    public Carro() {}
    
    public Carro(String modelo, String chassis) {
        this.modelo = modelo;
        this.chassis = chassis;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getchassis() {
        return chassis;
    }

    public void setchassis(String chassis) {
        this.chassis = chassis;
    }

    @Override
    public String toString() {
        return "Carro {modelo='" + modelo + "', chassis='" + chassis + "'}";
    }
}