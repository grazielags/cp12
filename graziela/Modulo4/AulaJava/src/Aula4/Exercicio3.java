package Aula4;

import javax.swing.JOptionPane;

public class Exercicio3 {
	public static void main(String args[]) {
		/*
		 * Escreva um programa que recebe um array (vetor) de números e devolve a
		 * posição onde se encontra o maior valor do array (vetor).
		 * Se houver mais de um valor maior, devolver a posição da primeira
		 * ocorrência.
		 */
		int numeros[] = new int[5];
		int maior = 0;
		int posicaoMaiorNumero = 0;
		for (int posicao = 0; posicao < numeros.length; posicao++) {
			numeros[posicao] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número!"));
			if (posicao == 0) {
				maior = numeros[posicao];
				posicaoMaiorNumero = posicao;
			} else if (numeros[posicao] > maior) {
				maior = numeros[posicao];
				posicaoMaiorNumero = posicao;
			}
		}
		
		for (int posicao = 0; posicao < numeros.length; posicao++) {
			System.out.println(numeros[posicao]);
		}
		System.out.println("O maior valor é: " + maior + " na posição: " + posicaoMaiorNumero);
	}
}
