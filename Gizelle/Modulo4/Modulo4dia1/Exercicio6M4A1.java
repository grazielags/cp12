import javax.swing.JOptionPane;

public class Exercicio6M4A1 {

	public static void main(String[] args) {
	//Escrever um programa que leia o nome de um vendedor, o seu sal�rio fixo e o total de vendas 
	// efetuadas por ele no m�s (em dinheiro). Sabendo que este vendedor ganha 15% de comiss�o sobre
	// suas vendas efetuadas, informar o seu nome, o sal�rio fixo e sal�rio no final do m�s.. 
	
		String nome = JOptionPane.showInputDialog("Digite o nome do funcion�rio: ");
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o sal�rio do funcion�rio: "));
		double vendas = Double.parseDouble(JOptionPane.showInputDialog("Digite o total de vendas feitano m�s: "));
		double comissao = vendas * (15.0 / 100.0);
		double TotalSalario = salario + comissao;
		
		JOptionPane.showMessageDialog(null, "Nome do Funcion�rio: " + nome
										+ "\nSal�rio fixo: " + salario
										+ "\nSal�rio comiss�o: " + TotalSalario);
			
	}

}