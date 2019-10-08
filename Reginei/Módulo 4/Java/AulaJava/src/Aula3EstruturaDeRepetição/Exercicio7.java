package Aula3EstruturaDeRepetição;

import javax.swing.JOptionPane;

public class Exercicio7 {

	public static void main(String[] args) {

		//7. Faça um jogo para descobrir o número correto, inicie gerando um
		//número aleatório conforme comando que será apresentado abaixo,
		//depois solicite para o usuário um número até que ele acerte o valor
		//gerado aleatório, após cada erro, apresentar uma mensagem
		//informando se o valor correto é maior ou menor ao valor que foi
		//digitado. Ao fim, quando for acertado o valor, apresentar ao usuário em
		//quantas tentativas ele conseguiu acertar o número.
		
		//    import java.util.Random;
		//    public class ValorAleatorio {
		//    public static void main(String[] args) {
		//    int teste = (int)(Math.random() * 11);
		//    System.out.println(teste);
		//   }
		// }
		int numeroSorteado = (int)(Math.random() * 11);
		   System.out.println(numeroSorteado);
		   
		   int numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número: "));
		   while (numeroDigitado!= numeroSorteado);
		   
		   
	}

}
