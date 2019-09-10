package application;

import javax.swing.JOptionPane;

public class quatro {

	public static void main(String[] args) {
		
		int somaUm = 0;
		int somaDois = 0;
		int somaTres = 0;
		int somaQuatro = 0;
		int somaCinco = 0;
		int somaSeis = 0;
		int voto = 1;
		
		while (voto != 0) {
			for (int i=10; i>=0; i--) {
				voto = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite seu voto(1 a 6): "));
				if (voto == 1) {
					somaUm++;
				}else if(voto == 2) {
					somaDois++;
				}else if(voto == 3) {
					somaTres++;
				}else if(voto == 4) {
					somaQuatro++;
				}else if(voto == 5) {
					somaCinco++;
				}else if(voto == 6) {
					somaSeis++;
				}else {
					JOptionPane.showMessageDialog(null,  "Voto invalido!");
				}
			}
			JOptionPane.showMessageDialog(null,  "Total de votos para candidato UM: " + somaUm);
			JOptionPane.showMessageDialog(null,  "Total de votos para candidato DOIS: " + somaDois);
			JOptionPane.showMessageDialog(null,  "Total de votos para candidato TRES: " + somaTres);
			JOptionPane.showMessageDialog(null,  "Total de votos para candidato QUATRO: " + somaQuatro);
			JOptionPane.showMessageDialog(null,  "Total de votos para candidato NULO: " + somaCinco);
			JOptionPane.showMessageDialog(null,  "Total de votos para candidato BRANCO: " + somaSeis);
			
		}
	}

}
