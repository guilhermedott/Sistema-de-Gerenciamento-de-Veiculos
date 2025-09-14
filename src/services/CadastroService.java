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
	


    


    


    


    
    private List<Seguradora> seguradoras = new ArrayList<>();
    
    


    
    












    
    












    
    












    
    












    
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
    
    












}
	