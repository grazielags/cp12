import javax.swing.JOptionPane;

public class Exercicio4M4A1 {

	public static void main(String[] args) {
	//Fa�a um programa que receba o valor do produto e o percentual de aumento que esse produto ter�. 
	// Ap�s isso apresente na tela o valor antigo e o valor ap�s o reajuste.
		
	double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto: "));
	double percentual = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do percentual: "));
	double valorReajustado = valor + ((valor*percentual)/100);
	JOptionPane.showMessageDialog(null, "Valor do produto antes do reajuste: " + valor
									+ "\nValor do produto ap�s o reajuste �: " + valorReajustado);
			
	}

}