package Aula2EstruturadeControle;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {

		/*
		 * 3. Fa�a um programa que obtenha uma letra: F (Feminino) ou M (Masculino).
		 * Ap�s obter a letra, escreva na tela Feminino se a pessoa digitou a letra F, e
		 * Masculino e a pessoa digitou a letra M.
		 */

		char sexo = JOptionPane.showInputDialog("Entre com o sexo (F) Feminino ou (M) Masculino: ").toUpperCase()
				.charAt(0);
		if (sexo == 'F') {
			JOptionPane.showMessageDialog(null, sexo + ", �: Feminino! ");
		} else if (sexo == 'M') {
			JOptionPane.showMessageDialog(null, sexo + ", �: Masculino! ");
		} else {
			JOptionPane.showMessageDialog(null, sexo + "Sexo Inv�lido");
		}
	}

}
