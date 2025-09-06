package models;
/*if[Seguradoras]*/
public class Seguradora {
    private String segNome;
    private String cnpjSeg;
    
    public Seguradora() {}

    public Seguradora(String segNome, String cnpjSeg) {
        this.segNome = segNome;
        this.cnpjSeg = cnpjSeg;
    }

    public String getsegNome() {
        return segNome;
    }

    public void setsegNome(String segNome) {
        this.segNome = segNome;
    }

    public String getcnpjSeg() {
        return cnpjSeg;
    }

    public void setcnpjSeg(String cnpjSeg) {
        this.cnpjSeg = cnpjSeg;
    }

    @Override
    public String toString() {
        return "Seguradora {segNome='" + segNome + "', cnpjSeg='" + cnpjSeg + "'}";
    }
}
/*end[Seguradoras]*/