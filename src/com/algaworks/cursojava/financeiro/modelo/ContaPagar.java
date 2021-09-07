package com.algaworks.cursojava.financeiro.modelo;

import com.algaworks.cursojava.financeiro.OperacaoContaException;

public class ContaPagar extends Conta {

	private Fornecedor fornecedor;
	

	public ContaPagar() {
		
	}


	public ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataVencimento) {
		this.fornecedor = fornecedor;
		this.setDescricao(descricao);
		this.setValor(valor);
		this.setDataVencimento(dataVencimento);
	}

	
	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	

	/*
	 * O método pagar() deve apenas exibir na tela as informações do pagamento
	 * (descrição da conta, valor, data de vencimento e nome do fornecedor).
	 */
	public void pagar() throws OperacaoContaException {

		if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			throw new OperacaoContaException("A conta "+ this.getDescricao() +" já foi paga");
		} else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			throw new OperacaoContaException("A conta "+ this.getDescricao() +" está cancelada!");
		} else {
			System.out.println("Conta: " + this.getDescricao() + " valor: " + this.getValor() + " data Venc.: "
					+ this.getDataVencimento() + " Fornecedor: " + this.getFornecedor().getNome());
			
			// altera situação da conta para PAGA
			situacaoConta =SituacaoConta.PAGA;
		}
	}
	
	public void exibirDetalhes() {
		System.out.println("Conta: " + this.getDescricao());
		System.out.println("Valor: " + this.getValor());
		System.out.println("Data Venc.: "+ this.getDataVencimento()); 
		System.out.println("Fornecedor: " + this.getFornecedor().getNome());
	}

}
