import javax.swing.JOptionPane;

public class M4A6exercicio6Prof {

	public static void main(String[] args) {
// Fa�a uma fun��o que recebe a m�dia final de um aluno por par�metro e retorna o seu conceito, conforme a tabela abaixo:
//		Nota Conceito:
//		de 0,0 a 4,9 D
//		de 5,0 a 6,9 C
//		de 7,0 a 8,9 B
//		de 9,0 a 10,0 A

		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
		double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota: "));
		double somaNota = (nota1 + nota2 + nota3);
		double mediaNota = (somaNota/3);
		String coneitoFinal = conceito(mediaNota);
		JOptionpane
		
		if (mediaNota >= 0.0 && mediaNota <= 4.9) {
			return "Conceito D com m�dia ";
		} else if (mediaNota >= 5.0 && mediaNota <= 6.9) {
			System.out.println("Conceito C com m�dia " + mediaNota);
		} else if (mediaNota >= 7.0 && mediaNota <= 8.9) {
			System.out.println("Conceito B com m�dia " + mediaNota);
		}else if (mediaNota >= 9.0 && mediaNota <= 10) {
			System.out.println("Conceito A com m�dia " + mediaNota);
		}else 
			System.out.println("Nota Inv�lida");
		
	}
}