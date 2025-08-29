package models;

public class Mecanica {
    private String nomeMec;
    private String cnpjMec;

    public Mecanica(String nomeMec, String cnpjMec) {
        this.nomeMec = nomeMec;
        this.cnpjMec = cnpjMec;
    }

    public String getnomeMec() {
        return nomeMec;
    }

    public void setnomeMec(String nomeMec) {
        this.nomeMec = nomeMec;
    }

    public String getcnpjMec() {
        return cnpjMec;
    }

    public void setcnpjMec(String cnpjMec) {
        this.cnpjMec = cnpjMec;
    }

    @Override
    public String toString() {
        return "Mecanica {nomeMec='" + nomeMec + "', cnpjMec='" + cnpjMec + "'}";
    }
}
