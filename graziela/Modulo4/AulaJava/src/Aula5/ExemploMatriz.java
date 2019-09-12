package Aula5;

import javax.swing.JOptionPane;

public class ExemploMatriz {
	public static void main(String args[]) {
		int linhas = 19;
		int colunas = 20;
		int[][] notas = new int[linhas][colunas ];
		double soma = 0;
		double somaLinha = 0;
//		notas[0][0] = 32;
//		notas[0][1] = 10;
//		notas[0][2] = 5;
//		notas[1][0] = 15;
//		notas[1][1] = 25;
//		notas[1][2] = 5;
		String resultado = "Listagem das notas: ";
		for (int linha = 0; linha < notas.length; linha++) {
			resultado = resultado + "\n";
			for (int coluna = 0; coluna < notas[linha].length; coluna++) {
				notas[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Digite uma nota[" + linha + "][" + coluna + "]!"));
				resultado = resultado + notas[linha][coluna] + "   ";
			}
		}
		soma = 0;
		for (int linha = 0; linha < notas.length; linha++) {
			somaLinha = 0;
			for (int coluna = 0; coluna < notas[linha].length; coluna++) {
				somaLinha = somaLinha + notas[linha][coluna];
				soma = soma + notas[linha][coluna];
			}
			System.out.println("Soma notas na linha " + linha + " = " + somaLinha);
		}
		System.out.println("Soma notas = " + soma);
		System.out.println(resultado);
	}
}
