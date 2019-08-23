/* 
7. Escrever um programa que leia o nome de um aluno e as notas das três
provas que ele obteve no semestre. No final informar o nome do aluno
e a sua média.
*/

import javax.swing.JOptionPane;
public class Exercicio7 {
    public static void main(String args[]) {

        String nome = JOptionPane.showInputDialog("Digite aqui o nome do aluno: ");
        int nota1 = Integer.parseInt(JOptionPane.showInputDialog("Escreva a nota 1: "));
        int nota2 = Integer.parseInt(JOptionPane.showInputDialog("Escreva a nota 2: "));
        int nota3 = Integer.parseInt(JOptionPane.showInputDialog("Escreva a nota 3: "));
        int media = (nota1+nota2+nota3) / 3;

        JOptionPane.showMessageDialog(null, "O nome do aluno : " + nome+ "\n a sua media :" +media);


    }
}