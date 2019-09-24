package Aula6;

import javax.swing.JOptionPane;

/*
 * 3) Faça uma função que recebe um valor inteiro e verifica se o valor é par ou ímpar.
 * A função deve retornar um valor booleano.
 */
public class Exercicio3 {
	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número!"));
		boolean ehPar = isPar(numero);
		JOptionPane.showMessageDialog(null, numero + " é par? " + ehPar);
//		JOptionPane.showMessageDialog(null, numero + " é par? " + isPar(numero));
	}

	private static boolean isPar(int numero) {
		return (numero % 2) == 0;
//		if ((numero % 2) == 0) {
//			return true;
//		}
//		return false;
	}
}
