package application;

import javax.swing.JOptionPane;

public class dois {

	public static void main(String[] args) {
		double valor = 0;
		double somaValores = 0;
		int contador = 0;
		while (valor >= 0) {
			valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor: "));
			if (valor >=0) {
				somaValores = valor;
				contador++;
			}
			
		}
		JOptionPane.showMessageDialog(null,  "Soma de valores: " + somaValores);
		JOptionPane.showMessageDialog(null,  "Contador: " + contador);
		JOptionPane.showMessageDialog(null,  "Média de valores: " + somaValores/contador);
	}

}
