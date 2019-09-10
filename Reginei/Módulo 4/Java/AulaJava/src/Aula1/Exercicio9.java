package Aula1;

import javax.swing.JOptionPane;

public class Exercicio9 {

	public static void main(String[] args) {

		/*
		 * 9. Ler uma temperatura em graus Celsius e apresentá-la convertida em graus
		 * Fahrenheit. A fórmula de conversão é: F=(9*C+160) / 5, sendo F a temperatura
		 * em Fahrenheit e C a temperatura em Celsius.
		 */

		int celsius = 0;
		int fahrenheit = 0;

		celsius = Integer.parseInt(JOptionPane.showInputDialog("Digite a temperatura em Celsius: "));

		fahrenheit = (9 * celsius + 160) / 5;

		JOptionPane.showMessageDialog(null,
				"Temperatura em celsius: " + celsius + "\n Celsius convertido em Fahrenheit: " + fahrenheit);

	}

}
