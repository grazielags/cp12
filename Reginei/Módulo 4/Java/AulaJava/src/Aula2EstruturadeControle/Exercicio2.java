package Aula2EstruturadeControle;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {

/*2. Faça um programa que obtenha um ano e diga se esse ano é bissexto
	ou não. Sabe-se que a fórmula para saber se um ano é bissexto é a
	seguinte: ano%4 == 0 && ano%100 != 0 || ano%400 == 0.*/
		
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o Ano a ser verificado: "));
		if(ano%4 == 0 && ano%100 != 0 || ano%400 == 0) {
			JOptionPane.showMessageDialog(null, ano + " É Bissexto");}
		else {
			JOptionPane.showMessageDialog(null, ano + " Não é Bissexto");}
	}

}
