package Aula5Matriz;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {

		// 4. Escreva um programa que contenha 2 matriz 3 x 3 e uma matriz
		// resultante da multiplica��o das 2 matrizes anteriores.

		int matriz1[][] = new int[3][3];
		int matriz2[][] = new int[3][3];
		int matriz3[][] = new int[3][3];

		for (int linha = 0; linha < matriz1.length; linha++) {
			for (int coluna = 0; coluna < matriz1[linha].length; coluna++) {
				matriz1[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero[" + linha + "][" + coluna + "]:"));
			}
		}

		String resultado = "Resultado da multiplica��o: ";
		for (int linha = 0; linha < matriz2.length; linha++) {
			for (int coluna = 0; coluna < matriz2[linha].length; coluna++) {
				matriz2[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero[" + linha + "][" + coluna + "]:"));
				matriz3[linha][coluna] = matriz1[linha][coluna] * matriz2[linha][coluna];
				resultado += "\n[" + linha + "][" + coluna + "] -> " + matriz1[linha][coluna]
							+ " * " + matriz2[linha][coluna] + " = " + matriz3[linha][coluna];
			}
		}

		JOptionPane.showMessageDialog(null, resultado);
	}
}