import javax.swing.JOptionPane;

public class Exercicio3M4A1 {

	public static void main(String[] args) {
	//Obter o sal�rio de 5 funcion�rios e informar a m�dia salarial dos funcion�rios.
	double soma = 0;
	double salario1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o sal�rio do primeiro funcion�rio: "));
	soma = soma + salario1;
	double salario2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o sal�rio do segundo funcion�rio: "));
	soma += salario2;	
	double salario3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o sal�rio do terceiro funcion�rio: "));
	soma += salario3;	
	double salario4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o sal�rio do quarto funcion�rio: "));
	soma += salario4;
	double salario5 = Double.parseDouble(JOptionPane.showInputDialog("Digite o sal�rio do quinto funcion�rio: "));
	soma += salario5;
	double media = soma / 5;
	JOptionPane.showMessageDialog(null, "Am�dia do sal�rio �: " + media); 
			
	}

}