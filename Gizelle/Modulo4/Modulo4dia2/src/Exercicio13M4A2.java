import javax.swing.JOptionPane;

public class Exercicio13M4A2 {

	public static void main(String[] args) {
// Faça um programa que obtenha um número de 1 até 12 e retorne o mês e a quantidade de dias que esse número representa. 
//	Lembre-se dos anos bissextos (Fevereiro possui 29 dias).

		int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite um número entre 1 e 12: "));
		
		if (mes ==  1) {
			JOptionPane.showMessageDialog(null,"Mês de Janeiro tem 31 dias");
		} else if (mes == 2) {
			JOptionPane.showMessageDialog(null,"Mês de Fevereiro tem 28 ou 29 dias conforme ano bissexto");
		} else if (mes == 3) {
			JOptionPane.showMessageDialog(null,"Mês de Março tem 31 dias");
		} else if (mes == 4) {
			JOptionPane.showMessageDialog(null,"Mês de Abril tem 30 dias");
		} else if (mes == 5) {
			JOptionPane.showMessageDialog(null,"Mês de Maio tem 31 dias");
		} else if (mes == 6) {
			JOptionPane.showMessageDialog(null,"Mês de Junho tem 30 dias");
		} else if (mes == 7) {
			JOptionPane.showMessageDialog(null,"Mês de Julho tem 31 dias");
		} else if (mes == 8) {
			JOptionPane.showMessageDialog(null,"Mês de Agosto tem 31 dias");
		} else if (mes == 9) {
			JOptionPane.showMessageDialog(null,"Mês de Setembro tem 30 dias");
		} else if (mes == 10) {
			JOptionPane.showMessageDialog(null,"Mês de Outubro tem 31 dias");
		} else if (mes == 11) {
			JOptionPane.showMessageDialog(null,"Mês de Novembro tem 30 dias");
		} else if (mes == 12) {
			JOptionPane.showMessageDialog(null,"Mês de Dezembro tem 31 dias");
		} else 
			JOptionPane.showMessageDialog(null,"Número inválido");
	}
}