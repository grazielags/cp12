/*

2. Fa�a o programa acima calcular utilizando valores reais e depois

imprimir na tela duas informa��es:
Valor exato da �rea.
Valor arredondado para inteiro.

*/

import javax.swing.JOptionPane;
public class Exercicio2M4A1 {
    
	public static void main(String args[]) {

	int a = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor da altura: "));
	int b = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor da base menor: "));
	int c = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor da base maior: "));
	int area = (a*(b+c))/2;
	double numero = (a*(b+c))/2;

	JOptionPane.showMessageDialog(null, "�rea do tri�ngulo �: " + area + numero);


	
	}

}