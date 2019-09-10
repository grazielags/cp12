package application;

import javax.swing.JOptionPane;

public class tres {

	public static void main(String[] args) {
		double joao = 1.50;
		double manoel = 1.10;
		int anos = 0;
		while(joao > manoel) {
			JOptionPane.showMessageDialog(null,  "Altura de João: " + joao);
			JOptionPane.showMessageDialog(null,  "Altura de Manoel: " + manoel);
			anos++;
			joao += 0.02;
			manoel += 0.03;

		}	
		JOptionPane.showMessageDialog(null,  "Quantidade de anos: " + anos);
		JOptionPane.showMessageDialog(null,  "Altura de João: " + joao);
		JOptionPane.showMessageDialog(null,  "Altura de Manoel: " + manoel);
	}

}
