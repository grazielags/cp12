package application;

import javax.swing.JOptionPane;

public class dois {

	public static void main(String[] args) {
		int[] a = new int[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um num: "));
		}
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um num que deseja verificar: "));
		int qtd = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x){
				qtd++;
			}
		}
		JOptionPane.showMessageDialog(null,  "O num: " + x + " aparece " + qtd + " vezes no vetor. ");
	}

}
