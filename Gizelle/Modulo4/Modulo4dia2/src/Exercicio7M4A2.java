import javax.swing.JOptionPane;

public class Exercicio7M4A2 {

	public static void main(String[] args) {
// Faça um programa que leia 3 notas, e calcule a média e apresente: 
// Aprovado, caso a média seja maior ou igual a 7 e Reprovado, caso a média seja menor do que 7.

		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
		double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota: "));
		double somaNota = (nota1 + nota2 + nota3);
		double mediaNota = (somaNota/3);
		
		if (mediaNota >= 7 && mediaNota <= 10) {
			System.out.println("Aprovado com média: " + mediaNota);
		} else if (mediaNota >= 0 && mediaNota < 7) {
			System.out.println("Reprovado com média: " + mediaNota);
		} else {
			System.out.println("Nota Inválida");
		}
		
	}
}