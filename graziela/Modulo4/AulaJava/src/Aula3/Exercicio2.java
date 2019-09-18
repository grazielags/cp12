package Aula3;

import javax.swing.JOptionPane;

public class Exercicio2 {
	public static void main(String[] args) {
		/*
		 * Construir um algoritmo que calcule a média aritmética de vários valores inteiros positivos,
		 * lidos externamente. O final da leitura acontecerá quando for lido um valor negativo.
		 */
		int numero = 0;
		int quantidade = 0;
		int somaNumeros = 0;
		while(numero >= 0) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número!"));
			if (numero >= 0) {
				somaNumeros += numero;
				quantidade++;
			}
		}
		double media = somaNumeros / (double) quantidade;
		JOptionPane.showMessageDialog(null, "A média dos valores é: " + media);
	}
	
}
