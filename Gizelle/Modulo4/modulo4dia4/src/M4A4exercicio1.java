import javax.swing.JOptionPane;

public class M4A4exercicio1 {
// Leia um conjunto de notas, cuja quantidade seja determinada pelo usu�rio. 
//	Calcule a m�dia de todas elas. Exiba o conjunto das notas maiores do que a m�dia calculada. 
//	Em seguida, de forma agrupada, exiba o outro conjunto de notas (menores do que a m�dia).


	public static void main(String[] args) {
		
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite n�mero de alunos: "));
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
			resultado = resultado + "\n" + posicao + " - acima da m�dia - " + nota[posicao];			
			}else if (nota[posicao] < media) {
			resultado = resultado + "\n" + posicao + " - abaixo da m�dia - " + nota[posicao];
			}	
		}
		JOptionPane.showMessageDialog(null, resultado +
											"\nM�dia das notas �: " + media);
	}
}
		