import javax.swing.JOptionPane;

public class Exercicio7M4A1 {

	public static void main(String[] args) {
	//Escrever um programa que leia o nome de um aluno e as notas das três provas que ele obteve no semestre.
	//No final informar o nome do aluno e a sua média.

		String nome = JOptionPane.showInputDialog("Nome do aluno: ");
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
		double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota: "));
		
		double media = (nota1 + nota2 + nota3)/3;
		
		JOptionPane.showMessageDialog(null, "O aluno " + nome + " ficou com média: " + media);
			
	}

}