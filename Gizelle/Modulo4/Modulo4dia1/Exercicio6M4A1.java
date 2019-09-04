import javax.swing.JOptionPane;

public class Exercicio6M4A1 {

	public static void main(String[] args) {
	//Escrever um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas 
	// efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre
	// suas vendas efetuadas, informar o seu nome, o salário fixo e salário no final do mês.. 
	
		String nome = JOptionPane.showInputDialog("Digite o nome do funcionário: ");
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do funcionário: "));
		double vendas = Double.parseDouble(JOptionPane.showInputDialog("Digite o total de vendas feitano mês: "));
		double comissao = vendas * (15.0 / 100.0);
		double TotalSalario = salario + comissao;
		
		JOptionPane.showMessageDialog(null, "Nome do Funcionário: " + nome
										+ "\nSalário fixo: " + salario
										+ "\nSalário comissão: " + TotalSalario);
			
	}

}