package application;

import javax.swing.JOptionPane;

public class um {

	public static void main(String[] args) {
		int qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidades de notas que deseja inserir: "));
		double[] notas = new double[qtd];
		double soma = 0;
		double maiorQueMedia = 0;
		double menorQueMedia = 0;
		for (int i=0; i<qtd; i++) {
			notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite uma nota: "));
			soma = soma + notas[i];
		}
		double media = soma / (double)qtd;
		for (int i=0; i<qtd; i++) {
			if (notas[i] < media) {
				menorQueMedia = menorQueMedia + notas[i];
			}else if(notas[i] > media) {
				maiorQueMedia = menorQueMedia + notas[i];
			}
		}
		
		
		String resultado = "Media igual a: ";
		JOptionPane.showMessageDialog(null,  resultado + media + "!");
		JOptionPane.showMessageDialog(null,  "Menor que media: " + menorQueMedia);
		JOptionPane.showMessageDialog(null,  "Maior que media: " + maiorQueMedia);
	}

}
