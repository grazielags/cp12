package Aula2;

import javax.swing.JOptionPane;

public class Exercicio5 {
	public static void main(String[] args) {
		/*
		 * Faça um programa que leia o preço de 1 produto
		 * de 3 lojas diferentes e mostre na tela qual das
		 * lojas você deveria comprar o produto.
		 */
		double valorA = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto na loja A!"));
		double valorB = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto na loja B!"));
		double valorC = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto na loja C!"));

		if (valorA < valorB && valorA < valorC) {
			JOptionPane.showMessageDialog(null, "O menor valor é: " + valorA + " na loja A!");
		} else if (valorB < valorA && valorB < valorC) {
			JOptionPane.showMessageDialog(null, "O menor valor é: " + valorB + " na loja B!");
		} else if (valorA == valorB && valorA == valorC) {
			JOptionPane.showMessageDialog(null, "As 3 lojas possuem o mesmo valor: " + valorA);
		} else {
			JOptionPane.showMessageDialog(null, "O menor valor é: " + valorC + " na loja C!");
		}
		
//		if (valorA == valorB && valorA == valorC) {
//			JOptionPane.showMessageDialog(null, "As 3 lojas possuem o mesmo valor: " + valorA);
//		} else {
//			double menorValor = valorA;
//			String lojaMenorValor = "Loja A";
//			if (valorB < menorValor) {
//				menorValor = valorB;
//				lojaMenorValor = "Loja B";
//			} else if (valorC < menorValor) {
//				menorValor = valorC;
//				lojaMenorValor = "Loja C";
//			}
//			JOptionPane.showMessageDialog(null, "O menor valor é: " + menorValor + " na loja: " + lojaMenorValor);
//		}
	}
}
