import javax.swing.JOptionPane;

public class M4A6exercicio3 {

	public static void main(String[] args) {
// Faça uma função que recebe um valor inteiro e verifica se o valor é par ou ímpar. 
// A função deve retornar um valor booleano.

	
		for (int i = 0; i < 1; i++) {
			if((ParImpar()  % 2) == 0) {
				JOptionPane.showMessageDialog(null, ParImpar() + " é número Par");;
			}else
				JOptionPane.showMessageDialog(null, ParImpar() + " é número Impar");
		}
	}

	public static int ParImpar() {
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		return valor;
	}

}
