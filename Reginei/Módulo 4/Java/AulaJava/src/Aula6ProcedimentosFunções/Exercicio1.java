package Aula6ProcedimentosFun��es;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		// 1. Fa�a uma fun��o que leia 10 valores positivos e retorna a m�dia
		// aritm�tica dos mesmos.

		double media = calcularMedia();
		JOptionPane.showMessageDialog(null, media);

	}

	public static double calcularMedia() {
		int soma = 0;
		double media = 0;
		int numero = 0;
		for (int i = 0; i < 10; i++) {
 			soma += numero;
		}
		media = soma / 10;
		return media;
	}
}
