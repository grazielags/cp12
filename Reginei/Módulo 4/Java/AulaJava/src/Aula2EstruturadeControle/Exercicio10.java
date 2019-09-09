package Aula2EstruturadeControle;

import javax.swing.JOptionPane;

public class Exercicio10 {

	public static void main(String[] args) {
		/*
		 * 10. Um funcion�rio ir� receber um aumento de acordo com o seu plano de
		 * trabalho, de acordo com a tabela abaixo: 
		 * Plano Aumento
		 *   A     10%
		 *   B     15%
		 *   C     20%
		 * Fa�a um programa que leia o plano de trabalho e o sal�rio atual de um funcion�rio
		 * e calcula e imprime o seu novo sal�rio. Use o comando switch.
		 */

		double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o Sal�rio do Funcion�rio: "));
		char plano = JOptionPane.showInputDialog("Digite o plano de Trabalho: ").toUpperCase().charAt(0);
		double A = 0;
		double B = 0;
		double C = 0;

		switch (plano) {
		case 'A':
			A = (salario + (salario * 10) / 100);
			JOptionPane.showMessageDialog(null, "O sal�rio Reajustado com plano A � R$ " + A);
			break;

		case 'B':
			B = (salario + (salario * 15) / 100);
			JOptionPane.showMessageDialog(null, "O sal�rio Reajustado com plano B � R$ " + B);
			break;

		case 'C':
			C = (salario + (salario * 20) / 100);
			JOptionPane.showMessageDialog(null, "O sal�rio Reajustado com plano C � R$ " + C);
			break;

		default:
			JOptionPane.showMessageDialog(null, "Plano Inv�lido");

		}

	}
}
