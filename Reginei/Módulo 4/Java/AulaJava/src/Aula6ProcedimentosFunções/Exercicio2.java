package Aula6ProcedimentosFunções;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String args[]) {

		// 2. Faça um procedimento que leia 5 valores inteiros e apresente o maior e
		// o menor deles.

		int numero = 0;
		int maior = 0;
		int menor = 0;
		for (int i = 0; i < 5; i++) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número: "));
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
