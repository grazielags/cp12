import javax.swing.JOptionPane;

public class Exercicio2M4A2 {

	public static void main(String[] args) {
// Faça um programa que obtenha um ano e diga se esse ano é bissexto ou não.
// Sabe-se que a fórmula para saber se um ano é bissexto é a seguinte: 
		//ano%4 == 0 && ano%100 != 0 || ano%400 == 0.
	 
int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano: "));
	if (ano%4 == 0 && ano%100 != 0 || ano%400 == 0) {
		System.out.println("O" + ano + " é bissexto");
	} else {
		System.out.println("O" + ano + " não é bissexto");
	}
	}
}
