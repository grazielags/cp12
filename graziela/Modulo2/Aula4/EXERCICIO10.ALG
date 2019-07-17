Algoritmo "Exercicio10"
//Escreva um algoritmo dado o nome, cargo
//e o seu salário bruto de um funcionário considere:
//O salário bruto teve um reajuste de 38%.
//O funcionário receberá uma gratificação de 20%
//do salário bruto.
//O Salário total é descontado em 15%
//Imprimir Nome, idade e cargo.
//Imprimir o salário bruto.
//Imprimir o salário líquido.
Var
   nome, cargo: caractere
   idade: inteiro
   salarioBruto, gratificacao, salarioComDesconto: real
Inicio
   Escreva("Digite o nome do funcionário: ")
   Leia(nome)
   Escreva("Digite o cargo do funcionário: ")
   Leia(cargo)
   Escreva("Digite a idade do funcionário: ")
   Leia(idade)
   Escreva("Digite o salario do funcionário: ")
   Leia(salarioBruto)

   salarioBruto <- salarioBruto * 1.38
   gratificacao <- salarioBruto * (20/100)
   salarioComDesconto <- (salarioBruto + gratificacao) * 0.85
   Escreval("Nome: ", nome)
   Escreval("Cargo: ", cargo)
   Escreval("Idade: ", idade)
   Escreval("Salário Bruto: ", salarioBruto)
   Escreval("Salário Líquido: ", salarioComDesconto)
Fimalgoritmo