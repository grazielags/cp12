package application;

import javax.swing.JOptionPane;

public class um {

	public static void main(String[] args) {
		int matriz[][] = new int[3][3];
		for (int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz[l].length; c++) {
		
			matriz[l][c] = Integer.parseInt(JOptionPane.showInputDialog("Digite um num: "));
			
	
			}	
		}
			JOptionPane.showMessageDialog(null,  	"Matriz 3x3: " + "\n[" + matriz[0][0] + "]" +
													 "[" + matriz[0][1] + "]" +
													 "[" + matriz[0][2] + "]" +
													 "\n[" + matriz[1][0] + "]" +
												     "[" + matriz[1][1] + "]" + 
													 "[" + matriz[1][2] + "]" +
													 "\n[" + matriz[2][0] + "]" +
												 	 "[" + matriz[2][1] + "]" +
												     "[" + matriz[2][2] + "]");
			if (matriz[0][0] == 1) && (matriz[1][1] == 1) && (matriz[2][2]) = 1){
				JOptionPane.showMessageDialog(null, "Matriz identidade: SIM!");
			}else {
				JOptionPane.showMessageDialog(null, "Matriz identidade: NAO!");
			}
	}
	
}
