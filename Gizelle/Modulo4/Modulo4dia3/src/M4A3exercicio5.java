import javax.swing.JOptionPane;

public class M4A3exercicio5 {
// Escreva um algoritmo que calcule a média dos números digitados pelo usuário, se eles forem pares. 
// Termine a leitura se o usuário digitar zero (0).

	public static void main(String[]args) {
		
		int numero = -1;
		int quantidade = 0;
		int somaNumero = 0;
		while (numero != 0) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
			if (numero != 0 && numero % 2 == 0);
			somaNumero += numero;	
			quantidade++;
		} 
		double media = somaNumero/	quantidade;
		JOptionPane.showMessageDialog(null, "Média dos números pares digitados é: " + media);
	}
}