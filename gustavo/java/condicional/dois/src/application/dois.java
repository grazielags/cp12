package application;

import javax.swing.JOptionPane;

public class dois {

	public static void main(String[] args) {
		int ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano desejado: "));
		String anoBissexto = "Não";
		if ((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0)) {
			anoBissexto = "Sim";
			
		}
		JOptionPane.showMessageDialog(null, "Ano escolhido: " + ano);
		JOptionPane.showMessageDialog(null, "Ano bissexto? " + anoBissexto);
	}

}
