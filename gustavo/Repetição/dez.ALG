Algoritmo "dez"
//Escreva um algoritmo dado o nome, cargo e o seu salário bruto de
//um funcionário considere:
//a. O salário bruto teve um reajuste de 38%.
//b. O funcionário receberá uma gratificação de 20% do salário bruto.
//c. O Salário total é descontado em 15%
//d. Imprimir Nome, idade e cargo.
//e. Imprimir o salário bruto.
//f. Imprimir o salário líquido.
Var
nome, cargo: caracter
idade: inteiro
salarioBruto, salarioLiquido: real


Inicio
Escreva("Digite seu nome: ")
Leia(nome)
Escreva("Digite seu idade: ")
Leia(idade)
Escreva("Digite seu cargo: ")
Leia(cargo)
Escreva("Digite seu Salário Bruto: ")
Leia(salarioBruto)
Escreval("Salário Bruto recebeu um reajuste de 38%!!!")
salarioBruto <- salarioBruto * 1.38
Escreval("Atualizado: ", salarioBruto, " com reajuste.")
Escreval("Você recebeu uma gratificação de 20% do Salário Bruto!!!")
salarioBruto <- salarioBruto * 1.20
Escreval("Atualizado: ", salarioBruto, " com gratificação.")
Escreval("Total de descontos: 15%")
salarioLiquido <- salarioBruto * 0.85

Escreval("Nome: ", nome, "; Idade: ", idade, "; Cargo: ", cargo, ".")
Escreval("Salário Bruto: ", salarioBruto)
Escreval("Salário Liquido: ", salarioLiquido)


Fimalgoritmo