import javax.swing.JOptionPane;

public class Exercicio3M4A1 {

	public static void main(String[] args) {
	//Obter o salário de 5 funcionários e informar a média salarial dos funcionários.
	double soma = 0;
	double salario1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do primeiro funcionário: "));
	soma = soma + salario1;
	double salario2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do segundo funcionário: "));
	soma += salario2;	
	double salario3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do terceiro funcionário: "));
	soma += salario3;	
	double salario4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do quarto funcionário: "));
	soma += salario4;
	double salario5 = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do quinto funcionário: "));
	soma += salario5;
	double media = soma / 5;
	JOptionPane.showMessageDialog(null, "Amédia do salário é: " + media); 
			
	}

}