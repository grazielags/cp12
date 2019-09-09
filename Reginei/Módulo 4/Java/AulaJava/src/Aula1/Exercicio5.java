package Aula1;

import javax.swing.JOptionPane;

public class Exercicio5 {

	public static void main(String[] args) {

		/*
		 * 5. Escrever um programa para determinar o consumo médio de um automóvel sendo
		 * fornecida a distância total percorrida pelo automóvel e o total de
		 * combustível gasto.
		 */

		double distancia = 0;
		double totalCombustivel = 0;
		double consumoMedio = 0;

		distancia = Double.parseDouble(JOptionPane.showInputDialog("Digite a distância total percorrida: "));
		totalCombustivel = Double.parseDouble(JOptionPane.showInputDialog("Digite o total de litros gastos: "));

		consumoMedio = distancia / totalCombustivel;

		JOptionPane.showMessageDialog(null, "O consumo média foi: " + consumoMedio);

	}

}
