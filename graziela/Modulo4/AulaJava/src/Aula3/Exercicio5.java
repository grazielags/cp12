package Aula3;

import javax.swing.JOptionPane;

public class Exercicio5 {
	public static void main(String args[]) {
		/*
		 * Escreva um algoritmo que calcule a média dos números digitados pelo usuário, se eles forem pares.
		 * Termine a leitura se o usuário digitar zero (0).
		 */
		int numero = -1;
		int quantidade = 0;
		int somaNumeros = 0;
		while(numero != 0) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número!"));
			if (numero != 0 && numero % 2 == 0) {
				somaNumeros += numero;
				quantidade++;
			}
		}
		double media = somaNumeros / (double) quantidade;
		JOptionPane.showMessageDialog(null, "A média dos números pares digitados é: " + media);
	}
}
