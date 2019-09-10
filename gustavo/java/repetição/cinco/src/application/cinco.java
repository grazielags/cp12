package application;

import javax.swing.JOptionPane;

public class cinco {

	public static void main(String[] args) {
		
		int media = 0;
		int num = 1;
		int somaPares = 0;
		
		while (num != 0) {
			num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero: "));
			if (num % 2 == 0) {
				somaPares += num;
			}
			media++;	
		}
				
			JOptionPane.showMessageDialog(null,  "Total de num Pares digitados: " + somaPares);
			JOptionPane.showMessageDialog(null,  "Media de num Pares: " + somaPares/media);
			
			
		}
	}


