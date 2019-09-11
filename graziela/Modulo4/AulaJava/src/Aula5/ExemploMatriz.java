package Aula5;

public class ExemploMatriz {
	public static void main(String args[]) {
		int[][] notas = new int[2][1];
		double soma = 0;
		notas[0][0] = 32;
		notas[1][0] = 15;
		for (int linha = 0; linha < notas.length; linha++) {
			soma = 0;
			for (int coluna = 0; coluna < notas[linha].length; coluna++) {
				soma = soma + notas[linha][coluna];
			}
			System.out.println("Soma notas = " + soma);
		}
	}
}
