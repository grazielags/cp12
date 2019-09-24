import javax.swing.JOptionPane;

public class M4A3exercicio8 {
// Escrever um algoritmo que leia um conjunto de 5 informações contendo, cada uma delas, a altura e o sexo de uma pessoa 
// (código=1 - masculino, código=2 - feminino), calcule e mostre o seguinte: 
//	a) a maior e a menor altura da turma
//	b) a média da altura das mulheres
//	c) a média da altura da turma.

	public static void main(String[] args) {
		int sexo = 0;
		int masculino = 0;
		int feminino = 0;
		double altura = 0;
		double maiorAltura = 0;
		double menorAltura = 0;
		double mediaAltura = 0;
		double mediaAlturaMulheres = 0;
		double somaAlturaMasculino = 0;
		double somaAlturaFeminino = 0;
		
		for(int i=1; i<=5; i++) {
		sexo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite número 1 para Masculino e 2 para Feminino: "));
		if (sexo == 1) {
			masculino++;
			altura = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua altura: "));
			if (i == 1 ) {
				maiorAltura = altura;
				menorAltura = altura;
			}else{
				if (menorAltura > altura) {
					menorAltura = altura;
				}
				if (maiorAltura < altura) {
					maiorAltura = altura;
				}
			}
		somaAlturaMasculino += i;
		}else if (sexo == 2) {
			feminino++;
			altura = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua altura: "));
			if (i == 1 ) {
				maiorAltura = altura;
				menorAltura = altura;
			}else{
				if (menorAltura > altura) {
					menorAltura = altura;
				}
				if (maiorAltura < altura) {
					maiorAltura = altura;
				}
			}
		somaAlturaFeminino += i;
		mediaAlturaMulheres = i/feminino;
		}
		}
		mediaAltura = (somaAlturaMasculino+somaAlturaFeminino)/5;
		JOptionPane.showMessageDialog(null, "Maior altura da turma: " + maiorAltura
										+ "\nMenor altura da turma: " + menorAltura
										+ "\nMédia altura das mulheres: " + mediaAlturaMulheres
										+ "\nMédia altura da turma; " + mediaAltura);
	}
}