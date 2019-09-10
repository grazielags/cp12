package Aula3;

import javax.swing.JOptionPane;

public class Exercicio6 {
	public static void main(String[] args) {
		/*
		 * Escrever um algoritmo que leia um número n que indica quantos valores devem ser lidos a seguir.
		 * Para cada número lido, mostre uma tabela contendo o valor lido e o fatorial deste valor.
		 */
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de valores que deseja ler: "));
		for (int i = 1; i <= n; i++) {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número que deseja saber o fatorial: "));
			int fatorial = 1;
			for (int numeroFatorial = numero; numeroFatorial > 0 ; numeroFatorial--) {
				fatorial = fatorial * numeroFatorial;
			}
			JOptionPane.showMessageDialog(null, "A fatorial de " + numero + " é: " + fatorial);
		}
	}
}
