import javax.swing.JOptionPane;

public class M4A6exercicio3 {

	public static void main(String[] args) {
// Fa�a uma fun��o que recebe um valor inteiro e verifica se o valor � par ou �mpar. 
// A fun��o deve retornar um valor booleano.

	
		for (int i = 0; i < 1; i++) {
			if((ParImpar()  % 2) == 0) {
				JOptionPane.showMessageDialog(null, ParImpar() + " � n�mero Par");;
			}else
				JOptionPane.showMessageDialog(null, ParImpar() + " � n�mero Impar");
		}
	}

	public static int ParImpar() {
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
		return valor;
	}

}
