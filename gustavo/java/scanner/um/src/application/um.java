package application;

import java.util.Scanner;

public class um {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("--Calcular a área de um trapézio--");
		System.out.print("Informa a altura: ");
		int a = scan.nextInt();
		System.out.println();
		System.out.print("Informa a base menor: ");
		int b = scan.nextInt();
		System.out.println();
		System.out.print("Informa a base maior: ");
		int B = scan.nextInt();
		System.out.println();
		int area = (a*(b+B))/2;
		System.out.println(area);


	}

}
