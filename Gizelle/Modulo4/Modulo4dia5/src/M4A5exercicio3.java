import javax.swing.JOptionPane;

public class M4A5exercicio3 {

	public static void main(String[] args) {
// Construa uma agenda m�dica, com os hor�rios marcados para cada paciente. 
// Ser� uma matriz 7 x 24, ou seja, contendo 7 dias e 24 horas no dia.

		String agenda [][] = new String [7][24];
		int dia = 0;
		int hora = 0;
		String continua = "Sim";
		while (continua.equalsIgnoreCase("Sim")){
			dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia do m�s desejado: : "));
			hora = Integer.parseInt(JOptionPane.showInputDialog("Digite o hor�rio desejado:  "));
			agenda[dia][hora] = JOptionPane.showInputDialog("Digite o nome do paciente: ");
			continua = JOptionPane.showInputDialog("Deseja agendar mais algum paciente? (Sim/N�o)");
		}	
		String resultado = "Agenda da semana";
		for (int linha = 0; linha < agenda.length; linha++) {
			for (int coluna = 0; coluna < agenda[linha].length; coluna++) {
				if (agenda[linha][coluna] != null) {
					resultado += "\nDia: " + linha + "/ Hor�rio: " + coluna + "/ Paciente: " + agenda [linha][coluna];	
				}
			}
		}
		JOptionPane.showMessageDialog(null, resultado);	
	}

}
