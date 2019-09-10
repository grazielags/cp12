import javax.swing.JOptionPane;

public class Exercicio5M4A2 {

	public static void main(String[] args) {
// Faça um programa que leia o preço de 1 produto de 3 lojas diferentes e mostre na tela qual 
// das lojas você deveria comprar o produto.

		double valorA = Double.parseDouble(JOptionPane.showInputDialog("Digite valor loja A: "));
		double valorB = Double.parseDouble(JOptionPane.showInputDialog("Digite valor loja B: "));
		double valorC = Double.parseDouble(JOptionPane.showInputDialog("Digite valor loja C: "));
		double barato = valorA;
		String lojaMenorValor = "Loja A";
		
		if (valorB < barato) {
			barato = valorB;
			lojaMenorValor = "Loja B";
		} else if (valorC < barato) {
			barato = valorC;
			lojaMenorValor = "Loja B";			
		}
		JOptionPane.showMessageDialog(null, "O menor valor é " + barato + " da " + lojaMenorValor);
	}
}
