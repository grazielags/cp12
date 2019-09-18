package Aula4;

import javax.swing.JOptionPane;

public class ExemploMedia {
	public static void main(String args[]) {
		int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor!"));
		int[] idades = new int[tamanho];
		double soma = 0;
		//.length obtém o tamanho do vetor.
		for (int posicao = 0; posicao < idades.length; posicao++) {
			idades[posicao] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número!"));
			soma = soma + idades[posicao];
		}
		double media = soma / (double )idades.length;
		
		String resultado = "Valores do vetor: ";
		for (int posicao = 0; posicao < idades.length; posicao++) {
			resultado = resultado + "\n" + posicao + " - " + idades[posicao];
		}
		
		JOptionPane.showMessageDialog(null, resultado + 
											"\nMédia das idade é: " + media);
	}
}
