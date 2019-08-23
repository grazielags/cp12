/*8. Escrever um programa em que leia dois valores para as variáveis A e B,
e efetuar as trocas dos valores de forma que a variável A passe a possuir
o valor da variável B e a variável B passe a possuir o valor da variável A.
Apresentar os valores trocados.*/

import javax.swing.JOptionPane;
public class Exercicio8 {
    public static void main(String args[]) {
        int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Escreva a valor A: "));
        int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Escreva a valor B: "));
        int valor3 = valor2;
        int valor4 = valor1;
        JOptionPane.showMessageDialog(null, "Variavel A =>" + valor2+ "\n Variavel B => "+valor4);

    }
}