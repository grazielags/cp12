package Aula3;

import javax.swing.JOptionPane;

public class Exercicio4 {
	public static void main(String[] args) {
		/*
		 * Em uma eleição presidencial existem quatro candidatos. Os votos são informados através de códigos.
		 * Os dados utilizados para a contagem dos votos obedecem à seguinte codificação:
		 * 1, 2, 3, 4 = voto para os respectivos candidatos;
		 * 5 = voto nulo;
		 * 6 = voto em branco;
		 * Elabore um algoritmo que leia o código do candidato em um voto. Calcule e escreva:
		 * a) total de votos para cada candidato;
		 * b) total de votos nulos;
		 * c) total de votos em branco;
		 * Como finalizador do conjunto de votos, tem-se o valor 0.
		 */
		int voto = -1;
		int totalVotosCandidato1 = 0;
		int totalVotosCandidato2 = 0;
		int totalVotosCandidato3 = 0;
		int totalVotosCandidato4 = 0;
		int totalVotosNulos = 0;
		int totalVotosEmBranco = 0;
		while(voto != 0) {
			voto = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu voto:"
																+ "\n1 - Candidato 1"
																+ "\n2 - Candidato 2"
																+ "\n3 - Candidato 3"
																+ "\n4 - Candidato 4"
																+ "\n5 - Voto nulo"
																+ "\n6 - Voto em branco"
																+ "\n0 - Sair"));
			switch (voto) {
				case 1:
					totalVotosCandidato1++;
					break;
				case 2:
					totalVotosCandidato2++;
					break;
				case 3:
					totalVotosCandidato3++;
					break;
				case 4:
					totalVotosCandidato4++;
					break;
				case 5:
					totalVotosNulos++;
					break;
				case 6:
					totalVotosEmBranco++;
					break;
				case 0:
					break;
				default:
					JOptionPane.showMessageDialog(null, "Voto inválido!");
					break;
			}
		}
		JOptionPane.showMessageDialog(null, "Total de votos candidato 1: " + totalVotosCandidato1 +
											"\nTotal de votos candidato 2: " + totalVotosCandidato2 +
											"\nTotal de votos candidato 3: " + totalVotosCandidato3 +
											"\nTotal de votos candidato 4: " + totalVotosCandidato4 +
											"\nTotal de votos nulos: " + totalVotosNulos +
											"\nTotal de votos em branco: " + totalVotosEmBranco);
	}
}
