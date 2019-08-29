package application;

import javax.swing.JOptionPane;

public class quatro {

	public static void main(String[] args) {
		char letra = JOptionPane.showInputDialog(null, "Digite uma letra para saber se a mesma é uma vogal ou consoante: ").toUpperCase().charAt(0);
		if ((letra == 'A') || (letra == 'E') || (letra == 'I') || (letra == 'O') || (letra == 'U') ){
			JOptionPane.showMessageDialog(null, "Esta letra é uma VOGAL!");
		}else {
			JOptionPane.showMessageDialog(null, "Esta letra é uma CONSOANTE!");
		}
	}

}
