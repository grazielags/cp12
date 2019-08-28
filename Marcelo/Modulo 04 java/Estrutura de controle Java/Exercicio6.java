/*
6. Faça um programa que leia 3 números e apresente-os em ordem
crescente.
*/

import javax.swing.JOptionPane;
public class Exercicio6 {
    public static void main(String args[]) {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o numero 1: "));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o numero 2: "));
        int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o numero 3: "));

        if (numero1< numero2 && numero1< numero3 ){
            JOptionPane.showMessageDialog(null,numero1);
            if (numero2 < numero3) {
                JOptionPane.showMessageDialog(null,numero2);
                JOptionPane.showMessageDialog(null,numero3);
            } else {
                JOptionPane.showMessageDialog(null,numero3);
                JOptionPane.showMessageDialog(null,numero2);
            }
        } else if (numero2 < numero1 && numero2 < numero3 ){
            JOptionPane.showMessageDialog(null,numero2);
            if (numero1 < numero3) {
                JOptionPane.showMessageDialog(null,numero1);
                JOptionPane.showMessageDialog(null,numero3);
            } else {
                JOptionPane.showMessageDialog(null,numero3);
                JOptionPane.showMessageDialog(null,numero1);
            }
        } else if (numero3 < numero1 && numero3 < numero2){
            JOptionPane.showMessageDialog(null,numero3);
            if (numero1 < numero2) {
                JOptionPane.showMessageDialog(null,numero1);
                JOptionPane.showMessageDialog(null,numero2);
            } else {
                JOptionPane.showMessageDialog(null,numero2);
                JOptionPane.showMessageDialog(null,numero1);
            }
        }
    }
}

