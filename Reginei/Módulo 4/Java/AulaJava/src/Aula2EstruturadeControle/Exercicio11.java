package Aula2EstruturadeControle;

import javax.swing.JOptionPane;

public class Exercicio11 {

	public static void main(String[] args) {

		// 11. Fa�a um programa que leia um n�mero entre 0 e 10, e escreva este
		// n�mero por extenso. Use o comando switch.

		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um N�mero de 0 a 10 a ser lido: "));
		while (numero != 0 && numero != 1 && numero != 2 && numero != 3 && numero != 4 && numero != 5 && numero != 6
				&& numero != 7 && numero != 8 && numero != 9 && numero != 10)
			numero = Integer.parseInt(JOptionPane.showInputDialog("N�mero inv�lido, digite novamente: "));

		switch (numero) {

		case 0:
			numero = 0;
			JOptionPane.showMessageDialog(null, "O numero " + numero + " digitado escrito por extenso �:  Zero");
			break;

		case 1:
			numero = 1;
			JOptionPane.showMessageDialog(null, "O numero " + numero + "  digitado escrito por extenso �:  um");
			break;

		case 2:
			numero = 2;
			JOptionPane.showMessageDialog(null, "O numero " + numero + " digitado escrito por extenso �:  Dois");
			break;

		case 3:
			numero = 3;
			JOptionPane.showMessageDialog(null, "O numero digitado " + numero + " escrito por extenso �:  Tr�s");
			break;

		case 4:
			numero = 4;
			JOptionPane.showMessageDialog(null, "O numero digitado " + numero + " escrito por extenso �:  Quatro");
			break;

		case 5:
			numero = 5;
			JOptionPane.showMessageDialog(null, "O numero digitado " + numero + " escrito por extenso �:  Cinco");
			break;

		case 6:
			numero = 6;
			JOptionPane.showMessageDialog(null, "O numero digitado " + numero + " escrito por extenso �:  Seis");
			break;

		case 7:
			numero = 7;
			JOptionPane.showMessageDialog(null, "O numero digitado " + numero + " escrito por extenso �:  Sete");
			break;

		case 8:
			numero = 8;
			JOptionPane.showMessageDialog(null, "O numero digitado " + numero + " escrito por extenso �:  Oito");
			break;

		case 9:
			numero = 9;
			JOptionPane.showMessageDialog(null, "O numero digitado " + numero + " escrito por extenso �:  Nove");
			break;

		case 10:
			numero = 10;
			JOptionPane.showMessageDialog(null, "O numero digitado " + numero + " escrito por extenso �:  Dez");
			break;

		}
	}

}
