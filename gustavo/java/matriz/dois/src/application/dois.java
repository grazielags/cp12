package application;

import javax.swing.JOptionPane;

public class dois {

	public static void main(String[] args) {
		int matriz[][] = new int[4][4];
		int maior = 0;
		int menor = 0;
		String resultado = "Matriz 4x4: \n";
		for (int l = 0; l < matriz.length; l++) {
			resultado += "\n ";
			for (int c = 0; c < matriz[l].length; c++) {
			matriz[l][c] = Integer.parseInt(JOptionPane.showInputDialog("Digite o num para [" + l + "] [" + c + "]"));
			resultado += matriz[l][c];
				if (matriz[l][c] > maior){
					maior = matriz[l][c];
				}else if(matriz[l][c] < menor) {
					menor = matriz[l][c];
				}
				
					
			}	
		}
			JOptionPane.showMessageDialog(null,  	resultado);
			
	}
	
}
