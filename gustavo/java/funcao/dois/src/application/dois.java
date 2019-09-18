package application;

import javax.swing.JOptionPane;

public class dois {

	public static void main(String[] args) {
		maiorMenor();
	}

	public static void maiorMenor() {
		int maior = 0;
		int menor = 0;
		int num = 0;
		int qtd = 5;
		for (int i = 0; i < qtd; i++) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite um num: "));
			if (i == 0) {
				maior = num;
				menor = num;
			} else {
				if (num > maior) {
					maior += num;
				}
				if (num < menor) {
					menor += num;
				}
			}
		}
		JOptionPane.showInputDialog(null, "Maior: " + maior + "\nMenor: " + menor);
	}

}

