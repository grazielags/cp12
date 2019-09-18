package application;

import javax.swing.JOptionPane;

public class tres {

	public static void main(String[] args) {
		String agenda[][] = new String[7][24];
			
		int dia = 0;
		int hora = 0;
		String continua = "sim";
		while (continua.equalsIgnoreCase("sim")) {
			dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia da semana que deseja agendar: "));
			hora = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora da semana que deseja agendar: "));
			
			
		}

	}

}
