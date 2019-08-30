/*
3) João tem 1,50 metro e cresce 2 centímetros por ano, enquanto Manoel tem 1,10 metro e cresce 3 centímetros por ano. Construa um algoritmo que calcule e imprima quantos anos serão necessários para que Manoel seja maior que João.
*/
import javax.swing.JOptionPane;
public class Exercicio3 {
    public static void main(String args[]) {
        double joao = 1.5;
        double manoel = 1.1;
        int qntAnos = 0;
        while(manoel<joao){
            qntAnos++;
            manoel += 0.03;
            joao += 0.02;
        }
        JOptionPane.showMessageDialog(null, " a quantidade de anos  é "+qntAnos);





    }
}