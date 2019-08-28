package Aula1;

import javax.swing.JOptionPane;

public class Exercicio6 {
	public static void main(String[] args) {
		/*
		 * Escrever um programa que leia o nome de um vendedor,
		 * o seu salário fixo e o total de vendas efetuadas por ele no mês
		 * (em dinheiro). Sabendo que este vendedor ganha 15% de comissão
		 * sobre suas vendas efetuadas, informar o seu nome,
		 * o salário fixo e salário no final do mês.
		 */
		String nome = JOptionPane.showInputDialog("Digite o nome!");
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário!"));
		double totalVendas = Double.parseDouble(JOptionPane.showInputDialog("Digite o total de vendas!"));
		double comissao = totalVendas * (15.0 / 100.0);
		double salarioFimDoMes = salario + comissao;
		JOptionPane.showMessageDialog(null, "Nome: " + nome
										+ "\nSalário fixo: " + salario
										+ "\nSalário no fim do mês: " + salarioFimDoMes);
	}
}
