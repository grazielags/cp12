package Aula1;

import javax.swing.JOptionPane;

public class Exercicio6 {

	public static void main(String[] args) {

		/*
		 * 6. Escrever um programa que leia o nome de um vendedor, o seu salário fixo e
		 * o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este
		 * vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o seu
		 * nome, o salário fixo e salário no final do mês.
		 */

		String nome;
		double salario = 0;
		double totalVendas = 0;
		double comissao = 0;
		double salarioFinal = 0;

		nome = JOptionPane.showInputDialog("Digite o Nome: ");
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário: "));
		totalVendas = Double.parseDouble(JOptionPane.showInputDialog("Digite o total de vendas: "));

		comissao = totalVendas * (15.0 / 100.0);
		salarioFinal = salario + comissao;

		JOptionPane.showMessageDialog(null,
				"Nome: " + nome + "\nSalário fixo: " + salario + "\nSalário no fim do mês: " + salarioFinal);

	}

}
