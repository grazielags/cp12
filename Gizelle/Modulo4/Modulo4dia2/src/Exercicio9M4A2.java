import javax.swing.JOptionPane;

public class Exercicio9M4A2 {

	public static void main(String[] args) {
//Faça um programa que pergunte o preço de um produto e em quantas vezes irá ser pago o produto.
//		1 = 20% de desconto
//		2 até 5 = 5% de acréscimo
//		6 até 10 = 15% de acréscimo

		double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço: "));
		int parcela = Integer.parseInt(JOptionPane.showInputDialog("Parcelas (1, 2 ou 6): "));
		
		if (parcela == 1) {
			double totalPreco = preco - (preco * (20.0 / 100.0));
				JOptionPane.showMessageDialog(null,"Em 1 parcelas o valor total é R$ " + totalPreco);
		}else if (parcela == 2) {
			double totalPreco = preco + (preco * (5.0 / 100.0));
			double valorParcela = totalPreco / 2;
				JOptionPane.showMessageDialog(null,"Em 2 parcelas o valor total é R$ " + totalPreco + ". Valor cada parcela é R$ " + valorParcela);
		}else if (parcela == 6) {
			double totalPreco = preco + (preco * (15.0 / 100.0));
			double valorParcela = totalPreco / 6;
				JOptionPane.showMessageDialog(null,"Em 2 parcelas o valor total é R$ " + totalPreco + ". Valor cada parcela é R$ " + valorParcela);
		}else
			JOptionPane.showMessageDialog(null,"Número parcela inválida");
	}
}