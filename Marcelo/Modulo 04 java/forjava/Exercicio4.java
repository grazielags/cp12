/*
4) Em uma eleição presidencial existem quatro candidatos. Os votos são informados através de códigos. Os dados utilizados para a contagem dos votos obedecem à seguinte codificação:
1, 2, 3, 4 = voto para os respectivos candidatos;
5 = voto nulo;
6 = voto em branco;
Elabore um algoritmo que leia o código do candidato em um voto. Calcule e escreva:
a) total de votos para cada candidato;
b) total de votos nulos;
c) total de votos em branco;
Como finalizador do conjunto de votos, tem-se o valor 0.
*/
import javax.swing.JOptionPane;
public class Exercicio4 {
    public static void main(String args[]) {
        int votos = 0;
        int qntVotos1 = 0;
        int qntVotos2 = 0;
        int qntVotos3 = 0;
        int qntVotos4 = 0;
        int qntNulos = 0;
        int qntBranco = 0;

        for(int i= 1; i < 3; i++){
           votos = Integer.parseInt(JOptionPane.showInputDialog("Escreva o seu voto (1)(2)(3)(4) para os candidatos e (5) para nulo e (6) para Branco : "));
            if (votos == 1){
                qntVotos1++;
            }else if (votos == 2){
                qntVotos2++;
            }else if (votos == 3){
                qntVotos3++;
            }else if (votos == 4){
                qntVotos4 = qntVotos4 + 1;
            }else if (votos == 5){
                qntNulos++;
            }else if (votos == 6){
                qntBranco++;
            }
        }

        JOptionPane.showMessageDialog(null,"Quantidade de votos do candidato 1 "+qntVotos1+"\nQuantidade de votos do candidato 2 "+qntVotos2+"\nQuantidade de votos do candidato 3 "+qntVotos3+"\nQuantidade de votos do candidato 4 "+qntVotos4+"\nQuantidade de votos nulos "+qntNulos+"\nQuantidade de votos Branco "+qntBranco);
    }
}