package Aula5;

import javax.swing.JOptionPane;

public class Exercicio2 {
	public static void main(String[] args) {
		/*
		 * Escreva um programa para que mostre o menor e o maior valor de
		 * uma matriz 4 x 4.
		 */
		int numeros[][] = new int[4][4];
		int maior = 0;
		int menor = 0;
		for (int linha = 0; linha < numeros.length; linha++) {
			for (int coluna = 0; coluna < numeros[linha].length; coluna++) {
				numeros[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número!"));
				if (linha == 0 && coluna == 0) {
					maior = numeros[linha][coluna];
					menor = numeros[linha][coluna];
				} else {
					if (numeros[linha][coluna] > maior) {
						maior = numeros[linha][coluna];
					}
					if (numeros[linha][coluna] < menor) {
						menor = numeros[linha][coluna];
					}
				}
			}
		}
		JOptionPane.showMessageDialog(null, "Maior número: " + maior +
											"\nMenor número: " + menor);
	}
}
