package Aula2EstruturadeControle;

import javax.swing.JOptionPane;

public class Exercicio7 {

	public static void main(String[] args) {

		/*
		 * 7. Fa�a um programa que leia 3 notas, e calcule a m�dia e apresente:
		 * Aprovado, caso a m�dia seja maior ou igual a 7 e Reprovado, caso a m�dia seja
		 * menor do que 7.
		 */

		int nota1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a Primeira Nota: "));
		int nota2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a Segunda Nota: "));
		int nota3 = Integer.parseInt(JOptionPane.showInputDialog("Digite a Terceira Nota: "));

		int media = (nota1 + nota2 + nota3) / 3;

		if (media >= 7) {
			JOptionPane.showMessageDialog(null, "M�dia " + media + " :" + " Aprovado!");
		} else if (media < 7) {
			JOptionPane.showMessageDialog(null, "M�dia " + media + " :" + " Reprovado!");

		}

	}
}