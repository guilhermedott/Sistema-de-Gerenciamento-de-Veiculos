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
	
    private List<Pessoa> pessoas = new ArrayList<>();
    
    
    private List<Carro> carros = new ArrayList<>();
    
    


    


    


    


    
    
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
    
    
    












    
    












    












    












}
	