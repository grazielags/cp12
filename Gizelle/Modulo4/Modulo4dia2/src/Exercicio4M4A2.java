import javax.swing.JOptionPane;

public class Exercicio4M4A2 {

	public static void main(String[] args) {
// Fa�a um programa que obtenha uma letra e informe na tela se essa letra � uma vogal ou uma consoante.


char letra = JOptionPane.showInputDialog("Digite uma letra somente: ").charAt(0);

	if (letra == 'a' || letra == 'e'|| letra == 'i'|| letra == 'o'|| letra == 'u') {
		System.out.println("Esta letra � uma Vogal");
	} else {
		System.out.println("Esta letra � uma consoante");
	}
	}
}