package application;

import java.util.Scanner;

public class quatro {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("--Reajuste do valor de um produto--");
		System.out.print("Informa o valor do produto: ");
		double valorProduto = scan.nextDouble();
		System.out.println();
		System.out.print("Informe o percentual de aumento do valor: ");
		double percentualValorProduto = scan.nextDouble();
		System.out.println();
		System.out.printf("Valor antigo do produto: " + valorProduto);
		System.out.printf("\nValor novo do produto: " + (valorProduto +((valorProduto * percentualValorProduto)/100)));
		


	}
}