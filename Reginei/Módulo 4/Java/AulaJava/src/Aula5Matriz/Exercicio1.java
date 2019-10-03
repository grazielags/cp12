package Aula5Matriz;

import javax.swing.JOptionPane;

public class Exercicio1 {
	public static void main(String[] args) {
		/*
		 * Construa uma matriz 3 x 3, preencha ela com valores inteiros
		 * e ap�s isso verifique se essa matriz � uma matriz identidade.
		 */
		int numeros[][] = new int[3][3];
		boolean isMatrizIdentidade = true;
		String resultado =  "Listagem da matriz: ";
		for (int linha = 0; linha < numeros.length; linha++) {
			resultado += "\n";
			for (int coluna = 0; coluna < numeros[linha].length; coluna++) {
				numeros[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Digite um N�mero: " ));
//				if (linha == coluna) {
//					while (numeros[linha][coluna] != 1) {
//						numeros[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Digite apenas o n�mero 1!"));
//					}
//				} else {
//					while (numeros[linha][coluna] != 0) {
//						numeros[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Digite apenas o n�mero 0!"));
//					}
//				}
				resultado += numeros[linha][coluna] + "   ";
				if (linha == coluna && numeros[linha][coluna] != 1) {
					isMatrizIdentidade = false;
				} else if (linha != coluna && numeros[linha][coluna] != 0) {
					isMatrizIdentidade = false;
				}
			}
		}
		JOptionPane.showMessageDialog(null, resultado +
											"\nA matriz � uma matriz identidade? " + isMatrizIdentidade);
	}
}
