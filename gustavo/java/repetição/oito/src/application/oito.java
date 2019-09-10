package application;

import javax.swing.JOptionPane;

public class oito {

	public static void main(String[] args) {
		int sexo = 0;
		int masculino = 0;
		int feminino = 0;
		int altura = 0;
		int maiorAltura = 0;
		int menorAltura = 0;
		int mediaAltura = 0;
		int mediaAlturaMulheres = 0;
		
		for(int i=1; i<=5; i++) {
		sexo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o seu sexo (1- Masculino / 2- Feminino: "));
		if (sexo == 1) {
			masculino++;
			altura = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a sua altura: "));
			if (i == 1 ) {
				maiorAltura = altura;
				menorAltura = altura;
			}else{
				if (menorAltura > altura) {
					menorAltura = altura;
				}
				if (maiorAltura < altura) {
					maiorAltura = altura;
				}
			}
		}else if (sexo == 2) {
			feminino++;
			altura = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a sua altura: "));
			if (i == 1 ) {
				maiorAltura = altura;
				menorAltura = altura;
			}else{
				if (menorAltura > altura) {
					menorAltura = altura;
				}
				if (maiorAltura < altura) {
					maiorAltura = altura;
				}
			}
		}
		

		
		}
	}

}
