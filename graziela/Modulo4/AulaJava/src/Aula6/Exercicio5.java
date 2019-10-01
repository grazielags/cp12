package Aula6;

import javax.swing.JOptionPane;

/*
 * 5) Escreva um procedimento que receba 3 valores reais X, Y e Z e que
 * verifique se esses valores podem ser os comprimentos dos lados de um triângulo e,
 * neste caso apresentar na tela qual o tipo de triângulo formado.
 * Para que X, Y e Z forme um triângulo é necessário que a seguinte propriedade seja satisfeita:
 * O comprimento de cada lado de um triângulo é menor do que a soma do comprimento
 * dos outros dois lados.
 * O procedimento deve identificar o tipo de triângulo formado observando as seguintes definições:
 * Triângulo Equilátero: os comprimentos dos 3 lados são iguais.
 * Triângulo Isósceles: os comprimentos de 2 lados são iguais.
 * Triângulo Escaleno: os comprimentos dos 3 lados são diferentes.
 */
public class Exercicio5 {
	public static void main(String[] args) {
		double x = Double.parseDouble(JOptionPane.showInputDialog("Digite o lado x do triângulo!"));
		double y = Double.parseDouble(JOptionPane.showInputDialog("Digite o lado y do triângulo!"));
		double z = Double.parseDouble(JOptionPane.showInputDialog("Digite o lado z do triângulo!"));
		triangulo(x, y, z);
	}

	public static void triangulo(double x, double y, double z) {
		if (x < (y + z) && y < (x + z) && z < (x + y)) {
			if (x == y && y == z) {
				JOptionPane.showMessageDialog(null, "Equilátero!");
			} else if (x != y && y != z && x != z) {
				JOptionPane.showMessageDialog(null, "Escaleno!");
			} else { //if ((x == y && x != z) || (x == z && x != y) || (z == x && z != y)) {
				JOptionPane.showMessageDialog(null, "Isóceles!");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Não é um triângulo!");
		}
	}
}
