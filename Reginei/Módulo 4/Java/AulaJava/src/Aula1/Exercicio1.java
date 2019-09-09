package Aula1;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {

		/*
		 * 1. Implemente um programa para calcular a área de um trapézio, onde: a =
		 * altura b = base menor B = base maior area = (a * (b + B)) / 2
		 */

		int a = 0;
		int b = 0;
		int B = 0;
		double area = 0;

		b = Integer.parseInt(JOptionPane.showInputDialog("Digite a base menor: "));
		B = Integer.parseInt(JOptionPane.showInputDialog("Digite a base maior: "));
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura: "));
		
		area = (a * (b + B)) / 2;

		JOptionPane.showMessageDialog(null, "A area é: " + area);

	}

}
