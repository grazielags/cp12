package Aula2;

import javax.swing.JOptionPane;

public class ExemploCondicaoSimples {
	public static void main(String args[]) {
		int idade = 17;
		if (idade >= 18) {
//			System.out.println("Maior de idade");
			JOptionPane.showMessageDialog(null, "Maior de idade");
		}
//		System.out.println("Fim do programa");
		JOptionPane.showMessageDialog(null, "Fim do programa");
	}
}