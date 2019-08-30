package application;

import javax.swing.JOptionPane;

public class tres {

	public static void main(String[] args) {
		char sexo = JOptionPane.showInputDialog(null, "Digite a letra que defina seu sexo (F ou M): ").toUpperCase().charAt(0);
		while ((sexo != 'F') && (sexo != 'M')) {
			sexo = JOptionPane.showInputDialog(null, "Digite a letra que defina seu sexo (F ou M): ").toUpperCase().charAt(0);
		}
		if (sexo == 'M'){
			JOptionPane.showMessageDialog(null, "Confirmando dados, sexo Masculino detectado.");	
		}
		if (sexo == 'F'){
				JOptionPane.showMessageDialog(null, "Confirmando dados, sexo Feminino detectado.");	
			}
	}

}
