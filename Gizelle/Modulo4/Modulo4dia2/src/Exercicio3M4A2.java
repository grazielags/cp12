import javax.swing.JOptionPane;

public class Exercicio3M4A2 {

	public static void main(String[] args) {
// Faça um programa que obtenha uma letra: F (Feminino) ou M (Masculino). 
// Após obter a letra, escreva na tela Feminino se a pessoa digitou a letra F, e Masculino e a 
// pessoa digitou a letra M.


char sexo = JOptionPane.showInputDialog("Digite o F (Feminino) ou M (Masculino): ").charAt(0);

	if (sexo == 'F' || sexo == 'f') {
		System.out.println("Feminino");
	} else if (sexo == 'M' || sexo == 'm') {
		System.out.println("Masculino");
	} else {
		System.out.println("Letra inválida");
	}
	}
}