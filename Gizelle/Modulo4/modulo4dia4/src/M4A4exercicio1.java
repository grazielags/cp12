import javax.swing.JOptionPane;

public class M4A4exercicio1 {
// Leia um conjunto de notas, cuja quantidade seja determinada pelo usuário. 
//	Calcule a média de todas elas. Exiba o conjunto das notas maiores do que a média calculada. 
//	Em seguida, de forma agrupada, exiba o outro conjunto de notas (menores do que a média).


	public static void main(String[] args) {
		
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite número de alunos: "));
		int[]nota = new int[quantidade];
		double soma = 0;
		for (int posicao = 0; posicao < quantidade; posicao++) {
			nota[posicao] = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota dos alunos: "));
			soma = soma + nota[posicao];
		}
		double media = soma / (double)quantidade;
		
		String resultado = "Notas: ";
		for (int posicao = 0; posicao < quantidade; posicao++) {
			if (nota[posicao] > media) {
			resultado = resultado + "\n" + posicao + " - acima da média - " + nota[posicao];			
			}else if (nota[posicao] < media) {
			resultado = resultado + "\n" + posicao + " - abaixo da média - " + nota[posicao];
			}	
		}
		JOptionPane.showMessageDialog(null, resultado +
											"\nMédia das notas é: " + media);
	}
}
		