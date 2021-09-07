package com.algaworks.cursojava.seguro.model;

import com.algaworks.cursojava.seguro.interfaces.Seguravel;

public class Notebook implements Seguravel {
	private double valorMercado;
	private String marca;
	
	public Notebook(double valorMercado, String marca) {
		this.valorMercado = valorMercado;
		this.marca = marca;
	}

	@Override
	public double calcularValorApolice() {
		return this.valorMercado * 0.05;
		 
	}

	@Override
	public String obterDescricao() {
		return "Notebook marca " + this.marca + " com valor de mercado " 
				+ this.valorMercado;
	}
	
	
}
