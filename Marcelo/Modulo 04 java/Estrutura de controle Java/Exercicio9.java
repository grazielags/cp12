/*
9. Faça um programa que pergunte o preço de um produto e em quantas
vezes irá ser pago o produto.
1 = 20% de desconto
2 até 5 = 5% de acréscimo
6 até 10 = 15% de acréscimo
*/

import javax.swing.JOptionPane;
public class Exercicio9 {
    public static void main(String args[]) {


        float preco = Float.parseFloat(JOptionPane.showInputDialog("Coloque o valor do produto  : "));
        float parcelas = Float.parseFloat(JOptionPane.showInputDialog("Coloque o valor do produto  : "));

        if (parcelas == 1){
            preco = preco - (preco*20)/100;
            JOptionPane.showMessageDialog(null,"O valor com 20 % de desconto é "+preco);
        }else if (parcelas >= 2 && parcelas <= 5){
            preco = preco +(preco*5)/100;
            JOptionPane.showMessageDialog(null,"O valor com 5% de acrescimo é de :"+preco);
            
        }else if (parcelas >= 6 && parcelas <= 15){
            preco = preco + (preco*15)/100;
            JOptionPane.showMessageDialog(null,"O valor com 15 % de acrescimo é de :"+preco);        }
    }
}