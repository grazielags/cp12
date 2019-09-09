package Aula3EstruturaDeRepetição;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {

/*    1)Uma empresa possui 10 funcionários. Ela resolveu realizar uma pesquisa
		entre seus funcionários, coletando dados sobre o salário e número de filhos. A empresa deseja saber:
		 
		  a) média do salário dos funcionários; 
		  b) média do número de filhos; 
		  c) maior salário; 
		  d) menor salário; 
		  e) percentual de pessoas com salário menor que R$1000,00.
 */

		double salario = 0;
		int numFilhos = 0;
		double mediaSalario = 0;
		int mediaFilhos = 0;
		double maiorSalario = 0;
		double menorSalario = 0;
		double abaixoMil = 0;
		double totalSalario = 0;
		int totalFilhos = 0;
	

		for (int contador = 1; contador <= 3; contador++) {
			salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salario: "));
			numFilhos = Integer.parseInt(JOptionPane.showInputDialog("Digite o Número de Filhos: "));
			totalSalario += salario;
			totalFilhos += numFilhos;
			if (contador == 1) {
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
			if(salario < 1000) {
				abaixoMil++;
			}
		}
		mediaSalario = totalSalario / 3;
		mediaFilhos = totalFilhos / 3;
		abaixoMil = (abaixoMil / 3) * 100;
		JOptionPane.showMessageDialog(null, "A média Salarial é: " + mediaSalario);
		JOptionPane.showMessageDialog(null, "A média de filhos é: " + mediaFilhos);
		JOptionPane.showMessageDialog(null, "O maior Salário é: " + maiorSalario);
		JOptionPane.showMessageDialog(null, "O menor Salário é: " + menorSalario);
		JOptionPane.showMessageDialog(null, "O percentual de Funcionarios com salario abaixo de : " + abaixoMil);

	}

}
