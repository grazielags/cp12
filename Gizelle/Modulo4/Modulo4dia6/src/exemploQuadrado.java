
import javax.swing.JOptionPane;

public class exemploQuadrado {
	public static void main(String[] args) {
		int numero = 10;
		String vetor[] = new String[3];
		int numero_quadrado = quadrado(numero, "Graziela", false, 'a', vetor);
		JOptionPane.showMessageDialog(null, numero + " elevado ao quadrado é " + numero_quadrado);
	}

	public static int quadrado(int num, String nome, boolean teste, char c, String[] vetor) {
		int quadrado;
		quadrado = num * num;
		return quadrado;
	}
}
