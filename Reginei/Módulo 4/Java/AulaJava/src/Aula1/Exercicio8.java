package Aula1;

import javax.swing.JOptionPane;

public class Exercicio8 {

	public static void main(String[] args) {

		/*
		 * 8. Escrever um programa em que leia dois valores para as vari�veis A e B, e
		 * efetuar as trocas dos valores de forma que a vari�vel A passe a possuir o
		 * valor da vari�vel B e a vari�vel B passe a possuir o valor da vari�vel A.
		 * Apresentar os valores trocados.
		 */

		int A = 0;
		int B = 0;
		int C = 0;

		A = Integer.parseInt(JOptionPane.showInputDialog("Digite um Valor para A: "));
		B = Integer.parseInt(JOptionPane.showInputDialog("Digite um Valor para B: "));

		C = A;
		A = B;
		B = C;

		JOptionPane.showMessageDialog(null, "A = " + A + "\n B = " + B);

	}

}
