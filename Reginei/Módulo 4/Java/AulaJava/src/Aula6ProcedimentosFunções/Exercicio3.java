package Aula6ProcedimentosFun��es;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {

		// 3. Fa�a uma fun��o que recebe um valor inteiro e verifica se o valor � par
		// ou �mpar. A fun��o deve retornar um valor booleano.

		int valor = verificaPar();
		boolean ispar = true;
	}

	public static int verificaPar() {
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um Valor: "));

		if (valor % 2 == 0)
			JOptionPane.showMessageDialog(null, "� par");

		else if (valor % 2 != 0)
			JOptionPane.showMessageDialog(null, "� impar");

		return valor;
	}
}
