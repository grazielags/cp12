/*
4. Faça um programa que receba o valor do produto e o percentual de
aumento que esse produto terá. Após isso apresente na tela o valor
antigo e o valor após o reajuste.
*/

import javax.swing.JOptionPane;

public class Exercicio4 {
    public static void main(String args[]) {
        float valorProduto = Float.parseFloat(JOptionPane.showInputDialog("Escreva o valor do produto : "));
        float percentualProduto = Float.parseFloat(JOptionPane.showInputDialog("Escreva o percentual do produto %"));
        float valorFinalProduto = (valorProduto*percentualProduto) / 100;
        float valorAjustado = valorProduto+valorFinalProduto;
        JOptionPane.showMessageDialog(null, " O valor do produto era de : "+valorProduto+"\n e com o reajuste de "+percentualProduto+"\n o valor final foi de "+valorAjustado);
        }
    }