import javax.swing.JOptionPane;

public class M4A3exercicio6 {
// Escrever um algoritmo que leia um n�mero n que indica quantos valores devem ser lidos a seguir.
//Para cada n�mero lido, mostre uma tabela contendo o valor lido e o fatorial deste valor.

	public static void main(String[]args) {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de valores que deseja ler: "));
		for (int posicao = 1; posicao <= num; posicao++) {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero que deseja saber o fatorial: "));
			int fatorial = 1;
			for (int numeroFatorial = numero; numeroFatorial > 0 ; numeroFatorial--) {
				fatorial = fatorial * numeroFatorial;
			}
			JOptionPane.showMessageDialog(null, "O fatorial do n�mero " + numero + " � " + fatorial);
		}
	}
}