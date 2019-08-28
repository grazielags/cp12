package Aula2;

import javax.swing.JOptionPane;

public class Exercicio1 {
	public static void main(String[] args) {
		/*
		 * Faça um programa que obtenha 3 valores e diga qual o maior 
		 * valor entre eles e qual o menor valor entre eles.
		 */
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um número!"));
		int maior = valor;
		int menor = valor;
		valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um número!"));
		if (valor > maior) {
			maior = valor;
		} else if (valor < menor) {
			menor = valor;
		}
		valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um número!"));
		if (valor > maior) {
			maior = valor;
		} else if (valor < menor) {
			menor = valor;
		}
		JOptionPane.showMessageDialog(null, "O maior valor é: " + maior
											+ "\nO menor valor é: " + menor);
	}
}
