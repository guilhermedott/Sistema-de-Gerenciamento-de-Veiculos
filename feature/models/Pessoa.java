package models;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private String cpf;
    private List<Carro> carros; // associação com a classe Carro
    
    public Pessoa() {}

    // Construtor
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.carros = new ArrayList<>();
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    // Métodos para gerenciar carros
    public void adicionarCarro(Carro carro) {
        carros.add(carro);
    }

    public void removerCarro(Carro carro) {
        carros.remove(carro);
    }

    // Método de exibição
    @Override
    public String toString() {
        return "Pessoa {" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", carros=" + carros +
                '}';
    }
}
