package Aula3EstruturaDeRepeti��o;

import javax.swing.JOptionPane;

public class Exercicio7 {

	public static void main(String[] args) {

		//7. Fa�a um jogo para descobrir o n�mero correto, inicie gerando um
		//n�mero aleat�rio conforme comando que ser� apresentado abaixo,
		//depois solicite para o usu�rio um n�mero at� que ele acerte o valor
		//gerado aleat�rio, ap�s cada erro, apresentar uma mensagem
		//informando se o valor correto � maior ou menor ao valor que foi
		//digitado. Ao fim, quando for acertado o valor, apresentar ao usu�rio em
		//quantas tentativas ele conseguiu acertar o n�mero.
		
		//    import java.util.Random;
		//    public class ValorAleatorio {
		//    public static void main(String[] args) {
		//    int teste = (int)(Math.random() * 11);
		//    System.out.println(teste);
		//   }
		// }
		int numeroSorteado = (int)(Math.random() * 11);
		   System.out.println(numeroSorteado);
		   
		   int numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um N�mero: "));
		   while (numeroDigitado!= numeroSorteado);
		   
		   
	}

}
