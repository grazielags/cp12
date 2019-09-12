import javax.swing.JOptionPane;

public class M4A4exercicio2 {
// Crie um array (vetor) de inteiros “a” e um valor inteiro “x” e apresente na tela a quantidade de vezes que “x” aparece no array (vetor) “a”.

	public static void main(String[]args) {
		
		int[]a = new int[5];
		for (int posicao = 0; posicao < a.length; posicao++) {
			a[posicao] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		}	
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número que deseja verifica a quantidade: "));
		int quantidade = 0;
		for (int posicao = 0; posicao < a.length; posicao++) {
			if (a[posicao]== x) {
				quantidade++;
			}
		}
		JOptionPane.showMessageDialog(null, "O número " + x + " aparece " + quantidade + " vezesno vetor.");
	}
}