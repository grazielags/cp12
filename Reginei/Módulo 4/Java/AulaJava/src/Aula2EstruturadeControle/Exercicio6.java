package Aula2EstruturadeControle;

import javax.swing.JOptionPane;

public class Exercicio6 {

	public static void main(String[] args) {

		/*
		 * 6. Faça um programa que leia 3 números e apresente-os em ordem crescente.
		 */

		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero: "));
		int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero: "));

		if (numero1 < numero2 && numero1 < numero3) {
            if (numero2 < numero3) {
    			JOptionPane.showMessageDialog(null,+ numero1 + "," + numero2 + "," + numero3);}

            } else {
    			JOptionPane.showMessageDialog(null,+ numero1 + "," + numero3 + "," + numero2);}
		
		
		if (numero2 < numero1 && numero2 < numero3) {
            if (numero1 < numero3) {
    			JOptionPane.showMessageDialog(null,+ numero2 + "," + numero1 + "," + numero3);}

            } else {
    			JOptionPane.showMessageDialog(null,+ numero2 + "," + numero3 + "," + numero1);}
		
		if (numero3 < numero1 && numero3 < numero2) {
            if (numero1 < numero2) {
    			JOptionPane.showMessageDialog(null,+ numero3 + "," + numero1 + "," + numero2);}

            } else {
    			JOptionPane.showMessageDialog(null,+ numero3 + "," + numero2 + "," + numero1);}

        
	}
}

