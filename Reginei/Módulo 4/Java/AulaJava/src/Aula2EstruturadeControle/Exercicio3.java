package Aula2EstruturadeControle;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {

		/*
		 * 3. Faça um programa que obtenha uma letra: F (Feminino) ou M (Masculino).
		 * Após obter a letra, escreva na tela Feminino se a pessoa digitou a letra F, e
		 * Masculino e a pessoa digitou a letra M.
		 */

		char sexo = JOptionPane.showInputDialog("Entre com o sexo (F) Feminino ou (M) Masculino: ").toUpperCase()
				.charAt(0);
		if (sexo == 'F') {
			JOptionPane.showMessageDialog(null, sexo + ", é: Feminino! ");
		} else if (sexo == 'M') {
			JOptionPane.showMessageDialog(null, sexo + ", é: Masculino! ");
		} else {
			JOptionPane.showMessageDialog(null, sexo + "Sexo Inválido");
		}
	}

}
