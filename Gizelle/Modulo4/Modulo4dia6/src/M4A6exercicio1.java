
import javax.swing.JOptionPane;

public class M4A6exercicio1 {

// Fa�a uma fun��o que leia 10 valores positivos e retorna a m�dia aritm�tica dos mesmos.

	public static void main(String[] args) {
		
		double media = mediaCalculado();
		JOptionPane.showMessageDialog(null, "M�dia: " + media);
	}
	
	
	public static double mediaCalculado() {
		int soma = 0;
		int numero = 0;
		int qtd = 10;
		for (int i = 0; i < qtd; i++) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
			soma += numero;
		}
		double media = soma / (double) qtd;
		return media;
	}

}