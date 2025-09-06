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

        // Verifica se todos os dígitos são iguais (ex: 111.111.111-11 é inválido)
        if (cpf.matches("(\\d)\\1{10}")) {
            return false;
        }

        try {
            // Calcula o primeiro dígito verificador
            int soma = 0;
            for (int i = 0; i < 9; i++) {
                soma += (cpf.charAt(i) - '0') * (10 - i);
            }
            int resto = 11 - (soma % 11);
            int digito1 = (resto == 10 || resto == 11) ? 0 : resto;

            // Calcula o segundo dígito verificador
            soma = 0;
            for (int i = 0; i < 10; i++) {
                soma += (cpf.charAt(i) - '0') * (11 - i);
            }
            resto = 11 - (soma % 11);
            int digito2 = (resto == 10 || resto == 11) ? 0 : resto;

            // Confere se os dois dígitos calculados batem com os informados
            return (digito1 == (cpf.charAt(9) - '0') &&
                    digito2 == (cpf.charAt(10) - '0'));

        } catch (Exception e) {
            return false;
        }
    }
    /*end[CPF]*/
    /*if[CNPJ]*/
    public static boolean validarCNPJ(String cnpj) {
    	// Remove caracteres não numéricos
        cnpj = cnpj.replaceAll("\\D", "");

        // Verifica se tem 14 dígitos
        if (cnpj.length() != 14) {
            return false;
        }

        // Verifica se todos os dígitos são iguais (ex: 11.111.111/1111-11 é inválido)
        if (cnpj.matches("(\\d)\\1{13}")) {
            return false;
        }

        try {
            int[] pesos1 = {5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};
            int[] pesos2 = {6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};

            // Calcula o primeiro dígito verificador
            int soma = 0;
            for (int i = 0; i < 12; i++) {
                soma += (cnpj.charAt(i) - '0') * pesos1[i];
            }
            int resto = soma % 11;
            int digito1 = (resto < 2) ? 0 : 11 - resto;

            // Calcula o segundo dígito verificador
            soma = 0;
            for (int i = 0; i < 13; i++) {
                soma += (cnpj.charAt(i) - '0') * pesos2[i];
            }
            resto = soma % 11;
            int digito2 = (resto < 2) ? 0 : 11 - resto;

            // Confere se os dígitos calculados batem com os informados
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
    /*if[Numero de Serie]*/
    public static boolean validarNumeroSerie(String numero) {
        return true;
    }
    /*end[Numero de Serie]*/
}
