package Aula2EstruturadeControle;

import javax.swing.JOptionPane;

public class Exercicio13 {

	public static void main(String[] args) {

		// 13. Fa�a um programa que obtenha um n�mero de 1 at� 12 e retorne o m�s
		// e a quantidade de dias que esse n�mero representa. Lembre-se dos
		// anos bissextos (Fevereiro possui 29 dias).

		int numero = Integer.parseInt(
				JOptionPane.showInputDialog("Digite um N�mero de 1 a 12 para saber o m�s e quantidade de dias: "));
		while (numero != 0 && numero != 1 && numero != 2 && numero != 3 && numero != 4 && numero != 5 && numero != 6
				&& numero != 7 && numero != 8 && numero != 9 && numero != 10 && numero != 11 && numero != 12)
			numero = Integer.parseInt(JOptionPane.showInputDialog("N�mero inv�lido, digite novamente: "));

		switch (numero) {

		case 1:
			numero = 1;
			JOptionPane.showMessageDialog(null,
					"O numero " + numero + "  � referente ao m�s de Janeiro, possue 30 dias");
			break;

		case 2:
			numero = 2;
			JOptionPane.showMessageDialog(null,"O numero " + numero + "  � referente ao m�s de Fevereiro, possue 28 dias");
			JOptionPane.showMessageDialog(null, "Se o Ano for bissexto, o m�s " + numero + " Fevereiro possue 29 dias");

			break;

		case 3:
			numero = 3;
			JOptionPane.showMessageDialog(null, "O numero " + numero + "  � referente ao m�s de Mar�o, possue 31 dias");
			break;

		case 4:
			numero = 4;
			JOptionPane.showMessageDialog(null, "O numero " + numero + "  � referente ao m�s de Abril, possue 30 dias");
			break;

		case 5:
			numero = 5;
			JOptionPane.showMessageDialog(null, "O numero " + numero + "  � referente ao m�s de Maio, possue 31 dias");
			break;

		case 6:
			numero = 6;
			JOptionPane.showMessageDialog(null, "O numero " + numero + "  � referente ao m�s de Junho, possue 30 dias");
			break;

		case 7:
			numero = 7;
			JOptionPane.showMessageDialog(null, "O numero " + numero + "  � referente ao m�s de Julho, possue 31 dias");
			break;

		case 8:
			numero = 8;
			JOptionPane.showMessageDialog(null,
					"O numero " + numero + "  � referente ao m�s de Agosto, possue 31 dias");
			break;

		case 9:
			numero = 9;
			JOptionPane.showMessageDialog(null,
					"O numero " + numero + "  � referente ao m�s de Setembro, possue 30 dias");
			break;

		case 10:
			numero = 10;
			JOptionPane.showMessageDialog(null,
					"O numero " + numero + "  � referente ao m�s de Outubro, possue 31 dias");
			break;

		case 11:
			numero = 11;
			JOptionPane.showMessageDialog(null,
					"O numero " + numero + "  � referente ao m�s de Novembro, possue 30 dias");
			break;

		case 12:
			numero = 12;
			JOptionPane.showMessageDialog(null,
					"O numero " + numero + "  � referente ao m�s de Dezembro, possue 31 dias");
			break;

		}
	}

}
