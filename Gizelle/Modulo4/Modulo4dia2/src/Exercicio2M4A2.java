import javax.swing.JOptionPane;

public class Exercicio2M4A2 {

	public static void main(String[] args) {
// Fa�a um programa que obtenha um ano e diga se esse ano � bissexto ou n�o.
// Sabe-se que a f�rmula para saber se um ano � bissexto � a seguinte: 
		//ano%4 == 0 && ano%100 != 0 || ano%400 == 0.
	 
int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano: "));
	if (ano%4 == 0 && ano%100 != 0 || ano%400 == 0) {
		System.out.println("O" + ano + " � bissexto");
	} else {
		System.out.println("O" + ano + " n�o � bissexto");
	}
	}
}
