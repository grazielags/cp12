package application;

import java.util.Scanner;

public class tres {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("--Media Salarial--");
		System.out.print("Informa o 1� salario: ");
		double salario1 = scan.nextDouble();
		System.out.println();
		System.out.print("Informa o 2� salario: ");
		double salario2 = scan.nextDouble();
		System.out.println();
		System.out.print("Informa o 3� salario: ");
		double salario3 = scan.nextDouble();
		System.out.println();
		System.out.print("Informa o 4� salario: ");
		double salario4 = scan.nextDouble();
		System.out.println();
		System.out.print("Informa o 5� salario: ");
		double salario5 = scan.nextDouble();
		System.out.println();
		double mediaSalarial = (salario1+salario2+salario3+salario4+salario5)/2;
		System.out.printf("M�dia Salarial: " + mediaSalarial);


	}

}