/*1. Implemente um programa para calcular a �rea de um trap�zio, onde:
a = altura
b = base menor
B = base maior
�rea = (a . (b + B)) / 2
*/

import javax.swing.JOptionPane;
public class exercicio1 {
public static void main(String args[]) {

int baseMaior = Integer.parseInt(JOptionPane.showInputDialog("Digite a base maior: "));

int baseMenor = Integer.parseInt(JOptionPane.showInputDialog("Digite a base menor: "));

int altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altuara: "));

int area = (int)(altura * (baseMenor + baseMaior)) / 2;

JOptionPane.showMessageDialog(null, "baseMaior: " + baseMaior
+ "\nbaseMenor: " + baseMenor
+ "\naltura: " + altura
+ "\n�rea: " + area);
}
}