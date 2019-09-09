package Aula1;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * 4. Faça um programa que receba o valor do produto e o percentual de aumento
		 * que esse produto terá. Após isso apresente na tela o valor antigo e o valor
		 * após o reajuste.
		 */
		double valor = 0;
		double percentual = 0;
		double valorReajustado = 0;

		valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto: "));
		percentual = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de aumento: "));

		valorReajustado = valor + ((valor * percentual) / 100);

		JOptionPane.showMessageDialog(null, "Valor do produto antes do reajuste: " + valor
				+ "\nValor do produto após o reajuste: " + valorReajustado);

	}

}
