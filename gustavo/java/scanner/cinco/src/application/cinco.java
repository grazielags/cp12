package application;

import javax.swing.JOptionPane;

public class cinco {

	public static void main(String[] args) {

		double distancia = Double.parseDouble(JOptionPane.showInputDialog("Digite a distancia percorrida: "));
		double combustivel = Double.parseDouble(JOptionPane.showInputDialog("Digite o total de combustivo gasto em litros: "));
		
		double consumoMedia = distancia/combustivel;
				
		JOptionPane.showMessageDialog(null, "O consumo medio é de: " + consumoMedia);
	}

}
