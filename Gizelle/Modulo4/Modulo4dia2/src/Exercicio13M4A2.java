import javax.swing.JOptionPane;

public class Exercicio13M4A2 {

	public static void main(String[] args) {
// Fa�a um programa que obtenha um n�mero de 1 at� 12 e retorne o m�s e a quantidade de dias que esse n�mero representa. 
//	Lembre-se dos anos bissextos (Fevereiro possui 29 dias).

		int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero entre 1 e 12: "));
		
		if (mes ==  1) {
			JOptionPane.showMessageDialog(null,"M�s de Janeiro tem 31 dias");
		} else if (mes == 2) {
			JOptionPane.showMessageDialog(null,"M�s de Fevereiro tem 28 ou 29 dias conforme ano bissexto");
		} else if (mes == 3) {
			JOptionPane.showMessageDialog(null,"M�s de Mar�o tem 31 dias");
		} else if (mes == 4) {
			JOptionPane.showMessageDialog(null,"M�s de Abril tem 30 dias");
		} else if (mes == 5) {
			JOptionPane.showMessageDialog(null,"M�s de Maio tem 31 dias");
		} else if (mes == 6) {
			JOptionPane.showMessageDialog(null,"M�s de Junho tem 30 dias");
		} else if (mes == 7) {
			JOptionPane.showMessageDialog(null,"M�s de Julho tem 31 dias");
		} else if (mes == 8) {
			JOptionPane.showMessageDialog(null,"M�s de Agosto tem 31 dias");
		} else if (mes == 9) {
			JOptionPane.showMessageDialog(null,"M�s de Setembro tem 30 dias");
		} else if (mes == 10) {
			JOptionPane.showMessageDialog(null,"M�s de Outubro tem 31 dias");
		} else if (mes == 11) {
			JOptionPane.showMessageDialog(null,"M�s de Novembro tem 30 dias");
		} else if (mes == 12) {
			JOptionPane.showMessageDialog(null,"M�s de Dezembro tem 31 dias");
		} else 
			JOptionPane.showMessageDialog(null,"N�mero inv�lido");
	}
}