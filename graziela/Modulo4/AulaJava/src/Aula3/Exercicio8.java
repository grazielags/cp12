package Aula3;

import javax.swing.JOptionPane;

public class Exercicio8 {
	public static void main(String[] args) {
		/*
		 * Escrever um algoritmo que leia um conjunto de 5 informações contendo, cada uma delas,
		 * a altura e o sexo de uma pessoa (código=1 - masculino, código=2 - feminino),
		 * calcule e mostre o seguinte:  
		 * a) a maior e a menor altura da turma
		 * b) a média da altura das mulheres
		 * c) a média da altura da turma.
		 */
		double altura = 0;
		int sexo = 0;
		double maiorAltura = 0;
		double menorAltura = 0;
		double somaAltura = 0;
		double somaAlturaMulheres = 0;
		int qtdMulheres = 0;
		for (int i = 0; i < 5; i++) {
			altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura!"));
			sexo = Integer.parseInt(JOptionPane.showInputDialog("Digite o sexo (1 - Masculino ou 2 - Feminino)!"));
			somaAltura = somaAltura + altura;
			if (i == 0) {
				menorAltura = altura;
				maiorAltura = altura;
			} else {
				if (altura < menorAltura) {
					menorAltura = altura;
				}
				if (altura > maiorAltura) {
					maiorAltura = altura;
				}
			}
			if (sexo == 2) {
				somaAlturaMulheres = somaAlturaMulheres + altura;
				qtdMulheres++;
			}
		}
		double mediaTurma = somaAltura / 5.0;
		double mediaMulheres = somaAlturaMulheres / qtdMulheres;
		JOptionPane.showMessageDialog(null, "Menor altura da turma: " + menorAltura
											+ "\nMaior altura da turma: " + maiorAltura
											+ "\nMédia altura das mulheres: " + mediaMulheres
											+ "\nMédia altura da turma: " + mediaTurma);
	}
}
