import javax.swing.JOptionPane;

public class M4A4exercicio3 {
// Escreva um programa que recebe um array (vetor) de n�meros e devolve a posi��o onde se encontra o maior valor do array (vetor). 
// Se houver mais de um valor maior, devolver a posi��o da primeira ocorr�ncia.
		
	public static void main(String[]args) {
		
		
		int[]vetor = new int [5];
		int numero = 0;	
		int maior = 0;
		int posicaoMaior = -1;
		for (int posicao = 0; posicao < vetor.length; posicao++) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
			if (numero > maior) {
				maior = numero;
				posicaoMaior = posicao--;
			}	
		}
		JOptionPane.showMessageDialog(null, "Maior numero " + maior +" na posi��o " + posicaoMaior);
	}
}