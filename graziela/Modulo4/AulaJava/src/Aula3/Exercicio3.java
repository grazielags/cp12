package Aula3;

public class Exercicio3 {
	public static void main(String[] args) {
		/*
		 * João tem 1,50 metro e cresce 2 centímetros por ano, enquanto Manoel tem 1,10 metro
		 * e cresce 3 centímetros por ano. Construa um algoritmo que calcule e imprima quantos anos
		 * serão necessários para que Manoel seja maior que João.
		 */
		int anos = 0;
		double joao = 1.5;
//		double manoel = 1.1;
		for (double manoel = 1.1; manoel < joao; manoel = manoel + 0.03) {
			joao = joao + 0.02;
			anos++;
		}
		System.out.println(anos);
		
//		while (manoel < joao) {
//			manoel = manoel + 0.03;
//			joao = joao + 0.02;
//			anos++;
//		}
//		System.out.println(anos);
	}
}
