package application;
import  javax.swing.JOptionPane;

public class um {

	public static void main(String[] args) {
		
		double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro valor: "));
		double maiorValor = valor;
		valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo valor: "));
		if (valor > maiorValor) {
			maiorValor = valor;
		}
		valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o terceiro valor: "));
		if (valor > maiorValor) {
			maiorValor = valor;
		}
		JOptionPane.showMessageDialog(null, "O maior valor é o: " + maiorValor);
	}

}
