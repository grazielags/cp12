/*
5. Faça um programa que leia o preço de 1 produto de 3 lojas diferentes e
mostre na tela qual das lojas você deveria comprar o produto.
*/

import javax.swing.JOptionPane;
public class Exercicio5 {
public static void main(String args[]) {
    float preco1 = Float.parseFloat(JOptionPane.showInputDialog("Coloque o valor do produto  : "));
    float preco2 = Float.parseFloat(JOptionPane.showInputDialog("Coloque o valor do produto  : "));
    float preco3 = Float.parseFloat(JOptionPane.showInputDialog("Coloque o valor do produto  : "));
if (preco1 < preco2 && preco1 < preco3 ){
    JOptionPane.showMessageDialog(null, "Compre na loja 1");
}else if (preco2< preco1 && preco2 < preco3){
    JOptionPane.showMessageDialog(null, "Compre na loja 2");
}else {
    JOptionPane.showMessageDialog(null, "Compre na loja 3");
}


    }
}