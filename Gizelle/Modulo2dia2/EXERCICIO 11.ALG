Algoritmo "exercicio 11"
//Uma empresa realizará um ajuste salarial variável de acordo com o cargo,
//conforme a tabela abaixo. Escreva um algoritmo que leia o salário e o
//cargo de um funcionário e calcule o novo salário. Se o funcionário for
//de um cargo diferente dos apresentados na tabela, ele deverá então receber
//40% de aumento. Mostre o salário antigo, o novo salário e a diferença.

//Código Cargo Percentual
//       1 Estagiário 10%
//       2 Desenvolvedor 20%
//       3 Analista 30%

Var
nome : caractere
cargo, percentual, estagiario, desenvolvedor, analista, outro, salario : real

Inicio
escreva ("Nome do funcionário: ")
leia (nome)
Escreva ("Digite (1 estagiario, 2 desenvolvedor, 3 analista ou 4 outro): ")
Leia (cargo)
Escreva ("Digite o salario: ")
Leia (salario)


se (cargo = 1) entao
estagiario <- salario+(salario*10/100)
Escreval (nome, " seu salário sofreu aumento de R$", salario, (" para R$"), estagiario)
fimse

se (cargo = 2) entao
desenvolvedor <- salario+(salario*20/100)
Escreval (nome, " seu salário sofreu aumento de R$", salario, (" para R$"), desenvolvedor)
fimse

se (cargo = 3) entao
analista <- salario+(salario*30/100)
Escreval (nome, " seu salário sofreu aumento de R$", salario, (" para R$"), analista)
fimse

se (cargo = 4) entao
outro <- salario+(salario*40/100)
Escreval (nome, " seu salário sofreu aumento de R$", salario, (" para R$"), outro)
fimse

Fimalgoritmo