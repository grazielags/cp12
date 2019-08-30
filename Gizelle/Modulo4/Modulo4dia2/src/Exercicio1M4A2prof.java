import javax.swing.JOptionPane;

public class Exercicio1M4A2prof {

	public static void main(String[] args) {
	//ERRADO -  Faça um programa que obtenha 3 valores e diga qual o maior valor entre eles e qual o menor valor 
	// entre eles.
						
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		int maior = valor;
		int menor = valor;
		valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		if (valor > maior) {
			maior = valor;
		} else if (valor < maior) {
			menor = valor;
		}
		valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		if (valor > maior) {
			maior = valor;
		} else if (valor < maior) {
			menor = valor;
		}	
		JOptionPane.showMessageDialog(null, "Maior valor é: " + maior + " e menor valor é: " + menor);
	}
}