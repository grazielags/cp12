package Aula6;

import javax.swing.JOptionPane;

public class VariavelGlobal {
	static int global;

	public static void main(String[] args) {
		global = 10;
		JOptionPane.showMessageDialog(null, global);
		testeVariavelGlobal();
		JOptionPane.showMessageDialog(null, global);
	}

	static void testeVariavelGlobal() {
		JOptionPane.showMessageDialog(null, global);
		global = 30;
	}
}
