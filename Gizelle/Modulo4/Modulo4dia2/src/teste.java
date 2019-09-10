import javax.swing.JOptionPane;

public class teste {

	public static void main(String[] args) {
// Crie uma calculadora usando a instrução SWITCH, que pergunte qual das operações básicas quer fazer (+, -, * e /), 
//	em seguida peça os dois números e mostre o resultado da operação matemática entre eles..

		double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
		double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));
		char operacao = JOptionPane.showInputDialog("Digite (+, -, * e /) para a sua operação: ").charAt(0);
		double total;
		
		switch (operacao) {
		case '+':
			total = num1 + num2;
			JOptionPane.showMessageDialog(null,"Resultado da soma: " + num1 + " + " + num2 + " = " + total);
			break;
		case '-':
			total = num1 - num2;
			JOptionPane.showMessageDialog(null,"Resultado da soma: " + num1 + " + " + num2 + " = " + total);
			break;
		default:
			System.out.println("Opção inválida");
		}
	}
}