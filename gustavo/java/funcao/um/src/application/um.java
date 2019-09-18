package application;

import javax.swing.JOptionPane;

public class um {

	public static void main(String[] args) {
		double media = mediaCalculado();
		JOptionPane.showMessageDialog(null, "Media: " + media);
	}
	
	public static double mediaCalculado() {
		int soma = 0;
		int num = 0;
		int qtd = 10;
		for (int i = 0; i < qtd; i++) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite um num: "));
			soma += num;
		}
		double media = soma / (double) qtd;
		return media;
	}

}
