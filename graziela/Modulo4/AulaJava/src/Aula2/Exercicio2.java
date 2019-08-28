package Aula2;

import javax.swing.JOptionPane;

public class Exercicio2 {
	public static void main(String[] args) {
		/*
		 * Faça um programa que obtenha um ano e diga se esse ano é bissexto 
		 * ou não. Sabe-se que a fórmula para saber se um ano é bissexto 
		 * é a seguinte: 
		 * ano%4 == 0 && ano%100 != 0 || ano%400 == 0.
		 */
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite um ano!"));
		boolean isBissexto = ano%4 == 0 && ano%100 != 0 || ano%400 == 0;
		if (isBissexto) {
			JOptionPane.showMessageDialog(null, ano + " é bissexto!");
		} else {
			JOptionPane.showMessageDialog(null, ano + " não é bissexto!");
		}
		//O conteúdo abaixo é igual ao de cima.
		if (ano%4 == 0 && ano%100 != 0 || ano%400 == 0) {
			JOptionPane.showMessageDialog(null, ano + " é bissexto!");
		} else {
			JOptionPane.showMessageDialog(null, ano + " não é bissexto!");
		}
	}
}
