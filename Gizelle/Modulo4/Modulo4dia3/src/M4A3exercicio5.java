import javax.swing.JOptionPane;

public class M4A3exercicio5 {
// Escreva um algoritmo que calcule a m�dia dos n�meros digitados pelo usu�rio, se eles forem pares. 
// Termine a leitura se o usu�rio digitar zero (0).

	public static void main(String[]args) {
		
		int numero = -1;
		int quantidade = 0;
		int somaNumero = 0;
		while (numero != 0) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
			if (numero != 0 && numero % 2 == 0);
			somaNumero += numero;	
			quantidade++;
		} 
		double media = somaNumero/	quantidade;
		JOptionPane.showMessageDialog(null, "M�dia dos n�meros pares digitados �: " + media);
	}
}