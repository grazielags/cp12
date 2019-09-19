import javax.swing.JOptionPane;

public class M4A5exercicio1 {

	public static void main(String[] args) {
// Construa uma matriz 3 x 3, preencha ela com valores inteiros e após isso verifique se essa matriz é uma matriz identidade.

// REFAZER O 0-1 COM O DAPROF - TRUE
		
		int linhas = 3;
		int colunas = 3;
		int[][] matriz = new int [linhas][colunas];
		
		String resultado = "Matriz: ";
		for (int linha = 0; linha < 3; linha++) {
			resultado = resultado + "\n" + linha + ": -> "; 
			for (int coluna = 0; coluna < 3; coluna++) {
				matriz[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para a matriz: "));
				resultado = resultado + matriz[linha][coluna] + "   ";
//				if (matriz[0][0] == matriz[2][2] && matriz[2][2] == matriz[1][1]) {
//					System.out.println(resultado);
//					System.out.println("Matriz Identidade");
//				} else {
					System.out.println(resultado);
					System.out.println("Matriz não é do itpo Identidade");
				}
			}
		}
}
			
				
