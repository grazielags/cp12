import javax.swing.JOptionPane;

public class M4A5exercicio4 {

	public static void main(String[] args) {
// Escreva um programa que contenha 2 matriz 3 x 3 e uma matriz resultante da multiplicação das 2 matrizes anteriores.

		
		int[][] matrizA = new int [3][3];
		int[][] matrizB = new int [3][3];
		int[][] matrizC = new int [3][3];
		
		
				
		for (int linha = 0; linha < matrizA.length; linha++) {
			for (int coluna = 0; coluna < matrizA[linha].length; coluna++) {
				matrizA[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Digite valor para matriz A: [" + linha + "][" + coluna +"]: "));
			}
		}
		String resultado =  "resultado da multiplicação: ";
		for (int linha = 0; linha < matrizB.length; linha++) {
			for (int coluna = 0; coluna < matrizB[linha].length; coluna++) {
				matrizB[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Digite valor para matriz B: [" + linha + "][" + coluna +"]: "));
				matrizC[linha][coluna] = matrizA[linha][coluna] * matrizB[linha][coluna];
				resultado += "\n[" + linha + "][" + coluna +"] -> " + matrizA[linha][coluna] + " * " + matrizB[linha][coluna] + " = " + matrizC[linha][coluna];
			}
		}
		JOptionPane.showMessageDialog(null, resultado);	
	}
}
