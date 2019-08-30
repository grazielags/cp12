/*
1) Uma empresa possui 10 funcionários. Ela resolveu realizar uma pesquisa entre seus funcionários, coletando dados sobre o salário e número de filhos. A empresa deseja saber:
a) média do salário dos funcionários;
b) média do número de filhos;
c) maior salário;
d) menor salário;
e) percentual de pessoas com salário menor que R$1000,00.

*/
import javax.swing.JOptionPane;
public class Exercicio1 {
    public static void main(String args[]) {
        float maiorSalario = 0;
        float menorSalario =0;
        int cont = 1;
        float numeroFilhos = 0;
        float menos1000 = 0;
        float percentual = 0;
        float somaSalario = 0;
        while(cont<11){
            float salario = Float.parseFloat(JOptionPane.showInputDialog("Escreva o salario  : "));
            somaSalario = somaSalario+salario;
            if (cont == 1){
                maiorSalario = salario;
                menorSalario = salario;
            } else {
                if (salario>maiorSalario){
                    maiorSalario = salario;
                }else if (salario<menorSalario){
                    menorSalario=salario;
                }
            }
            if (menorSalario<1000){
                menos1000++;

            }
            numeroFilhos = Float.parseFloat(JOptionPane.showInputDialog("Escreva a quantidade de filho"));
            cont++;
        }
        percentual =(menos1000/10)*100;

        float mediaS = somaSalario/10;
        float mediaF = numeroFilhos/10;
        JOptionPane.showMessageDialog(null, "O maior salario é de :"+maiorSalario+"\n O menor salario é de : "+menorSalario+"\n Media de salario é :"+mediaS+"\n Media de filhos :"+mediaF+"\n e o percentual é de "+percentual+"%");

    }
}