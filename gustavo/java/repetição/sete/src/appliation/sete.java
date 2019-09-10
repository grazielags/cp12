package appliation;
import java.util.Random;

import javax.swing.JOptionPane;

public class sete {

	public static void main(String[] args) {
		int teste = (int)(Math.random() * 11);
		int tentativas = 0;
		int tentar = 0;
		JOptionPane.showMessageDialog(null, "Numero aleatorio gerado: " + teste);
		while (tentar != teste) {
			teste = (int)(Math.random() * 11);
			tentar = Integer.parseInt(JOptionPane.showInputDialog(null, "Tente acertar o numero Randomico gerado: "));
			if (tentar != teste) {
				tentativas++;
				JOptionPane.showMessageDialog(null, "Errado! Numero aleatorio gerado: " + teste);
			}
		
		}

	}

}
