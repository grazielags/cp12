package Aula3;

import javax.swing.JOptionPane;

public class Exercicio1 {
	public static void main(String[] args) {
		/*
		 * Uma empresa possui 10 funcionários. Ela resolveu realizar uma pesquisa entre seus funcionários,
		 * coletando dados sobre o salário e número de filhos. A empresa deseja saber:  
		 * a) média do salário dos funcionários;
		 * b) média do número de filhos;
		 * c) maior salário;
		 * d) menor salário;
		 * e) percentual de pessoas com salário menor que R$1000,00.
		 */
		double maiorSalario = 0;
		double menorSalario = 0;
		int quantidadeFuncionarios = 3;
		double salario;
		int quantidadeFilhos = 0;
		double somaSalarios = 0;
		int somaFilhos = 0;
		int quantidadeSalariosAbaixo = 0;
		for (int i = 1; i <= quantidadeFuncionarios; i++) {
			salario = Double.parseDouble(JOptionPane.showInputDialog("Digite um salário!"));
			quantidadeFilhos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de filhos!"));
			somaSalarios = somaSalarios + salario;
			somaFilhos = somaFilhos + quantidadeFilhos;
			if (i == 1) {
				maiorSalario = salario;
				menorSalario = salario;
			} else {
				if (salario > maiorSalario) {
					maiorSalario = salario;
				}
				if (salario < menorSalario) {
					menorSalario = salario;
				}
			}
			if (salario < 1000) {
				quantidadeSalariosAbaixo++;
			}
		}
		double mediaSalario = somaSalarios / quantidadeFuncionarios;
		double mediaFilhos = somaFilhos / quantidadeFuncionarios;
		double percentualSalarioAbaixo = (quantidadeSalariosAbaixo / quantidadeFuncionarios) * 100;
		JOptionPane.showMessageDialog(null, "a) A média dos salários é: " + mediaSalario
										+ "\nb) A média do número de filhos é: " + mediaFilhos
										+ "\nc) O maior salário é: " + mediaFilhos
										+ "\nd) O menor salário é: " + mediaFilhos
										+ "\ne) Percentual de funcionários com salário abaixo de R$1.000,00 é: " + percentualSalarioAbaixo);
	}
}
