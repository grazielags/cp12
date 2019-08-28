package Aula1;

import javax.swing.JOptionPane;

public class Exercicio3 {
	public static void main(String[] args) {
		//Obter o salário de 5 funcionários e informar a média salarial dos funcionários.
		double soma = 0;
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do primeiro funcionário!"));
		soma = soma + salario;
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do segundo funcionário!"));
		soma += salario;
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do terceiro funcionário!"));
		soma += salario;
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do quarto funcionário!"));
		soma += salario;
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do quinto funcionário!"));
		soma += salario;
		double media = soma / 5;
		JOptionPane.showMessageDialog(null, "A média dos salários é: " + media);
	}
}
