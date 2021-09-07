package com.algaworks.cursojava.numeros;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Numeros {

	static double valorProduto;

	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o valor do produto:");
		valorProduto = entrada.nextDouble();
		BigDecimal valorBig = new BigDecimal(valorProduto);
		DecimalFormat formatadorDecimal = new DecimalFormat("R$ #,##0.00");
		BigDecimal resultado = valorBig.multiply(BigDecimal.TEN).divide(new BigDecimal(100));
		String resultadoFormatado = formatadorDecimal.format(resultado.doubleValue());
		System.out.println("10% de " + valorProduto + " é: " + resultadoFormatado);

		entrada.close();
	}

}
