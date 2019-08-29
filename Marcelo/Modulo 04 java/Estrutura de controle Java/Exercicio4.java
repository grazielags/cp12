/*4. Faça um programa que obtenha uma letra e informe na tela se essa
letra é uma vogal ou uma consoante.*/

import javax.swing.JOptionPane;
public class Exercicio4 {
public static void main(String args[]) {
    char letra = JOptionPane.showInputDialog("Escreva uma letra: ").toUpperCase().charAt(0);

    if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U'){
        JOptionPane.showMessageDialog(null, "vogal");
    }else {
        JOptionPane.showMessageDialog(null, "consoante");
    }



    }
}