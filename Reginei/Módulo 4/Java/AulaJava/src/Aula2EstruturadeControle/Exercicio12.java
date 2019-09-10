package Aula2EstruturadeControle;

import javax.swing.JOptionPane;

public class Exercicio12 {

	public static void main(String[] args) {

		//12. Crie uma calculadora usando a instrução SWITCH, que pergunte qual
		//das operações básicas quer fazer (+, -, * e /), em seguida peça os dois
		//números e mostre o resultado da operação matemática entre eles.
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número para o cálculo: "));
		char operaçao = JOptionPane.showInputDialog("Entre com a operação (+, - , * ou /):").charAt(0);
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número para o cálculo: "));
		
		int resultado = 0;
		
		switch(operaçao) {
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
