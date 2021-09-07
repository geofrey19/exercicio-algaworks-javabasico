package com.algaworks.cursojava.financeiro.modelo;

import com.algaworks.cursojava.financeiro.OperacaoContaException;

public class ContaReceber extends Conta {

	private Cliente cliente;


	public ContaReceber() {
	
	}

	public ContaReceber(Cliente cliente, String descricao, Double valor, String dataVencimento) {
		this.cliente = cliente;
		this.setDescricao(descricao);
		this.setValor(valor);
		this.setDataVencimento(dataVencimento);
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void receber() throws OperacaoContaException {

		if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			throw new OperacaoContaException("Conta: " + this.getDescricao() +" já foi paga");
		} else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			throw new OperacaoContaException("Conta: " + this.getDescricao() +" está cancelada!");
		} else {
			System.out.println("Conta: " + this.getDescricao() + " valor: " + this.getValor() + " data Venc.: "
					+ this.getDataVencimento() + " Cliente: " + this.getCliente().getNome());
			
			// altera situação da conta para PAGA
			situacaoConta =SituacaoConta.PAGA;
		}
	}
	
	public void cancelar() throws OperacaoContaException {
		if(this.getValor() <50000d) {
			super.cancelar();
		}else {
			throw new OperacaoContaException("A conta "+this.getDescricao()+" possui valor maior que 50 mil, só é permitido o cancelamento de"
					+ " contas a receber para contas abaixo desse valor");
		}
	}
	
	public void exibirDetalhes() {
		System.out.println("Conta: " + this.getDescricao());
		System.out.println("Valor: " + this.getValor());
		System.out.println("Data Venc.: "+ this.getDataVencimento()); 
		System.out.println("Cliente: " + this.getCliente().getNome());
	}
}
