import javax.swing.JOptionPane;

public class Exercicio6M4A2 {

	public static void main(String[] args) {
		// Faça um programa que leia 3 números e apresente-os em ordem crescente.

		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite número 1: "));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite número 2: "));
		int num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite número 3: "));
		
		if (num1 < num2 && num1 < num3) {
            if (num2 < num3) {
                System.out.println(num1);
                System.out.println(num2);
                System.out.println(num3);
            } else {
                System.out.println(num1);
                System.out.println(num3);
                System.out.println(num2);
            }
        } else if (num2 < num1 && num2 < num3) {
            if (num1 < num3) {
                System.out.println(num2);
                System.out.println(num1);
                System.out.println(num3);
            } else {
            	System.out.println(num2);
                System.out.println(num3);
                System.out.println(num1);
            }
        } else {
            if (num1 < num2) {
                System.out.println(num3);
                System.out.println(num1);
                System.out.println(num2);
            } else {
                System.out.println(num3);
                System.out.println(num2);
                System.out.println(num1);
            }
        }
	}
}
