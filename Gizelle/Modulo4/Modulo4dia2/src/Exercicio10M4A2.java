import javax.swing.JOptionPane;

public class Exercicio10M4A2 {

	public static void main(String[] args) {
// Um funcion�rio ir� receber um aumento de acordo com o seu plano de trabalho, de acordo com a tabela abaixo:
	
//	Plano Aumento
//	A 10%
//	B 15%
//	C 20%
//Fa�a um programa que leia o plano de trabalho e o sal�rio atual de um funcion�rio e calcula e imprime o seu novo sal�rio. 
//Use o comando switch.

		double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o sal�rio R$: "));
		char plano = JOptionPane.showInputDialog("Digite a letra do plano (A, B ou C): ").charAt(0);
		
		if (plano == 'A' || plano == 'a') {
			double salarioTotal = salario + (salario * (10.0 / 100.0));
				JOptionPane.showMessageDialog(null,"O novo sal�rio � R$ " + salarioTotal);
		}else if (plano == 'B' || plano == 'b') {
			double salarioTotal = salario + (salario * (15.0 / 100.0));
			JOptionPane.showMessageDialog(null,"O novo sal�rio � R$ " + salarioTotal);
		}else if (plano == 'C' || plano == 'c') {
			double salarioTotal = salario + (salario * (20.0 / 100.0));
			JOptionPane.showMessageDialog(null,"O novo sal�rio � R$ " + salarioTotal);
		}else {
			JOptionPane.showMessageDialog(null,"Plano inv�lido");
		}
	}
}