
/* 1. Implemente um programa para calcular a área de um trapézio, onde:
a = altura
b = base menor
B = base maior
área = (a . (b + B)) / 2 */

import javax.swing.JOptionPane;

public class Exercicio1 {
    public static void main(String args[]) {

        int altura = Integer.parseInt(JOptionPane.showInputDialog("escreva a altura: "));
        int baseMenor = Integer.parseInt(JOptionPane.showInputDialog("Escreva a base menor: "));
        int baseMaior = Integer.parseInt(JOptionPane.showInputDialog("Escreva a base maior: "));
        int area = (altura * (baseMenor + baseMaior)) / 2;
        float area2 = base * altura;
        JOptionPane.showMessageDialog(null, "\n a altura é :" + altura + "\n  a base menor é :" + baseMenor
                + "\n e a base maior é de : " + baseMaior + "\n e area é de " + area+"a area em valor real é de :"+area2);
    }
}