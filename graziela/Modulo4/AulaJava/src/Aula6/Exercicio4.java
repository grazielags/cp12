package Aula6;

import javax.swing.JOptionPane;

/*
 * 4) Faça um procedimento que recebe a idade de um nadador por parâmetro e apresente
 * a categoria desse nadador de acordo com a tabela abaixo:
 * Idade 							Categoria
 * 5 a 7 anos 						Infantil A
 * 8 a 10 anos 						Infantil B
 * 11-13 anos 						Juvenil A
 * 14-17 anos 						Juvenil B
 * Maiores de 18 anos (inclusive) 	Adulto
 */
public class Exercicio4 {
	public static void main(String[] args) {
		int idadeNadador = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do nadador!"));
		categoriaNadador(idadeNadador);
	}

	public static void categoriaNadador(int idade) {
		if (idade >= 5 && idade <= 7) {
			JOptionPane.showMessageDialog(null, "Infantil A");
		} else if (idade >= 8 && idade <= 10) {
			JOptionPane.showMessageDialog(null, "Infantil B");
		} else if (idade >= 11 && idade <= 13) {
			JOptionPane.showMessageDialog(null, "Juvenil A");
		} else if (idade >= 14 && idade <= 17) {
			JOptionPane.showMessageDialog(null, "Infantil B");
		} else if (idade >= 18) {
			JOptionPane.showMessageDialog(null, "Adulto");
		} else {
			JOptionPane.showMessageDialog(null, "Idade imprópria!");
		}
	}
}
