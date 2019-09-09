package Aula2EstruturadeControle;

import javax.swing.JOptionPane;

public class Exercicio11 {

	public static void main(String[] args) {

		// 11. Faça um programa que leia um número entre 0 e 10, e escreva este
		// número por extenso. Use o comando switch.

		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número de 0 a 10 a ser lido: "));
		while (numero != 0 && numero != 1 && numero != 2 && numero != 3 && numero != 4 && numero != 5 && numero != 6
				&& numero != 7 && numero != 8 && numero != 9 && numero != 10)
			numero = Integer.parseInt(JOptionPane.showInputDialog("Número inválido, digite novamente: "));

		switch (numero) {

		case 0:
			numero = 0;
			JOptionPane.showMessageDialog(null, "O numero " + numero + " digitado escrito por extenso é:  Zero");
			break;

		case 1:
			numero = 1;
			JOptionPane.showMessageDialog(null, "O numero " + numero + "  digitado escrito por extenso é:  um");
			break;

		case 2:
			numero = 2;
			JOptionPane.showMessageDialog(null, "O numero " + numero + " digitado escrito por extenso é:  Dois");
			break;

		case 3:
			numero = 3;
			JOptionPane.showMessageDialog(null, "O numero digitado " + numero + " escrito por extenso é:  Três");
			break;

		case 4:
			numero = 4;
			JOptionPane.showMessageDialog(null, "O numero digitado " + numero + " escrito por extenso é:  Quatro");
			break;

		case 5:
			numero = 5;
			JOptionPane.showMessageDialog(null, "O numero digitado " + numero + " escrito por extenso é:  Cinco");
			break;

		case 6:
			numero = 6;
			JOptionPane.showMessageDialog(null, "O numero digitado " + numero + " escrito por extenso é:  Seis");
			break;

		case 7:
			numero = 7;
			JOptionPane.showMessageDialog(null, "O numero digitado " + numero + " escrito por extenso é:  Sete");
			break;

		case 8:
			numero = 8;
			JOptionPane.showMessageDialog(null, "O numero digitado " + numero + " escrito por extenso é:  Oito");
			break;

		case 9:
			numero = 9;
			JOptionPane.showMessageDialog(null, "O numero digitado " + numero + " escrito por extenso é:  Nove");
			break;

		case 10:
			numero = 10;
			JOptionPane.showMessageDialog(null, "O numero digitado " + numero + " escrito por extenso é:  Dez");
			break;

		}
	}

}
