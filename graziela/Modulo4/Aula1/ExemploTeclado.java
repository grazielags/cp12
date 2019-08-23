import java.util.Scanner;
public class ExemploTeclado {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Entre com o seu nome: ");
		String nome = teclado.nextLine();
		System.out.print("Entre com a sua idade: ");
		byte idade = teclado.nextByte();
		System.out.print("Entre com o valor do emprestimo: ");
		int numero = teclado.nextInt();
		System.out.print("Tem casa própria? ");
        boolean cadastrado = teclado.nextBoolean();
        
        System.out.println("Nome: " + nome +
                            "\nIdade: " + idade +
                            "\nValor do empréstimo: " + numero +
                            "\nPossui casa própria?: " + cadastrado);
	}
}
