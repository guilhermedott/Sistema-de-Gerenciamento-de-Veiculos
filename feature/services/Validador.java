package services;

public class Validador {
	/* if[CPF] */
	public static boolean validarCPF(String cpf) {
		if (cpf == null)
			return false;

		String digits = cpf.replaceAll("\\D", "");
		if (digits.length() != 11)
			return false;

		// rejeita sequências repetidas
		if (digits.chars().distinct().count() == 1)
			return false;

		// cálculo do 1º dígito verificador
		int sum = 0;
		for (int i = 0, weight = 10; i < 9; i++, weight--) {
			sum += (digits.charAt(i) - '0') * weight;
		}
		int dv1 = 11 - (sum % 11);
		if (dv1 >= 10)
			dv1 = 0;

		// cálculo do 2º dígito verificador
		sum = 0;
		for (int i = 0, weight = 11; i < 10; i++, weight--) {
			sum += (digits.charAt(i) - '0') * weight;
		}
		int dv2 = 11 - (sum % 11);
		if (dv2 >= 10)
			dv2 = 0;

		return digits.charAt(9) == (char) (dv1 + '0') && digits.charAt(10) == (char) (dv2 + '0');
	}

	/* end[CPF] */
	/* if[CNPJ] */
	public static boolean validarCNPJ(String cnpj) {
		if (cnpj == null)
			return false;

		String digits = cnpj.replaceAll("\\D", "");
		if (digits.length() != 14)
			return false;

		// rejeita sequências repetidas
		if (digits.chars().distinct().count() == 1)
			return false;

		int[] weights1 = { 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2 };
		int[] weights2 = { 6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2 };

		// cálculo do 1º dígito verificador
		int sum = 0;
		for (int i = 0; i < 12; i++) {
			sum += (digits.charAt(i) - '0') * weights1[i];
		}
		int dv1 = sum % 11;
		dv1 = (dv1 < 2) ? 0 : 11 - dv1;

		// cálculo do 2º dígito verificador
		sum = 0;
		for (int i = 0; i < 13; i++) {
			sum += (digits.charAt(i) - '0') * weights2[i];
		}
		int dv2 = sum % 11;
		dv2 = (dv2 < 2) ? 0 : 11 - dv2;

		return digits.charAt(12) == (char) (dv1 + '0') && digits.charAt(13) == (char) (dv2 + '0');
	}

	/* end[CNPJ] */
	/* if[Chassis] */
	public static boolean validarChassis(String chassi) {
		return true;
	}

	/* end[Chassis] */
	/* if[Numero de Serie] */
	public static boolean validarNumeroSerie(String numero) {
		return true;
	}
	/* end[Numero de Serie] */
}
