package com.algaworks.cursojava.seguro;

import com.algaworks.cursojava.seguro.interfaces.Seguravel;

public class CorretoraSeguros {

	public void fazerPropostaSeguro(Seguravel objetoSeguravel) {
		System.out.println("-------------------------------");
		System.out.println("Corretora de Seguros - Proposta");
		System.out.println("-------------------------------");
		System.out.println(objetoSeguravel.obterDescricao());
		System.out.println("Valor da ap�lice: " + objetoSeguravel.calcularValorApolice());
		System.out.println("-------------------------------\n");
	}

}
