package Aula1;

import javax.swing.JOptionPane;

public class Exercicio5 {

	public static void main(String[] args) {

		/*
		 * 5. Escrever um programa para determinar o consumo m�dio de um autom�vel sendo
		 * fornecida a dist�ncia total percorrida pelo autom�vel e o total de
		 * combust�vel gasto.
		 */

		double distancia = 0;
		double totalCombustivel = 0;
		double consumoMedio = 0;

		distancia = Double.parseDouble(JOptionPane.showInputDialog("Digite a dist�ncia total percorrida: "));
		totalCombustivel = Double.parseDouble(JOptionPane.showInputDialog("Digite o total de litros gastos: "));

		consumoMedio = distancia / totalCombustivel;

		JOptionPane.showMessageDialog(null, "O consumo m�dia foi: " + consumoMedio);

	}

}
