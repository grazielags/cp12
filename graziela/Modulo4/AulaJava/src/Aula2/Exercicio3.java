package Aula2;

import javax.swing.JOptionPane;

public class Exercicio3 {
	public static void main(String[] args) {
		/*
		 * Faça um programa que obtenha uma letra:
		 * F (Feminino) ou M (Masculino).
		 * Após obter a letra, escreva na tela Feminino
		 * se a pessoa digitou a letra F,
		 * e Masculino se a pessoa digitou a letra M.
		 */
		char sexo = JOptionPane.showInputDialog("Digite F - Feminino ou M - Masculino!").toUpperCase().charAt(0);
		if (sexo == 'F') {
			JOptionPane.showMessageDialog(null, "Feminino!");
		} else if (sexo == 'M') {
			JOptionPane.showMessageDialog(null, "Masculino!");
		} else {
			JOptionPane.showMessageDialog(null, "Sexo inválido!");
		}
	}
}
