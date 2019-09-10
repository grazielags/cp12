package Aula2EstruturadeControle;

import javax.swing.JOptionPane;

public class Exercicio10 {

	public static void main(String[] args) {
		/*
		 * 10. Um funcionário irá receber um aumento de acordo com o seu plano de
		 * trabalho, de acordo com a tabela abaixo: 
		 * Plano Aumento
		 *   A     10%
		 *   B     15%
		 *   C     20%
		 * Faça um programa que leia o plano de trabalho e o salário atual de um funcionário
		 * e calcula e imprime o seu novo salário. Use o comando switch.
		 */

		double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o Salário do Funcionário: "));
		char plano = JOptionPane.showInputDialog("Digite o plano de Trabalho: ").toUpperCase().charAt(0);
		double A = 0;
		double B = 0;
		double C = 0;

		switch (plano) {
		case 'A':
			A = (salario + (salario * 10) / 100);
			JOptionPane.showMessageDialog(null, "O salário Reajustado com plano A é R$ " + A);
			break;

		case 'B':
			B = (salario + (salario * 15) / 100);
			JOptionPane.showMessageDialog(null, "O salário Reajustado com plano B é R$ " + B);
			break;

		case 'C':
			C = (salario + (salario * 20) / 100);
			JOptionPane.showMessageDialog(null, "O salário Reajustado com plano C é R$ " + C);
			break;

		default:
			JOptionPane.showMessageDialog(null, "Plano Inválido");

		}

	}
}
