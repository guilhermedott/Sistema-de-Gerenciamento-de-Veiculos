package models;

public class Consessionaria {
    private String nomeCons;
    private String cnpjCons;

    public Consessionaria(String nomeCons, String cnpjCons) {
        this.nomeCons = nomeCons;
        this.cnpjCons = cnpjCons;
    }

    public String getnomeCons() {
        return nomeCons;
    }

    public void setnomeCons(String nomeCons) {
        this.nomeCons = nomeCons;
    }

    public String getcnpjCons() {
        return cnpjCons;
    }

    public void setcnpjCons(String cnpjCons) {
        this.cnpjCons = cnpjCons;
    }

    @Override
    public String toString() {
        return "Consessionaria {nomeCons='" + nomeCons + "', cnpjCons='" + cnpjCons + "'}";
    }
}
