import javax.swing.JOptionPane;

public class M4A6exercicio5 {

	public static void main(String[] args) {
// Escreva um procedimento que receba 3 valores reais X, Y e Z e que verifique se esses valores podem ser os 
//	comprimentos dos lados de um triângulo e, neste caso apresentar na tela qual o tipo de triângulo formado.
//	Para que X, Y e Z forme um triângulo é necessário que a seguinte propriedade seja satisfeita:
//			O comprimento de cada lado de um triângulo é menor do que a soma do comprimento dos outros dois lados.
//			O procedimento deve identificar o tipo de triângulo formado observando as seguintes definições:
//			Triângulo Equilátero: os comprimentos dos 3 lados são iguais.
//			Triângulo Isósceles: os comprimentos de 2 lados são iguais.
//			Triângulo Escaleno: os comprimentos dos 3 lados são diferentes.

		
		double A = Integer.parseInt(JOptionPane.showInputDialog("Digite lado A: "));
		double B = Integer.parseInt(JOptionPane.showInputDialog("Digite lado B: "));
		double C = Integer.parseInt(JOptionPane.showInputDialog("Digite lado C: "));
		triangulo (A, B, C);
	}

	public static void triangulo(double A, double B, double C) {

		if (A < (B + C) && B < (A + C) && C < (A + B)) {
			if (A==B && A==C) {
				System.out.println("Triângulo Equilátero");
			}else if  (A != B && B != C && B != C) {
				System.out.println("Triângulo Escaleno");
			}else {
				System.out.println("Triângulo Isóceles");
			}
		} else {
			System.out.println("Não é triângulo");
		}		
	}
}
