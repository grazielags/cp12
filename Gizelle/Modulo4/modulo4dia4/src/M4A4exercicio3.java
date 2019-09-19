import javax.swing.JOptionPane;

public class M4A4exercicio3 {
// Escreva um programa que recebe um array (vetor) de números e devolve a posição onde se encontra o maior valor do array (vetor). 
// Se houver mais de um valor maior, devolver a posição da primeira ocorrência.
	
		
	public static void main(String[]args) {
		
		
		int[]numero = new int [5];
		int maior = 0;
		int posicaoMaior = 0;
		for (int posicao = 0; posicao < numero.length; posicao++) {
			numero[posicao] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
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
		JOptionPane.showMessageDialog(null, "Maior valor é " + maior +" na posição " + posicaoMaior);
	}
}