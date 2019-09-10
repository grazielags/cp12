package Aula2EstruturadeControle;

import javax.swing.JOptionPane;

public class Exercicio9 {

	public static void main(String[] args) {
		
		/*9. Faça um programa que pergunte o preço de um produto e em quantas
		vezes irá ser pago o produto.
			1 = 20% de desconto
			2 até 5 = 5% de acréscimo
			6 até 10 = 15% de acréscimo
		*/
		
		double preço = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do Produto: "));
		int vezes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de parcelas: "));

		if (vezes == 1) {
			preço = preço - (preço*20)/100;
			JOptionPane.showMessageDialog(null, "O Preço do produto em " + vezes + " Vez é: R$ "+ preço);
		}
		if (vezes >=2 && vezes <=5) {
			preço = preço + (preço*5)/100;
			JOptionPane.showMessageDialog(null, "O Preço do produto em " + vezes + " Vez é: R$ "+ preço +"   =>   "+ vezes +" x " + preço/vezes);
		}
		if (vezes >=6 && vezes <=10) {
			preço = preço + (preço*15)/100;
			JOptionPane.showMessageDialog(null, "O Preço do produto em " + vezes + " Vez é: R$ "+ preço +"   =>   "+ vezes +" x " + preço/vezes);

		}
		
	}
}