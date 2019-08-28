/*
7. Faça um programa que leia 3 notas, e calcule a média e apresente:
Aprovado, caso a média seja maior ou igual a 7 e Reprovado, caso a
média seja menor do que 7.
*/

import javax.swing.JOptionPane;
public class Exercicio7 {
    public static void main(String args[]) {

        int nota1 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o nota 1: "));
        int nota2 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o nota 2: "));
        int nota3 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o nota 3: "));

        int media = (nota1+nota2+nota3)/3;

        if (media >= 7){
            JOptionPane.showMessageDialog(null,"Aprovado e sua media é :"+media);
        }else if (media < 7){
            JOptionPane.showMessageDialog(null,"Reprovado e sua media é :"+media);
        }




        }
    }