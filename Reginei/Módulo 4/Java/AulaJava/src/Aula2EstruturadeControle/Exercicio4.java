package Aula2EstruturadeControle;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {

		/*
		 * 4. Faça um programa que obtenha uma letra e informe na tela se essa letra É
		 * uma vogal ou uma consoante.
		 */

		char letra = JOptionPane.showInputDialog(null, "Digite uma letra para verificação: ").toUpperCase().charAt(0);
		if ((letra == 'A') || (letra == 'E') || (letra == 'I') || (letra == 'O') || (letra == 'U') ){
			JOptionPane.showMessageDialog(null, "A letra " + letra +" é Vogal!");
		}else {
			JOptionPane.showMessageDialog(null, "A letra " + letra + " é Consoante!");
		}
	}

}
