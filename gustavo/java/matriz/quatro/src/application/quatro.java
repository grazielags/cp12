package application;

import javax.swing.JOptionPane;

public class quatro {

	public static void main(String[] args) {
		int matriz1[][] = new int[3][3];
		int matriz2[][] = new int[3][3];
		int matriz3[][] = new int[3][3];
		
		for (int linha = 0; linha < matriz1.length; linha++) {
			for (int coluna = 0; coluna < matriz1.length; coluna++) {
				matriz1[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Digite um num para matriz1 [" + linha + "]" + "[" + coluna + "]"));
			}
		}
		for (int linha = 0; linha < matriz2.length; linha++) {
			for (int coluna = 0; coluna < matriz2.length; coluna++) {
				matriz2[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Digite um num para matriz2 [" + linha + "]" + "[" + coluna + "]"));
				matriz3[linha][coluna] = matriz1[linha][coluna] * matriz2[linha][coluna];
			}
		}
		for (int linha = 0; linha < matriz3.length; linha++) {
			for (int coluna = 0; coluna < matriz3.length; coluna++) {
				JOptionPane.showMessageDialog(null, matriz3[linha][coluna]);
			}
	}
	}
}
