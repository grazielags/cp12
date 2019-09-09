package Aula2EstruturadeControle;

import javax.swing.JOptionPane;

public class Exercicio8 {

	public static void main(String[] args) {

		/*
		 * 8. Faça um programa que receba a idade de uma pessoa e mostre na saída em
		 * qual categoria ela se encontra:
		 *  10-14 - infantil 
		 *  15-17 - juvenil 
		 *  18-25 - adulto
		 */

		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a Idade da Pessoa: "));

		if (idade >=10 && idade <= 14) {
			JOptionPane.showMessageDialog(null, "Idade " + idade + " Anos : Categoria Infantil");
		}
		
		if (idade >= 15 && idade <=17) {
			JOptionPane.showMessageDialog(null, "Idade " + idade + " Anos : Categoria Juvenil");
		}
		
		if(idade >= 18 && idade <=25){
			JOptionPane.showMessageDialog(null, "Idade " + idade + " Anos : Categoria Adulto");
		}
		else if (idade > 25) {
			JOptionPane.showMessageDialog(null, "Idade " + idade + " Anos : Fora das Categorias");

		}
	}
}