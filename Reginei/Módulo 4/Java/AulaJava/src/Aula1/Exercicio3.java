package Aula1;

import javax.swing.JOptionPane;

public class Exercicio3 {
	public static void main(String[] args) {
		
		/*Obter o sal�rio de 5 funcion�rios e informar a m�dia salarial dos funcion�rios.*/
		
		double soma = 0;
		double salario = 0;
		double media = 0;
		
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o sal�rio do primeiro funcion�rio: "));
		soma += salario;
		
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o sal�rio do segundo funcion�rio: "));
		soma += salario;
		
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o sal�rio do terceiro funcion�rio: "));
		soma += salario;
		
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o sal�rio do quarto funcion�rio: "));
		soma += salario;
		
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o sal�rio do quinto funcion�rio: "));
		soma += salario;
		media = soma / 5;
		
		JOptionPane.showMessageDialog(null, "A m�dia dos sal�rios �: " + media);
	}
}
