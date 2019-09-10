package application;

import javax.swing.JOptionPane;

public class seis {

	public static void main(String[] args) {
		int n = 0;
		int num = 0;
		int fatorial = 1;
		n = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos valores devem ser lidos: "));
		for (int i = 1; i <= n; i++) {
			num = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o numero: "));
			int numAnterior = num;
			JOptionPane.showMessageDialog(null,  "Numero: " + num);
			while(numAnterior >= 1) {
				fatorial = fatorial * numAnterior;
				numAnterior--;
			}
			JOptionPane.showMessageDialog(null,  "Fatorial do numero " + num + ": " + fatorial);
		}

	}
}
