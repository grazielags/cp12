/*1. Faça um programa que obtenha 3 valores e diga qual o maior valor
entre eles e qual o menor valor entre eles.*/



import javax.swing.JOptionPane;
public class Exercicio1 {
public static void main(String args[]) {

    int numero1 = Integer.parseInt(JOptionPane.showInputDialog("coloque o primeiro valor  : "));
    int numero2 = Integer.parseInt(JOptionPane.showInputDialog("coloque o segundo valor  : "));
    int numero3 = Integer.parseInt(JOptionPane.showInputDialog("coloque o terceiro valor  : "));
    int maior = 0;
    int menor = 0;

    if ( numero1 > maior ){
        maior = numero1;
        menor = numero1;       
    }
    else if (numero1 > menor){
        menor = numero1;
    } 
    if ( numero2 > maior ){
        maior = numero2;       
    }
    else if (numero2 > menor) {
        menor = numero2;
    } 
    if ( numero3 > maior ){
        maior = numero3;       
    }
    else if (numero3 > menor) {
        menor = numero3;
    } 
        

    JOptionPane.showMessageDialog(null,"O numero maior é :"+maior+ "\nE o menor numero é :"+menor);

        
        }
    }
