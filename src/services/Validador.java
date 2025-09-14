package services;

public class Validador {
	

































    
    public static boolean validarCNPJ(String cnpj) {
        cnpj = cnpj.replaceAll("\\D", "");
        if (cnpj.length() != 14) {
            return false;
        }
        if (cnpj.matches("(\\d)\\1{13}")) {
            return false;
        }

        try {
            int[] pesos1 = {5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};
            int[] pesos2 = {6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};
            int soma = 0;
            for (int i = 0; i < 12; i++) {
                soma += (cnpj.charAt(i) - '0') * pesos1[i];
            }
            int resto = soma % 11;
            int digito1 = (resto < 2) ? 0 : 11 - resto;
            soma = 0;
            for (int i = 0; i < 13; i++) {
                soma += (cnpj.charAt(i) - '0') * pesos2[i];
            }
            resto = soma % 11;
            int digito2 = (resto < 2) ? 0 : 11 - resto;

            return (digito1 == (cnpj.charAt(12) - '0') &&
                    digito2 == (cnpj.charAt(13) - '0'));

        } catch (Exception e) {
            return false;
        }
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
