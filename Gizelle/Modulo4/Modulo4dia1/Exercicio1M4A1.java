/*
1 - Implemente um programa para calcular a �rea de um trap�zio, onde:

a = altura
b = base menor
B = base maior
�rea = (a . (b + B)) / 2

*/

import javax.swing.JOptionPane;
public class Exercicio1M4A1 {
    
	public static void main(String args[]) {

	int a = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor da altura: "));
	int b = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor da base menor: "));
	int c = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor da base maior: "));
	int area = (a*(b+c))/2;

	JOptionPane.showMessageDialog(null, "�rea do tri�ngulo �: " + area);


	}

}