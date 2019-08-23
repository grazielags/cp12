/*
 * 2) Faça o programa acima calcular utilizando valores reais e depois imprimir
 * na tela duas informações: Valor exato da área. Valor arredondado para
 * inteiro.
 */


import javax.swing.JOptionPane;
public class Exercicio2 {
    public static void main(String args[]) {
        float base = Float.parseFloat(JOptionPane.showInputDialog("Entre com o valor da base: "));
        float altura = Float.parseFloat(JOptionPane.showInputDialog("Entre com o valor da altura: "));
        float area = base*altura;
        int area2  = (int) (base*altura);
        JOptionPane.showMessageDialog(null,"Area em inteiro é :"+area2+"\n Area em real é de :"+area);

    }
}