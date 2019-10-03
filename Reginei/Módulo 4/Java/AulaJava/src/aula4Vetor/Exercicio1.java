package aula4Vetor;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		// 1. Leia um conjunto de notas, cuja quantidade seja determinada pelo
		// usuário. Calcule a média de todas elas. Exiba o conjunto das notas
		// maiores do que a média calculada. Em seguida, de forma agrupada,
		// exiba o outro conjunto de notas (menores do que a média).

		int qtdnotas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Notas: "));
		int[] notas = new int[qtdnotas];
		double media = 0;
		double soma = 0;

		for (int posicao = 0; posicao < notas.length; posicao++) {
			notas[posicao] = Integer.parseInt(JOptionPane.showInputDialog("Digite uma Nota: "));
			soma = soma + notas[posicao];
		}

		media = soma / qtdnotas;

		String notasMaiores = "\nNotas Maiores do que a Média: ";
		String notasMenores = "\nNotas Menores do que a Média: ";

		for (int posicao = 0; posicao < notas.length; posicao++) {
			if (notas[posicao] > media) {
				notasMaiores += "\n" + " posição " + posicao + " = " + notas[posicao];
			} else if (notas[posicao] < media) {
				notasMenores += "\n" + " posição " + posicao + " = " + notas[posicao];
			}
		}
		JOptionPane.showMessageDialog(null, "Média das Notas: " + media + notasMaiores + notasMenores);
	}

}