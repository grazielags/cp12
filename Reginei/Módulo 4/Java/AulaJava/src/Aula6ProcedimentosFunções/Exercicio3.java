package Aula6ProcedimentosFunções;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {

		// 3. Faça uma função que recebe um valor inteiro e verifica se o valor é par
		// ou ímpar. A função deve retornar um valor booleano.

		int valor = verificaPar();
		boolean ispar = true;
	}

	public static int verificaPar() {
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um Valor: "));

		if (valor % 2 == 0)
			JOptionPane.showMessageDialog(null, "é par");

		else if (valor % 2 != 0)
			JOptionPane.showMessageDialog(null, "é impar");

		return valor;
	}
}
