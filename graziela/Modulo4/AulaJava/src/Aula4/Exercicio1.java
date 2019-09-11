package Aula4;

import javax.swing.JOptionPane;

public class Exercicio1 {
	public static void main(String[] args) {
		/*
		 * Leia um conjunto de notas, cuja quantidade seja determinada pelo usuário.
		 * Calcule a média de todas elas. Exiba o conjunto das notas maiores do que a média calculada.
		 * Em seguida, de forma agrupada, exiba o outro conjunto de notas (menores do que a média).
		 */
		int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor!"));
		int notas[] = new int[tamanho];
		int soma = 0;
		for (int posicao = 0; posicao < notas.length; posicao++) {
			notas[posicao] = Integer.parseInt(JOptionPane.showInputDialog("Digite uma nota!"));
			soma += notas[posicao];
		}
		double media = soma / (double) notas.length;

		String notasMaiorMedia = "\nNotas maiores do que a média:";
		String notasMenorMedia = "\nNotas menores do que a média:";
		for (int posicao = 0; posicao < notas.length; posicao++) {
			if (notas[posicao] > media) {
				notasMaiorMedia += "\n" + posicao + " - " + notas[posicao];
			} else if (notas[posicao] < media) {
				notasMenorMedia += "\n" + posicao + " - " + notas[posicao];
			}
		}
		
		JOptionPane.showMessageDialog(null, "Média das notas: " + media +
											notasMaiorMedia + notasMenorMedia);
	}
}
