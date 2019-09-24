package Aula6;

import javax.swing.JOptionPane;

/*
 * 6) Faça uma função que recebe a média final de um aluno por parâmetro e retorna
 * o seu conceito, conforme a tabela abaixo:
 * Nota 			Conceito
 * de 0,0 a 4,9 	D
 * de 5,0 a 6,9 	C
 * de 7,0 a 8,9 	B
 * de 9,0 a 10,0 	A
 */
public class Exercicio6 {
	public static void main(String[] args) {
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1"));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2"));
		double media = (nota1 + nota2) / 2.0;
		String conceitoFinal = conceito(media);
		JOptionPane.showMessageDialog(null, "O conceito é: " + conceitoFinal);
	}
	
	public static String conceito(double media) {
		if (media >= 0 && media < 5) {
			return "D";
		} else if (media >= 5 && media < 7) {
			return "C";
		} else if (media >= 7 && media < 9) {
			return "B";
		} else if (media >= 9 && media <= 10) {
			return "A";
		}
		return "Conceito inválido!";
	}
}
