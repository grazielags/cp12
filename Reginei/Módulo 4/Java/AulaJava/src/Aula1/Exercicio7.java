package Aula1;

import javax.swing.JOptionPane;

public class Exercicio7 {

	public static void main(String[] args) {

		/*
		 * 7. Escrever um programa que leia o nome de um aluno e as notas das três
		 * provas que ele obteve no semestre. No final informar o nome do aluno e a sua
		 * média.
		 */

		String nome;
		double nota1 = 0;
		double nota2 = 0;
		double nota3 = 0;
		double media = 0;

		nome = JOptionPane.showInputDialog("Digite o nome: ");
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota do(a) " + nome + ":"));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota do(a) " + nome + ":"));
		nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota do(a) " + nome + ":"));

		media = (nota1 + nota2 + nota3) / 3;

		JOptionPane.showMessageDialog(null, "Nome: " + nome + " \n Média: " + media);

	}

}
