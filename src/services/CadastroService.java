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
	


    


    


    
    private List<Produto> produtos = new ArrayList<>();
    
    


    
    private List<Mecanica> mecanicas = new ArrayList<>();
    
    
    












    
    












    
    












    
    
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
    
}
	