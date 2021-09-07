package com.algaworks.cursojava.financeiro.modelo;

import com.algaworks.cursojava.financeiro.OperacaoContaException;

public abstract class Conta {
	
	private String descricao;
	private Double valor;
	private String dataVencimento;
	protected SituacaoConta situacaoConta;
	
	public Conta() {
		this.situacaoConta = SituacaoConta.PENDENTE;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public SituacaoConta getSituacaoConta() {
		return situacaoConta;
	}
	
	public void cancelar() throws OperacaoContaException {
		if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			throw new OperacaoContaException("A conta "+this.getDescricao()+ " já foi paga e não poderá ser cancelada!");
		} else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			throw new OperacaoContaException("A conta "+this.getDescricao()+" já foi cancelada!");
		} else {
			System.out.println("Conta "+ this.getDescricao() + " cancelada com sucesso! ");
			
			// altera situação da conta para CANCELADA
			this.situacaoConta =SituacaoConta.CANCELADA;
		}
	}
	
	public abstract void exibirDetalhes();
}
