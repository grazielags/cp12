package Aula6ProcedimentosFun��es;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String args[]) {

		// 2. Fa�a um procedimento que leia 5 valores inteiros e apresente o maior e
		// o menor deles.

		int numero = 0;
		int maior = 0;
		int menor = 0;
		for (int i = 0; i < 5; i++) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um N�mero: "));
			if (i == 0) {
				maior = numero;
				menor = numero;
			} else {
				if (numero > maior) {
					maior = numero;
				}
				if (numero < menor) {
					menor = numero;
				}
			}
		}
		JOptionPane.showMessageDialog(null, "maior: " + maior + "\nmenor: " + menor);
	}

}
