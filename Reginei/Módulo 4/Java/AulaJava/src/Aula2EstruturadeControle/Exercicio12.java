package Aula2EstruturadeControle;

import javax.swing.JOptionPane;

public class Exercicio12 {

	public static void main(String[] args) {

		//12. Crie uma calculadora usando a instru��o SWITCH, que pergunte qual
		//das opera��es b�sicas quer fazer (+, -, * e /), em seguida pe�a os dois
		//n�meros e mostre o resultado da opera��o matem�tica entre eles.
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero para o c�lculo: "));
		char opera�ao = JOptionPane.showInputDialog("Entre com a opera��o (+, - , * ou /):").charAt(0);
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero para o c�lculo: "));
		
		int resultado = 0;
		
		switch(opera�ao) {
		case '+':
			resultado = num1 + num2;
			JOptionPane.showMessageDialog(null,num1 + " + " + num2 + " = " + resultado);
		break;
		
		case '-':
			resultado = num1 - num2;
			JOptionPane.showMessageDialog(null,num1 + " - " + num2 + " = " + resultado);
		break;

		case '*':
			resultado = num1 * num2;
			JOptionPane.showMessageDialog(null,num1 + " * " + num2 + " = " + resultado);
		break;

		case '/':
			resultado = num1 / num2;
			JOptionPane.showMessageDialog(null,num1 + " / " + num2 + " = " + resultado);
		break;


		}

	}

}
