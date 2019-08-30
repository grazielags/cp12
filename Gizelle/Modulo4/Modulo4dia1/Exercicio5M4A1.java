import javax.swing.JOptionPane;

public class Exercicio5M4A1 {

	public static void main(String[] args) {
	//Escrever um programa para determinar o consumo médio de um automóvel sendo fornecida a distância total percorrida 
	// pelo automóvel e o total de combustível gasto. 
	
	double distancia = Double.parseDouble(JOptionPane.showInputDialog("Digite a distância total: "));
	double totalCombustivel = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de combustível: "));
	double consumoMedio = distancia /totalCombustivel;
	
	JOptionPane.showMessageDialog(null, "O consumo médio é: " + consumoMedio);
			
	}

}