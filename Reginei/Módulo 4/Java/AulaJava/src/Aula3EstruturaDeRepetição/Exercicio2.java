package Aula3EstruturaDeRepeti��o;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {

		/*
		 * 2) Construir um algoritmo que calcule a m�dia aritm�tica de v�rios valores
		 * inteiros positivos, lidos externamente. O final da leitura acontecer� quando
		 * for lido um valor negativo.
		 */

		int mediaAritimetica = 0;
		int somaMedia = 0;
		int contador = 0;

		while (mediaAritimetica >= 0) {
			mediaAritimetica = Integer.parseInt(JOptionPane.showInputDialog("Digite um Valor: "));
			if (mediaAritimetica >= 0) {
				contador++;
				somaMedia += mediaAritimetica;

			}
		}
		somaMedia = somaMedia / contador;
		JOptionPane.showMessageDialog(null, "A m�dia Aritimetica �: " + somaMedia);
	}
}
