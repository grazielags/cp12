import javax.swing.JOptionPane;

public class Exercicio9M4A1 {

	public static void main(String[] args) {
	//Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. 
	// A fórmula de conversão é: F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.

		double C = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em grau Celsius: "));
		double F = (9*C+160) / 5;
		
		JOptionPane.showMessageDialog(null, "A temperatura " + C + " em graus Celsius é " + F + " em grau Fahrenheit");
			
	}

}