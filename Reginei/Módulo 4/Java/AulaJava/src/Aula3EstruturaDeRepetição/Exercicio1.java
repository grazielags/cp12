package Aula3EstruturaDeRepeti��o;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {

/*    1)Uma empresa possui 10 funcion�rios. Ela resolveu realizar uma pesquisa
		entre seus funcion�rios, coletando dados sobre o sal�rio e n�mero de filhos. A empresa deseja saber:
		 
		  a) m�dia do sal�rio dos funcion�rios; 
		  b) m�dia do n�mero de filhos; 
		  c) maior sal�rio; 
		  d) menor sal�rio; 
		  e) percentual de pessoas com sal�rio menor que R$1000,00.
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
			numFilhos = Integer.parseInt(JOptionPane.showInputDialog("Digite o N�mero de Filhos: "));
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
		JOptionPane.showMessageDialog(null, "A m�dia Salarial �: " + mediaSalario);
		JOptionPane.showMessageDialog(null, "A m�dia de filhos �: " + mediaFilhos);
		JOptionPane.showMessageDialog(null, "O maior Sal�rio �: " + maiorSalario);
		JOptionPane.showMessageDialog(null, "O menor Sal�rio �: " + menorSalario);
		JOptionPane.showMessageDialog(null, "O percentual de Funcionarios com salario abaixo de : " + abaixoMil);

	}

}
