/*  3. Faça um programa que obtenha uma letra: F (Feminino) ou M
(Masculino). Após obter a letra, escreva na tela Feminino se a pessoa
digitou a letra F, e Masculino e a pessoa digitou a letra M.*/

import javax.swing.JOptionPane;
public class Exercicio3 {
public static void main(String args[]) {

    char sexo = JOptionPane.showInputDialog("Escreva F para feminino ou M de masculino: ").toUpperCase().charAt(0);
    if (sexo == 'F'){
        JOptionPane.showMessageDialog(null, "Feminino");
    } else if(sexo == 'M') {
        JOptionPane.showMessageDialog(null, "Masculino");
    }

   }
}