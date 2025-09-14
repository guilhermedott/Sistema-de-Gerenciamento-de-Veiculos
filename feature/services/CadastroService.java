package services;

import java.util.ArrayList;
import java.util.List;
import models.Carro;
import models.Pessoa;
import models.Consessionaria;
import models.Produto;
import models.Seguradora;
import models.Mecanica;

public class CadastroService {
	/*if[Pessoas]*/
    private List<Pessoa> pessoas = new ArrayList<>();
    /*end[Pessoas]*/
    /*if[Carros]*/
    private List<Carro> carros = new ArrayList<>();
    /*end[Carros]*/
    /*if[Consessionarias]*/
    private List<Consessionaria> consessionarias = new ArrayList<>();
    /*end[Consessionarias]*/
    /*if[Produtos]*/
    private List<Produto> produtos = new ArrayList<>();
    /*end[Produtos]*/
    /*if[Seguradoras]*/
    private List<Seguradora> seguradoras = new ArrayList<>();
    /*end[Seguradoras]*/
    /*if[Mecanicas]*/
    private List<Mecanica> mecanicas = new ArrayList<>();
    /*end[Mecanicas]*/
    
    /*if[Pessoas]*/
    public void cadastrarPessoa(Pessoa pessoa) {
        if (Validador.validarCPF(pessoa.getCpf())) {
            pessoas.add(pessoa);
        } else {
            return;
        }
    }

    public List<Pessoa> listarPessoas() {
        return pessoas;
    }
    /*end[Pessoas]*/
    
    /*if[Carros]*/
    public void cadastrarCarro(Carro carro) {
        if (Validador.validarChassis(carro.getchassis())) {
            carros.add(carro);
        } else {
            return;
        }
    }

    public List<Carro> listarCarros() {
        return carros;
    }
    /*end[Carros]*/
    
    /*if[Consessionarias]*/
    public void cadastrarConsessionaria(Consessionaria consessionaria) {
        if (Validador.validarCNPJ(consessionaria.getcnpjCons())) {
            consessionarias.add(consessionaria);
        } else {
            return;
        }
    }

    public List<Consessionaria> listarConsessionarias() {
        return consessionarias;
    }
    /*end[Consessionarias]*/
    
    /*if[Produtos]*/
    public void cadastrarProduto(Produto produto) {
        if (Validador.validarNumeroSerie(produto.getserialNumber())) {
            produtos.add(produto);
        } else {
            return;
        }
    }

    public List<Produto> listarProdutos() {
        return produtos;
    }
    /*end[Produtos]*/
    /*if[Seguradoras]*/
    public void cadastrarSeguradora(Seguradora seguradora) {
        if (Validador.validarCNPJ(seguradora.getcnpjSeg())) {
            seguradoras.add(seguradora);
        } else {
            return;
        }
    }

    public List<Seguradora> listarSeguradoras() {
        return seguradoras;
    }
    /*end[Seguradoras]*/
    /*if[Mecanicas]*/
    public void cadastrarMecanica(Mecanica mecanica) {
        if (Validador.validarCNPJ(mecanica.getcnpjMec())) {
            mecanicas.add(mecanica);
        } else {
            return;
        }
    }

    public List<Mecanica> listarMecanicas() {
        return mecanicas;
    }
    /*end[Mecanicas]*/
}
	