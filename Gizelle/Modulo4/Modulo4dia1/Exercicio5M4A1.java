import javax.swing.JOptionPane;

public class Exercicio5M4A1 {

	public static void main(String[] args) {
	//Escrever um programa para determinar o consumo m�dio de um autom�vel sendo fornecida a dist�ncia total percorrida 
	// pelo autom�vel e o total de combust�vel gasto. 
	
	double distancia = Double.parseDouble(JOptionPane.showInputDialog("Digite a dist�ncia total: "));
	double totalCombustivel = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de combust�vel: "));
	double consumoMedio = distancia /totalCombustivel;
	
	JOptionPane.showMessageDialog(null, "O consumo m�dio �: " + consumoMedio);
			
	}

}