Algoritmo "Exercicio10"
//Escreva um algoritmo dado o nome, cargo
//e o seu sal�rio bruto de um funcion�rio considere:
//O sal�rio bruto teve um reajuste de 38%.
//O funcion�rio receber� uma gratifica��o de 20%
//do sal�rio bruto.
//O Sal�rio total � descontado em 15%
//Imprimir Nome, idade e cargo.
//Imprimir o sal�rio bruto.
//Imprimir o sal�rio l�quido.
Var
   nome, cargo: caractere
   idade: inteiro
   salarioBruto, gratificacao, salarioComDesconto: real
Inicio
   Escreva("Digite o nome do funcion�rio: ")
   Leia(nome)
   Escreva("Digite o cargo do funcion�rio: ")
   Leia(cargo)
   Escreva("Digite a idade do funcion�rio: ")
   Leia(idade)
   Escreva("Digite o salario do funcion�rio: ")
   Leia(salarioBruto)

   salarioBruto <- salarioBruto * 1.38
   gratificacao <- salarioBruto * (20/100)
   salarioComDesconto <- (salarioBruto + gratificacao) * 0.85
   Escreval("Nome: ", nome)
   Escreval("Cargo: ", cargo)
   Escreval("Idade: ", idade)
   Escreval("Sal�rio Bruto: ", salarioBruto)
   Escreval("Sal�rio L�quido: ", salarioComDesconto)
Fimalgoritmo