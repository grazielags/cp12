package application;

import javax.swing.JOptionPane;

public class um {

	public static void main(String[] args) {
		double salario = 0;
		double somaSalarios = 0;
		double mediaSalarios = somaSalarios/10;
		double menorSalario = 0;
		double maiorSalario = 0;
		int percentual = 0;
		int numFilhos = 0;
		int somaNumFilhos= 0;
		int mediaNumFilhos = somaNumFilhos/10;
		
		for (int i=1; i<=10; i++) {
			salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o seu salario: "));
			somaSalarios += salario;
			if (i == 1) {
				menorSalario = salario;
				maiorSalario = salario;
			}else{
				if (menorSalario > salario) {
				menorSalario = salario;
				}
				if (maiorSalario < salario) {
					maiorSalario = salario;
				}
			}
			if (i == 1) {
				percentual++;
			}else{
				if (salario < 1000) {
				percentual++;
				}
			}
			numFilhos = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero de filhos: "));
			somaNumFilhos += numFilhos;
		}
		mediaSalarios = somaSalarios/10;
		mediaNumFilhos = somaNumFilhos/10;
		JOptionPane.showMessageDialog(null,  "Média de salario: " + mediaSalarios);
		JOptionPane.showMessageDialog(null,  "Média de Filhos: " + mediaNumFilhos);
		JOptionPane.showMessageDialog(null,  "Maior salario: " + maiorSalario);
		JOptionPane.showMessageDialog(null,  "Menor salario: " + menorSalario);
		JOptionPane.showMessageDialog(null,  "Percentual de pessoas com salario menor que mil: " + ((percentual/10)*100) + "%");
	}	
}
