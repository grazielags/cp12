package Aula2EstruturadeControle;

import javax.swing.JOptionPane;

public class Exercicio5 {

	public static void main(String[] args) {

		/*
		 * 5. Fa�a um programa que leia o pre�o de 1 produto de 3 lojas diferentes e
		 * mostre na tela qual das lojas voc� deveria comprar o produto.
		 */

		double valorA = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto na loja A: "));
		double valorB = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto na loja B: "));
		double valorC = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto na loja C: "));

		if (valorA < valorB && valorA < valorC) {
			JOptionPane.showMessageDialog(null, "O menor valor �: " + valorA + " na loja A!");
			
		} else if (valorB < valorA && valorB < valorC) {
			JOptionPane.showMessageDialog(null, "O menor valor �: " + valorB + " na loja B!");
			
		} else if (valorA == valorB && valorA == valorC) {
			JOptionPane.showMessageDialog(null, "As 3 lojas possuem o mesmo valor: " + valorA);
			
		} else {
			JOptionPane.showMessageDialog(null, "O menor valor �: " + valorC + " na loja C!");
		}
	}
}