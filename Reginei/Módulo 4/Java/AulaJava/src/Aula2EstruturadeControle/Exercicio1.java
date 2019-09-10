package Aula2EstruturadeControle;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {

		/*
		 * 1. Faça um programa que obtenha 3 valores e diga qual o maior valor entre
		 * eles e qual o menor valor entre eles.
		 */

		double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Primeiro Valor: "));
		double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Segundo Valor: "));
		double valor3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Terceiro Valor: "));

		if (valor1 > valor2 && valor1 > valor3) {
			JOptionPane.showMessageDialog(null, "O maior valor é: " + valor1);
		} else if (valor2 > valor1 && valor2 > valor3) {
			JOptionPane.showMessageDialog(null, "O maior valor é: " + valor2);
		} else {
			JOptionPane.showMessageDialog(null, "O maior valor é: " + valor3);
		}
	}

}
