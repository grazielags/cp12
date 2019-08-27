/*
9. Ler uma temperatura em graus Celsius e apresentá-la convertida em
graus Fahrenheit. A fórmula de conversão é: F=(9*C+160) / 5, sendo F
a temperatura em Fahrenheit e C a temperatura em Celsius.
*/

import javax.swing.JOptionPane;
public class Exercicio9 {
    public static void main(String args[]) {
        float temperaturaCelsius = Float.parseFloat(JOptionPane.showInputDialog("Escreva a temperatura em Celsius"));
        float temperaturaFahrenheit = (9*temperaturaCelsius+160) /5;
        JOptionPane.showMessageDialog(null, "A temperatura convertida em Fahrenheit é de :"+temperaturaFahrenheit+"°");
    }
}