import javax.swing.JOptionPane;

public class M4A6exercicio5 {

	public static void main(String[] args) {
// Escreva um procedimento que receba 3 valores reais X, Y e Z e que verifique se esses valores podem ser os 
//	comprimentos dos lados de um tri�ngulo e, neste caso apresentar na tela qual o tipo de tri�ngulo formado.
//	Para que X, Y e Z forme um tri�ngulo � necess�rio que a seguinte propriedade seja satisfeita:
//			O comprimento de cada lado de um tri�ngulo � menor do que a soma do comprimento dos outros dois lados.
//			O procedimento deve identificar o tipo de tri�ngulo formado observando as seguintes defini��es:
//			Tri�ngulo Equil�tero: os comprimentos dos 3 lados s�o iguais.
//			Tri�ngulo Is�sceles: os comprimentos de 2 lados s�o iguais.
//			Tri�ngulo Escaleno: os comprimentos dos 3 lados s�o diferentes.

		
		double A = Integer.parseInt(JOptionPane.showInputDialog("Digite lado A: "));
		double B = Integer.parseInt(JOptionPane.showInputDialog("Digite lado B: "));
		double C = Integer.parseInt(JOptionPane.showInputDialog("Digite lado C: "));
		triangulo (A, B, C);
	}

	public static void triangulo(double A, double B, double C) {

		if (A < (B + C) && B < (A + C) && C < (A + B)) {
			if (A==B && A==C) {
				System.out.println("Tri�ngulo Equil�tero");
			}else if  (A != B && B != C && B != C) {
				System.out.println("Tri�ngulo Escaleno");
			}else {
				System.out.println("Tri�ngulo Is�celes");
			}
		} else {
			System.out.println("N�o � tri�ngulo");
		}		
	}
}
