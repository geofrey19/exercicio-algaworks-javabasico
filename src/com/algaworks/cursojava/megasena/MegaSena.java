package com.algaworks.cursojava.megasena;

public class MegaSena {

	public static final int NUMERO_MAXIMO = 60;
	public static final int QUANTIDADE_NUMEROS = 6;
	private int[] numerosSorteados;

	// gera n�mero aleat�rio, arredonda e converte para inteiro
	public int geraNumeroAleatorio() {
		return (int) Math.round(Math.random() * NUMERO_MAXIMO);
	}

	public void geraJogo() {
		this.numerosSorteados = new int[QUANTIDADE_NUMEROS];

		for (int i = 1; i <= QUANTIDADE_NUMEROS; i++) {
			int numeroSorteado = this.geraNumeroAleatorio();
			
			// verifica se n�mero j� foi sorteado e se � 0
			if (this.jaFoiSorteado(numeroSorteado) || numeroSorteado == 0) {
				i--; // decrementa i para refazer o sorteio da mesma posi��o
			} else {
				// adiciona o n�mero sorteado no array de n�meros sorteados
				this.numerosSorteados[i - 1] = numeroSorteado;
			}
		}

	}

	private boolean jaFoiSorteado(int numero) {
		boolean resultado = false;
		for (int i = 0; i < this.numerosSorteados.length; i++) {
			if (this.numerosSorteados[i] == numero) {
				resultado = true;
				break;
			}
		}
		return resultado;
	}
	
	public void exibirNumeros() {
		for (int numeroSorteado : numerosSorteados) {
			System.out.print(numeroSorteado + " ");
		}
		
		System.out.println();
	}
}
