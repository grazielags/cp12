package Aula1;

import javax.swing.JOptionPane;

public class Exercicio9 {
	public static void main(String[] args) {
		/*
		 * Ler uma temperatura em graus Celsius e apresentá-la convertida
		 * em graus Fahrenheit. A fórmula de conversão é: F=(9*C+160) / 5,
		 * sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.
		 */
		double celsius = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em Celsius!"));
		double fahrenheit = (9 * celsius + 160) / 5;
		JOptionPane.showMessageDialog(null, "A temperatura: " + celsius + " Celsius em Fahrenheit é: " + fahrenheit);
	}
}
