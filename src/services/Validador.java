package services;

public class Validador {
	
    public static boolean validarCPF(String cpf) {
    	 // Remove caracteres não numéricos
    		 cpf = cpf.replaceAll("\\D", "");

        // Verifica se tem 11 dígitos
        if (cpf.length() != 11) {
            return false;
        }
        if (cpf.matches("(\\d)\\1{10}")) {
            return false;
        }

        try {
            int soma = 0;
            for (int i = 0; i < 9; i++) {
                soma += (cpf.charAt(i) - '0') * (10 - i);
            }
            int resto = 11 - (soma % 11);
            int digito1 = (resto == 10 || resto == 11) ? 0 : resto;
            soma = 0;
            for (int i = 0; i < 10; i++) {
                soma += (cpf.charAt(i) - '0') * (11 - i);
            }
            resto = 11 - (soma % 11);
            int digito2 = (resto == 10 || resto == 11) ? 0 : resto;
            return (digito1 == (cpf.charAt(9) - '0') &&
                    digito2 == (cpf.charAt(10) - '0'));

        } catch (Exception e) {
            return false;
        }
    }
    
    

































    
    public static boolean validarChassis(String chassi) {
        return true;
    }
    
    





    
    public static boolean VerificaFocoCampo(String campo) {
    	
    	if(campo.contains("Digite"))
    	{
    		return true;
    	}
    	else {
    		return false;
    	}
    	
    }
    
}
