package Aula1;

import javax.swing.JOptionPane;

public class Exercicio4 {
	public static void main(String[] args) {
		/*
		 * Faça um programa que receba o valor do produto e o percentual de 
		 * aumento que esse produto terá. Após isso apresente na tela o valor 
		 * antigo e o valor após o reajuste.
		 */
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto!"));
		double percentual = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de aumento!"));
		double valorReajustado = valor + ((valor * percentual) / 100);
		JOptionPane.showMessageDialog(null, "Valor do produto antes do reajuste: " + valor
										+ "\nValor do produto após o reajuste: " + valorReajustado);
	}
}
