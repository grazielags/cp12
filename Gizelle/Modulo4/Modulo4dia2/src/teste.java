import javax.swing.JOptionPane;

public class teste {

	public static void main(String[] args) {
// Crie uma calculadora usando a instru��o SWITCH, que pergunte qual das opera��es b�sicas quer fazer (+, -, * e /), 
//	em seguida pe�a os dois n�meros e mostre o resultado da opera��o matem�tica entre eles..

		double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro n�mero: "));
		double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo n�mero: "));
		char operacao = JOptionPane.showInputDialog("Digite (+, -, * e /) para a sua opera��o: ").charAt(0);
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
			System.out.println("Op��o inv�lida");
		}
	}
}