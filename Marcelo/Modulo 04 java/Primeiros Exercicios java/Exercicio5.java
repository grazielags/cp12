/*
5. Escrever um programa para determinar o consumo médio de um
automóvel sendo fornecida a distância total percorrida pelo automóvel
e o total de combustível gasto.
*/




import javax.swing.JOptionPane;

public class Exercicio5 {
    public static void main(String args[]) {
        float distânciaPercorrida = Float.parseFloat(JOptionPane.showInputDialog("Escreva total da distancia percorrida em KM: "));
        float quantidadeCombustivel = Float.parseFloat(JOptionPane.showInputDialog("Escreva o total de combustivel consumido em Litros"));

        float consumoMedio = distânciaPercorrida/quantidadeCombustivel;
        JOptionPane.showMessageDialog(null,"O consumo medio do veiculo foi de :"+consumoMedio+"KM/L");
    }
}