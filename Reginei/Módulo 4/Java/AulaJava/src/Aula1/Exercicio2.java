package Aula1;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {

		/*
		 * 2. Fa�a o programa acima calcular utilizando valores reais e depois imprimir
		 * na tela duas informa��es: Valor exato da �rea. Valor arredondado para
		 * inteiro.
		 */

		int a = 0;
		int b = 0;
		int B = 0;
		int area = 0;
		double areaAproximada = 0;

		b = Integer.parseInt(JOptionPane.showInputDialog("Digite a base menor: "));
		B = Integer.parseInt(JOptionPane.showInputDialog("Digite a base maior: "));
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura: "));

		area = (a * (b + B)) / 2;
		areaAproximada = (a * (b + B)) / 2;

		JOptionPane.showMessageDialog(null, "A area exata �: " + area + "\n e a area aproximada �: " + areaAproximada);

	}

}