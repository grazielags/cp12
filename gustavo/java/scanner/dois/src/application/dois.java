package application;

import java.util.Scanner;

public class dois {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("--Calcular a �rea de um trap�zio--");
		System.out.print("Informa a altura: ");
		double a = scan.nextDouble();
		System.out.println();
		System.out.print("Informa a base menor: ");
		double b = scan.nextDouble();
		System.out.println();
		System.out.print("Informa a base maior: ");
		double B = scan.nextDouble();
		System.out.println();
		double area = (a*(b+B))/2;
		System.out.printf("�rea exata: " + area);
		int areaInt = (int) ((a*(b+B))/2); 
		System.out.println("\n�rea arredondado: " + areaInt);


	}

}