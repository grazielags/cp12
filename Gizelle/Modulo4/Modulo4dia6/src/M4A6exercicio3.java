import javax.swing.JOptionPane;

public class M4A6exercicio3 {

	public static void main(String[] args) {
// Faça uma função que recebe um valor inteiro e verifica se o valor é par ou ímpar. 
// A função deve retornar um valor booleano.

		int valor = parImpar();
		JOptionPane.showMessageDialog(null, "O número digitado é " + valor);
	}

	public static int parImpar() {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
			if((num  % 2) == 0) {
				JOptionPane.showMessageDialog(null, num + " é número Par");;
			}else
				JOptionPane.showMessageDialog(null, num + " é número Impar");
		
		return num;
	}
	
	
	
		

}
