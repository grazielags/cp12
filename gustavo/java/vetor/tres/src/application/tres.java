package application;

import javax.swing.JOptionPane;

public class tres {
	
	public static void main(String[] args) {
		int[] vetor = new int[5];
		int maior = 0;
		int posicaoMaior = 0;
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um num: "));
			
			if (vetor[i] > maior) {
				maior = vetor[i];
				posicaoMaior =  i + 1;
			}
			
		}
		JOptionPane.showMessageDialog(null,  "O num: " + maior + " é o maior num na posição " + posicaoMaior + "!");

	}

}
