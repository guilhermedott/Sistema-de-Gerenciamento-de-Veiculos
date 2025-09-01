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
	


    
    private List<Carro> carros = new ArrayList<>();
    
    
    private List<Consessionaria> consessionarias = new ArrayList<>();
    
    
    private List<Produto> produtos = new ArrayList<>();
    
    


    


    
    












    
    
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
    
    












    












}
	