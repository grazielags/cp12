package aula4Vetor;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {

		// 3. Escreva um programa que recebe um array (vetor) de números e
		// devolve a posição onde se encontra o maior valor do array (vetor). Se
		// houver mais de um valor maior, devolver a posição da primeira
		// ocorrência.

		int valor[] = new int[4];
		int posicaomaior = 0;
		int maiorvalor = 0;

		for (int posicao = 0; posicao < valor.length; posicao++) {
			valor[posicao] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para o Vetor: "));
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
		JOptionPane.showMessageDialog(null, "O maior número é: " + maiorvalor + " na posição: " + posicaomaior);
	}
}
