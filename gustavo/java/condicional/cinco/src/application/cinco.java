package application;

import javax.swing.JOptionPane;

public class cinco {

	public static void main(String[] args) {
		double valorA = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto na loja A: "));
		double valorB = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto na loja B: "));
		double valorC = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto na loja C: "));
		
		if (valorA < valorB && valorA < valorC) {
			JOptionPane.showMessageDialog(null,  "O menor valor �: " + valorA + " na loja A!");
		}else if (valorB < valorA && valorB < valorC) {
			JOptionPane.showMessageDialog(null,  "O menor valor �: " + valorB + " na loja B!");
		}else {
			JOptionPane.showMessageDialog(null,  "O menor valor �: " + valorC + " na loja C!");
		}
		
		if (valorA == valorB && valorA == valorC) {
			JOptionPane.showMessageDialog(null,  "O valor � igual em todas as lojas!");
		}
	}
}
