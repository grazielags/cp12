import javax.swing.JOptionPane;

public class M4A3exercicio3 {
// Jo�o tem 1,50 metro e cresce 2 cent�metros por ano, enquanto Manoel tem 1,10 metro e cresce 3 cent�metros por ano. 
// Construa um algoritmo que calcule e imprima quantos anos ser�o necess�rios para que Manoel seja maior que Jo�o.

	public static void main(String[]args) {
		
		int ano = 0;
		double Joao = 0;
		double Manuel = 0;
		Joao = 1.50;
		Manuel = 1.10;
		do {
			Joao = Joao + 0.02;
			Manuel = Manuel + 0.03;
			ano++;
		} while (Manuel < Joao);
			
		JOptionPane.showMessageDialog(null, "Levar�: " + ano + " Para manoel ser mais alto do que Jo�o");
	}
}