import javax.swing.JOptionPane;

public class M4A3exercicio1 {
// Uma empresa possui 10 funcion�rios. Ela resolveu realizar uma pesquisa entre seus funcion�rios, 
//coletando dados sobre o sal�rio e n�mero de filhos. A empresa deseja saber: 

// a) m�dia do sal�rio dos funcion�rios;
// b) m�dia do n�mero de filhos;
// c) maior sal�rio;
// d) menor sal�rio;
// e) percentual de pessoas com sal�rio menor que R$1000,00.

	public static void main(String[]args) {
		int maior = 0;
		int menor = 0;
		int salario = 0;
		int qtyFuncionario = 0;
		double qtyFuncionarioBaixo = 0;
		double somaSalario = 0;
		double somaFilho = 0;
		int filho = 0;
		qtyFuncionario = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Funcionarios: "));
		for (int i = 1; i <= qtyFuncionario; i++) {
			salario = Integer.parseInt(JOptionPane.showInputDialog("Digite seu SAL�RIO: "));
			filho = Integer.parseInt(JOptionPane.showInputDialog("Digite n�mero de FILHOS: "));
			somaFilho += filho;
			somaSalario += salario;
					
			if (i == 1) {
				maior = salario;
				menor = salario;
			} else {
				if (salario > maior) {
					maior = salario;
				}
				if (salario < menor) {
					menor = salario;
				}
			}
			if (salario < 1000) {
				qtyFuncionarioBaixo++;
			}
		}
		double percentual = (qtyFuncionarioBaixo/qtyFuncionario)*100;
		JOptionPane.showMessageDialog(null, "M�dia sal�rio: " + somaSalario/qtyFuncionario
											+ "\nM�dia Filhos: " + somaFilho/qtyFuncionario
											+ "\nMenor sal�rio: " + menor
											+ "\nMaior sal�rio: " + maior
											+ "\n% de Func com sal�rio menor que 1000: " + percentual);
	}
}

