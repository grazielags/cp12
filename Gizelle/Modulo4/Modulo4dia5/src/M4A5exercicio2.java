import javax.swing.JOptionPane;

public class M4A5exercicio2 {

	public static void main(String[] args) {
// Escreva um programa para que mostre o menor e o maior valor de uma matriz 4 x 4.
		
		int linhas = 4;
		int colunas = 4;
		int maior = 0;
		int menor = 0;
		int[][] matriz = new int [linhas][colunas];
		
		String resultado = "Matriz: ";
		for (int linha = 0; linha < 4; linha++) {
			resultado = resultado + "\n" + linha + ": -> "; 
			for (int coluna = 0; coluna < 4; coluna++) {
				matriz[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para a matriz: "));
				resultado = resultado + matriz[linha][coluna] + "   ";
				
				if (linha == 0 && coluna == 0) {
					maior = matriz[linha][coluna];
					menor = matriz[linha][coluna];
				} else {
					if (matriz[linha][coluna] > maior) {
						maior = matriz[linha][coluna];
					}
					if (matriz[linha][coluna] < menor) {
						menor = matriz[linha][coluna];
					}
				}
			}
		}
		
		System.out.println(resultado);
		System.out.println("Maior Valor " + maior);
		System.out.println("Menor Valor " + menor);
	}
}
