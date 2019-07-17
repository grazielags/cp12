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

Fimalgoritmo