package Aula1;

import javax.swing.JOptionPane;

public class Exercicio7 {
	public static void main(String[] args) {
		/*
		 * Escrever um programa que leia o nome de um aluno
		 * e as notas das três provas que ele obteve no semestre.
		 * No final informar o nome do aluno e a sua média.
		 */
		String nome = JOptionPane.showInputDialog("Digite o nome!");
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota do(a) " + nome + "!"));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota do(a) \" + nome + \"!"));
		double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota do(a) \" + nome + \"!"));
		double media = (nota1 + nota2 + nota3) / 3;
		JOptionPane.showMessageDialog(null, "Nome: " + nome + " - Média: " + media);
	}
}
