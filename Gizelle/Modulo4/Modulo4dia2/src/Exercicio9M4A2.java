import javax.swing.JOptionPane;

public class Exercicio9M4A2 {

	public static void main(String[] args) {
//Fa�a um programa que pergunte o pre�o de um produto e em quantas vezes ir� ser pago o produto.
//		1 = 20% de desconto
//		2 at� 5 = 5% de acr�scimo
//		6 at� 10 = 15% de acr�scimo

		double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o pre�o: "));
		int parcela = Integer.parseInt(JOptionPane.showInputDialog("Parcelas (1, 2 ou 6): "));
		
		if (parcela == 1) {
			double totalPreco = preco - (preco * (20.0 / 100.0));
				JOptionPane.showMessageDialog(null,"Em 1 parcelas o valor total � R$ " + totalPreco);
		}else if (parcela == 2) {
			double totalPreco = preco + (preco * (5.0 / 100.0));
			double valorParcela = totalPreco / 2;
				JOptionPane.showMessageDialog(null,"Em 2 parcelas o valor total � R$ " + totalPreco + ". Valor cada parcela � R$ " + valorParcela);
		}else if (parcela == 6) {
			double totalPreco = preco + (preco * (15.0 / 100.0));
			double valorParcela = totalPreco / 6;
				JOptionPane.showMessageDialog(null,"Em 2 parcelas o valor total � R$ " + totalPreco + ". Valor cada parcela � R$ " + valorParcela);
		}else
			JOptionPane.showMessageDialog(null,"N�mero parcela inv�lida");
	}
}