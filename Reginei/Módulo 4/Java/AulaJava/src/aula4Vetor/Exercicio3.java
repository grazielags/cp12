package aula4Vetor;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {

		// 3. Escreva um programa que recebe um array (vetor) de n�meros e
		// devolve a posi��o onde se encontra o maior valor do array (vetor). Se
		// houver mais de um valor maior, devolver a posi��o da primeira
		// ocorr�ncia.

		int valor[] = new int[4];
		int posicaomaior = 0;
		int maiorvalor = 0;

		for (int posicao = 0; posicao < valor.length; posicao++) {
			valor[posicao] = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero para o Vetor: "));
		}
		for (int posicao = 0; posicao < valor.length; posicao++) {

			if (posicao == 0) {
				maiorvalor = valor[posicao];
				posicaomaior = posicao;
			} else if (valor[posicao] > maiorvalor) {
				maiorvalor = valor[posicao];
				posicaomaior = posicao;

			}
		}

		String apresentar = "Valores do vetor: ";
		for (int posicao = 0; posicao < valor.length; posicao++) {
			apresentar = apresentar + "\n" + posicao + " - " + valor[posicao];
		}
		JOptionPane.showMessageDialog(null, apresentar);
		JOptionPane.showMessageDialog(null, "O maior n�mero �: " + maiorvalor + " na posi��o: " + posicaomaior);
	}
}
