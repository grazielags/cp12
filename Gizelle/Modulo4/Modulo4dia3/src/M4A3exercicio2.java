import javax.swing.JOptionPane;

public class M4A3exercicio2 {
// Construir um algoritmo que calcule a média aritmética de vários valores inteiros positivos, lidos externamente. 
// O final da leitura acontecerá quando for lido um valor negativo.

	public static void main(String[]args) {
		
		int numero = 0;
		int contador = 0;
		int somaNumero = 0;
		while(numero >= 0) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor positivo para adicionar e um negativo para parar a contagem: "));
			if (numero>= 0) {
				somaNumero += numero;
				contador++;
			}
		}
		double media = somaNumero / (double) contador;
		JOptionPane.showMessageDialog(null, "A média dos valores positivos digitados é: " + media);
	}
}
