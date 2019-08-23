/*3. Obter o salário de 5 funcionários e informar a média salarial dos
funcionários.*/

import javax.swing.JOptionPane;
public class Exercicio3 {
    public static void main(String args[]) {
        float salario1 = Float.parseFloat(JOptionPane.showInputDialog("Escreva o salario 1 : "));
        float salario2 = Float.parseFloat(JOptionPane.showInputDialog("Escreva o salario 2 : "));
        float salario3 = Float.parseFloat(JOptionPane.showInputDialog("Escreva o salario 3 : "));
        float salario4 = Float.parseFloat(JOptionPane.showInputDialog("Escreva o salario 4 : "));
        float salario5 = Float.parseFloat(JOptionPane.showInputDialog("Escreva o salario 5 : "));
        float mediaSalarial = (salario1+salario2+salario3+salario4+salario5) / 5;

        JOptionPane.showMessageDialog(null, " a media é "+mediaSalarial);
    }
}        