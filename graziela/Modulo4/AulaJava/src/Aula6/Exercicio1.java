package Aula6;

import javax.swing.JOptionPane;

/*
 * 1) Faça uma função que leia 10 valores positivos e retorna a média aritmética dos mesmos.
 */
public class Exercicio1 {
	public static void main(String[] args) {
		double media = mediaCalculado();
		JOptionPane.showMessageDialog(null, "Média: " + media);
	}

	public static double mediaCalculado() {
		int soma = 0;
		int numero = 0;
		int qtd = 10;
		for (int i = 0; i < qtd; i++) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número!"));
			soma += numero;
		}
		double media = soma / (double) qtd;
		return media;
	}
}
