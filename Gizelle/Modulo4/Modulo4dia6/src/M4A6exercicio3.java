import javax.swing.JOptionPane;

public class M4A6exercicio3 {

	public static void main(String[] args) {
// Fa�a uma fun��o que recebe um valor inteiro e verifica se o valor � par ou �mpar. 
// A fun��o deve retornar um valor booleano.

		int valor = parImpar();
		JOptionPane.showMessageDialog(null, "O n�mero digitado � " + valor);
	}

	public static int parImpar() {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
			if((num  % 2) == 0) {
				JOptionPane.showMessageDialog(null, num + " � n�mero Par");;
			}else
				JOptionPane.showMessageDialog(null, num + " � n�mero Impar");
		
		return num;
	}
	
	
	
		

}
