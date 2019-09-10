/*
2) Construir um algoritmo que calcule a média aritmética de vários valores inteiros positivos, lidos externamente. O final da leitura acontecerá quando for lido um valor negativo.
*/
import javax.swing.JOptionPane;
public class Exercicio2 {
    public static void main(String args[]) {
        int valor = 0;
        int cont = 0;
        int somaValor = 0;
        int mediaFinal = 0;
        while(valor >= 0){
            valor = Integer.parseInt(JOptionPane.showInputDialog("Escreva um valor : "));
            if(valor >= 0){
                somaValor = valor+somaValor;
                cont++;
            }
        }
        mediaFinal = somaValor/cont;
        JOptionPane.showMessageDialog(null, " a media é "+mediaFinal);
    }
}      