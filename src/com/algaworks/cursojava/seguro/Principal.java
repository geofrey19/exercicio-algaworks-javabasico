package com.algaworks.cursojava.seguro;

import com.algaworks.cursojava.seguro.model.Carro;
import com.algaworks.cursojava.seguro.model.Imovel;
import com.algaworks.cursojava.seguro.model.Notebook;

public class Principal {

	public static void main(String[] args) {
		CorretoraSeguros corretora = new CorretoraSeguros();

		Carro meuCarro = new Carro(45000d, 2012);
		Imovel minhaCasa = new Imovel(920000, 320);
		Notebook noteBook = new Notebook(4000, "Sony");

		corretora.fazerPropostaSeguro(meuCarro);
		corretora.fazerPropostaSeguro(minhaCasa);
		corretora.fazerPropostaSeguro(noteBook);

	}

}
