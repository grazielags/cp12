package aula4Vetor;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {

		//2. Crie um array (vetor) de inteiros “a” e um valor inteiro “x” e apresente
		//na tela a quantidade de vezes que “x” aparece no array (vetor) “a”.
		
		int[] a = new int[4];
		for (int posicao = 0; posicao < a.length; posicao++) {
			a[posicao] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para o Vetor: "));
		}
		int verifica = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para verificar a quantidade de vezes que ele aparece: "));
		int quantidade = 0;
		for (int posicao = 0; posicao < a.length; posicao++) {
			if (a[posicao] == verifica) {
				quantidade++;
			}
		}
		JOptionPane.showMessageDialog(null, "O número: " + verifica + " aparece " + quantidade + " vezes no vetor.");
	}
}