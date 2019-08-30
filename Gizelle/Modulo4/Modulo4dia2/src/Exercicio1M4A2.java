import javax.swing.JOptionPane;

public class Exercicio1M4A2 {

	public static void main(String[] args) {
	//ERRADO -  Faça um programa que obtenha 3 valores e diga qual o maior valor entre eles e qual o menor valor 
	// entre eles.
						
	double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
	double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro número: "));
	double valor3 = Double.parseDouble(JOptionPane.showInputDialog("Digite mais um número: "));
	
		if (valor1 > valor2 && valor1 > valor3) {
			System.out.println("Numero 1 é o maior com o valor " + valor1);
		}
		if (valor2 > valor1 && valor2 > valor3) {
			System.out.println("Numero 2 é o maior com o valor " + valor2);
		}
		if (valor3 > valor1 && valor3 > valor1) {
			System.out.println("Numero 3 é o maior com o valor " + valor3);
		}
	}
}