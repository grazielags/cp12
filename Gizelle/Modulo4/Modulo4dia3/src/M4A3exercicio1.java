import javax.swing.JOptionPane;

public class M4A3exercicio1 {
// Uma empresa possui 10 funcionários. Ela resolveu realizar uma pesquisa entre seus funcionários, 
//coletando dados sobre o salário e número de filhos. A empresa deseja saber: 

// a) média do salário dos funcionários;
// b) média do número de filhos;
// c) maior salário;
// d) menor salário;
// e) percentual de pessoas com salário menor que R$1000,00.

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
			salario = Integer.parseInt(JOptionPane.showInputDialog("Digite seu SALÁRIO: "));
			filho = Integer.parseInt(JOptionPane.showInputDialog("Digite número de FILHOS: "));
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
		JOptionPane.showMessageDialog(null, "Média salário: " + somaSalario/qtyFuncionario
											+ "\nMédia Filhos: " + somaFilho/qtyFuncionario
											+ "\nMenor salário: " + menor
											+ "\nMaior salário: " + maior
											+ "\n% de Func com salário menor que 1000: " + percentual);
	}
}

