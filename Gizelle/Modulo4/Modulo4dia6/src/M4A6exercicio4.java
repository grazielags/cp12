import javax.swing.JOptionPane;

public class M4A6exercicio4 {

	public static void main(String[] args) {
// Faça um procedimento que recebe a idade de um nadador por parâmetro e apresente a categoria desse nadador de acordo com a tabela abaixo:
//		Idade Categoria
//		5 a 7 anos Infantil A
//		8 a 10 anos Infantil B
//		11-13 anos Juvenil A
//		14-17 anos Juvenil B
//		Maiores de 18 anos (inclusive) Adulto

		for (int i = 0; i < 1; i++) {
			Categoria();
		}
	}

	public static void Categoria() {
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: "));
		
		if (idade <5) {
			System.out.println("Idade inválida para cadastro");
		}else if (idade >= 5 && idade <= 7) {
			System.out.println("Categoria Infantil A");
		}else if(idade >= 8 && idade <= 10){
			System.out.println("Categoria Infantil B");
		}else if (idade >= 11 && idade <= 13) {
			System.out.println("Categoria Juvenil A");
		}else if (idade >= 14 && idade <= 17) {
			System.out.println("Categoria Juvenil B");
		}else if (idade >= 18) {
			System.out.println("Categoria Adulto");
		}	
	}
}
