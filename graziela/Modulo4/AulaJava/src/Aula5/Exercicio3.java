package Aula5;

import javax.swing.JOptionPane;

public class Exercicio3 {
	public static void main(String[] args) {
		/*
		 * Construa uma agenda médica, com os horários marcados para cada paciente.
		 * Será uma matriz 7 x 24, ou seja, contendo 7 dias e 24 horas no dia.
		 */
		String agenda[][] = new String[7][24];

		int dia = 0;
		int hora = 0;
		String continua = "sim";
		while (continua.equalsIgnoreCase("sim")) {
			dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia da semana que deseja agendar!"));
			hora = Integer.parseInt(JOptionPane.showInputDialog("Digite o horário desejado!"));
			agenda[dia][hora] = JOptionPane.showInputDialog("Digite o nome do paciente!");
			continua = JOptionPane.showInputDialog("Deseja agendar mais algum paciente? (Sim/Não)");
		}
		
		
		String resultado = "Agenda semana: ";
		for (int linha = 0; linha < agenda.length; linha++) {
			for (int coluna = 0; coluna < agenda[linha].length; coluna++) {
				if (agenda[linha][coluna] != null) {
					resultado += "\nDia: " + linha + " Horário: " + coluna + " -> " + agenda[linha][coluna];
				}
			}
		}
		
		JOptionPane.showMessageDialog(null, resultado);
	}
}
