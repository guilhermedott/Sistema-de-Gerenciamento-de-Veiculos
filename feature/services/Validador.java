package services;

public class Validador {
	/*if[CPF]*/
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
    /*end[CPF]*/
    /*if[CNPJ]*/
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
    /*end[CNPJ]*/
    /*if[Chassis]*/
    public static boolean validarChassis(String chassi) {
        return true;
    }
    /*end[Chassis]*/
    /*if[NumerodeSerie]*/
    public static boolean validarNumeroSerie(String numero) {
        return true;
    }
    /*end[NumerodeSerie]*/

    
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
