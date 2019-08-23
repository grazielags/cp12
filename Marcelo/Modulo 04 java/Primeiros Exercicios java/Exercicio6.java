/*
6. Escrever um programa que leia o nome de um vendedor, o seu salário
fixo e o total de vendas efetuadas por ele no mês (em dinheiro).
Sabendo que este vendedor ganha 15% de comissão sobre suas vendas
efetuadas, informar o seu nome, o salário fixo e salário no final do mês.*/

import javax.swing.JOptionPane;

public class Exercicio6 {
    public static void main(String args[]) {
        String nome = JOptionPane.showInputDialog("Digite aqui o nome do funcionario: ");
        int salario = Integer.parseInt(JOptionPane.showInputDialog("Entre com o salario do vendedor: "));
        int totalVendas = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor em dinheiro das vendas : "));
        int ajuste15 =  (totalVendas*15)/100;
        int salarioFinal = salario+ajuste15;

        JOptionPane.showMessageDialog(null, "O nome do funcionario : " + nome+ "\nSalario fixo : " +salario + "\nSalario com a comissão : " +salarioFinal);

    }
}