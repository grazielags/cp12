import javax.swing.JOptionPane;

public class Exercicio8M4A1 {

	public static void main(String[] args) {
	//Escrever um programa em que leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma 
	// que a variável A passe a possuir o valor da variável B e a variável B passe a possuir o valor da variável A. 
	// Apresentar os valores trocados.

		double A = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para A: "));
		double B = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para B: "));
		double C = A;
		A = B;
		B = C;

		
		JOptionPane.showMessageDialog(null, "A = " + A + "  e B = " + B);
			
	}

}