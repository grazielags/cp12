package Aula2EstruturadeControle;

import javax.swing.JOptionPane;

public class Exercicio9 {

	public static void main(String[] args) {
		
		/*9. Fa�a um programa que pergunte o pre�o de um produto e em quantas
		vezes ir� ser pago o produto.
			1 = 20% de desconto
			2 at� 5 = 5% de acr�scimo
			6 at� 10 = 15% de acr�scimo
		*/
		
		double pre�o = Double.parseDouble(JOptionPane.showInputDialog("Digite o pre�o do Produto: "));
		int vezes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de parcelas: "));

		if (vezes == 1) {
			pre�o = pre�o - (pre�o*20)/100;
			JOptionPane.showMessageDialog(null, "O Pre�o do produto em " + vezes + " Vez �: R$ "+ pre�o);
		}
		if (vezes >=2 && vezes <=5) {
			pre�o = pre�o + (pre�o*5)/100;
			JOptionPane.showMessageDialog(null, "O Pre�o do produto em " + vezes + " Vez �: R$ "+ pre�o +"   =>   "+ vezes +" x " + pre�o/vezes);
		}
		if (vezes >=6 && vezes <=10) {
			pre�o = pre�o + (pre�o*15)/100;
			JOptionPane.showMessageDialog(null, "O Pre�o do produto em " + vezes + " Vez �: R$ "+ pre�o +"   =>   "+ vezes +" x " + pre�o/vezes);

		}
		
	}
}