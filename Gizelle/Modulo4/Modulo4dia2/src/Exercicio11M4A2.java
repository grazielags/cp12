import javax.swing.JOptionPane;

public class Exercicio11M4A2 {

	public static void main(String[] args) {
// Faça um programa que leia um número entre 0 e 10, e escreva este número por extenso. Use o comando switch.

		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro entre 0 e 10: "));
		
		switch (numero) {
		case 0:
			System.out.println("0 = zero");
			break;
		case 1:
			System.out.println("1 = hum");
			break;
		case 2:
			System.out.println("2 = dois");
			break;
		case 3:
			System.out.println("3 = três");
			break;
		case 4:
			System.out.println("4 = quatro");
			break;
		case 5:
			System.out.println("5 = cinco");
			break;
		case 6:
			System.out.println("6 = seis");
			break;
		case 7:
			System.out.println("7 = sete");
			break;
		case 8:
			System.out.println("8 = oito");
			break;
		case 9:
			System.out.println("9 = nove");
			break;
		case 10:
			System.out.println("10 = dez");
			break;
		default:
			System.out.println("Opção inválida");
		}
	}
}