package Aula1;

import javax.swing.JOptionPane;

public class Exercicio6 {

	public static void main(String[] args) {

		/*
		 * 6. Escrever um programa que leia o nome de um vendedor, o seu sal�rio fixo e
		 * o total de vendas efetuadas por ele no m�s (em dinheiro). Sabendo que este
		 * vendedor ganha 15% de comiss�o sobre suas vendas efetuadas, informar o seu
		 * nome, o sal�rio fixo e sal�rio no final do m�s.
		 */

		String nome;
		double salario = 0;
		double totalVendas = 0;
		double comissao = 0;
		double salarioFinal = 0;

		nome = JOptionPane.showInputDialog("Digite o Nome: ");
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o sal�rio: "));
		totalVendas = Double.parseDouble(JOptionPane.showInputDialog("Digite o total de vendas: "));

		comissao = totalVendas * (15.0 / 100.0);
		salarioFinal = salario + comissao;

		JOptionPane.showMessageDialog(null,
				"Nome: " + nome + "\nSal�rio fixo: " + salario + "\nSal�rio no fim do m�s: " + salarioFinal);

	}

}
