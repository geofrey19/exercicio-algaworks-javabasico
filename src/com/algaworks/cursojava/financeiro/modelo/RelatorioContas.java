package com.algaworks.cursojava.financeiro.modelo;

public class RelatorioContas {

	public void exibirListagem(Conta[] contas) {

		System.out.println("*************************************");
		System.out.println("RELATÓRIO DE CONTAS A PAGAR E RECEBER");
		System.out.println("*************************************");

		for (int i = 0; i < contas.length; i++) {

			if (contas[i] instanceof ContaPagar) {
				System.out.println("*************************************");
				System.out.println("CONTAS A PAGAR");
				System.out.println("*************************************");

			}else {
				System.out.println("*************************************");
				System.out.println("CONTAS A RECEBER");
				System.out.println("*************************************");
			}
			contas[i].exibirDetalhes(); 
		}
	}
}
