Algoritmo "dez"
//Escreva um algoritmo dado o nome, cargo e o seu sal�rio bruto de
//um funcion�rio considere:
//a. O sal�rio bruto teve um reajuste de 38%.
//b. O funcion�rio receber� uma gratifica��o de 20% do sal�rio bruto.
//c. O Sal�rio total � descontado em 15%
//d. Imprimir Nome, idade e cargo.
//e. Imprimir o sal�rio bruto.
//f. Imprimir o sal�rio l�quido.
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
Escreva("Digite seu Sal�rio Bruto: ")
Leia(salarioBruto)
Escreval("Sal�rio Bruto recebeu um reajuste de 38%!!!")
salarioBruto <- salarioBruto * 1.38
Escreval("Atualizado: ", salarioBruto, " com reajuste.")
Escreval("Voc� recebeu uma gratifica��o de 20% do Sal�rio Bruto!!!")
salarioBruto <- salarioBruto * 1.20
Escreval("Atualizado: ", salarioBruto, " com gratifica��o.")
Escreval("Total de descontos: 15%")
salarioLiquido <- salarioBruto * 0.85

Escreval("Nome: ", nome, "; Idade: ", idade, "; Cargo: ", cargo, ".")
Escreval("Sal�rio Bruto: ", salarioBruto)
Escreval("Sal�rio Liquido: ", salarioLiquido)


Fimalgoritmo