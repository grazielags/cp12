package Aula2EstruturadeControle;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {

/*2. Fa�a um programa que obtenha um ano e diga se esse ano � bissexto
	ou n�o. Sabe-se que a f�rmula para saber se um ano � bissexto � a
	seguinte: ano%4 == 0 && ano%100 != 0 || ano%400 == 0.*/
		
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o Ano a ser verificado: "));
		if(ano%4 == 0 && ano%100 != 0 || ano%400 == 0) {
			JOptionPane.showMessageDialog(null, ano + " � Bissexto");}
		else {
			JOptionPane.showMessageDialog(null, ano + " N�o � Bissexto");}
	}

}
