package Aula5;

import javax.swing.JOptionPane;

public class Exemplo1 {
	public static void main(String args[]) {
		int[][] numeros = {{1, 2}, {1, 2, 3, 4, 5}};
		for (int linha = 0; linha < numeros.length; linha++) {
			for (int coluna = 0; coluna < numeros[linha].length; coluna++) {
				numeros[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número!"));
				System.out.println("[" + linha + "][" + coluna + "] -> " + numeros[linha][coluna]);
			}
		}
	}
}
