import javax.swing.JOptionPane;

public class M4A4exercicio3 {
// Escreva um programa que recebe um array (vetor) de n�meros e devolve a posi��o onde se encontra o maior valor do array (vetor). 
// Se houver mais de um valor maior, devolver a posi��o da primeira ocorr�ncia.
	
		
	public static void main(String[]args) {
		
		
		int[]numero = new int [5];
		int maior = 0;
		int posicaoMaior = 0;
		for (int posicao = 0; posicao < numero.length; posicao++) {
			numero[posicao] = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
			if (posicao ==0) {
				maior = numero[posicao];
				posicaoMaior = posicao;
			}else if (numero[posicao] >maior) {
				maior = numero[posicao];
				posicaoMaior = posicao;
			}
		}
		for (int posicao = 0; posicao < numero.length; posicao++) {
			System.out.println(numero[posicao]);
		}
		JOptionPane.showMessageDialog(null, "Maior valor � " + maior +" na posi��o " + posicaoMaior);
	}
}