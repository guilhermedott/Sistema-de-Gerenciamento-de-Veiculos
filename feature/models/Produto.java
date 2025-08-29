package models;

public class Produto {
    private String produto;
    private String serialNumber;

    public Produto(String produto, String serialNumber) {
        this.produto = produto;
        this.serialNumber = serialNumber;
    }

    public String getproduto() {
        return produto;
    }

    public void setproduto(String produto) {
        this.produto = produto;
    }

    public String getserialNumber() {
        return serialNumber;
    }

    public void setserialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Produto {produto='" + produto + "', serialNumber='" + serialNumber + "'}";
    }
}
