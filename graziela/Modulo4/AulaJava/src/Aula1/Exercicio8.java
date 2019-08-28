package Aula1;

import javax.swing.JOptionPane;

public class Exercicio8 {
	public static void main(String[] args) {
		/*
		 * Escrever um programa em que leia dois valores para as variáveis A e B,
		 * e efetuar as trocas dos valores de forma que a variável A passe
		 * a possuir o valor da variável B e a variável B passe a possuir o
		 * valor da variável A. Apresentar os valores trocados.
		 */
		int A = Integer.parseInt(JOptionPane.showInputDialog("Digite um número!"));
		int B = Integer.parseInt(JOptionPane.showInputDialog("Digite um número!"));
		int C = A;
		A = B;
		B = C;
		JOptionPane.showMessageDialog(null, "A = " + A + "\nB = " + B);
	}
}
