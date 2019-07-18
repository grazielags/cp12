Algoritmo "aula 4 xercicio 10"
//10. Escreva um algoritmo dado o nome, cargo e o seu salário bruto de
//um funcionário considere:

//a. O salário bruto teve um reajuste de 38%.
//b. O funcionário receberá uma gratificação de 20% do salário bruto.
//c. O Salário total é descontado em 15%
//d. Imprimir Nome, idade e cargo.
//e. Imprimir o salário bruto.
//f. Imprimir o salário líquido.
Var

<<<<<<< HEAD
   nome, cargo:caractere
   salariobruto, gratificacao, salariodesconto:real
   idade: inteiro

Inicio

   escreva("Digite o nome do funcionario: ")
   leia (nome)
   escreva("Digite o cargo: ")
   leia (cargo)
   escreva("Digite o salario: ")
   leia (salarioBruto)
   escreva("Digite a idade: ")
   leia (idade)
   salariobruto <- salariobruto * 1.38
   gratificacao <- salariobruto * (20/100)
   salariodesconto <- (salariobruto +gratificacao) * 0.85
   escreval
   escreval("nome: ", nome)
   escreval("cargo: ", cargo)
   escreval("salario bruto: ", salariobruto)
   escreval("salario liquido: ", salariodesconto)

=======
   salariocomdesconto, salariobruto, salariobruto2, idade, salarioliquido, gratificacao, reajuste: real
   nome, cargo: caractere

Inicio

   escreva("Qual seu nome?")
   leia (nome)
   escreva("Qual seu cargo?")
   leia (cargo)
   escreva("Qual sua idade?")
   leia (idade)
   escreva("Qual seu salario?")
   leia (salariobruto)
   salariobruto <- salariobruto * 1.38
   gratificacao <- salariobruto * (20/100)
   salariocomdesconto <- (salariobruto + gratificacao) * 0.85

   escreval ("o nome do funcionario e: ", nome)
   escreval ("o cargo do funcionario e: ", cargo)
   escreval ("o nome do funcionario e: ", idade)
   escreval ("o salário bruto é: ", salariobruto)
   escreval ("o salário liquido é: ", salariocomdesconto)
>>>>>>> 58fcf6bcbfdf76bdbb16f13f9dadd7a2017320b8

Fimalgoritmo