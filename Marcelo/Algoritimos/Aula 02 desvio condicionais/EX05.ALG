Algoritmo "semnome"
// Faça um algoritmo que leia um número e mostre uma mensagem
//indicando se este número é par ou ímpar e se é positivo ou
//negativo.
Var
   // Seção de Declarações das variáveis
   n1: inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   Escreval( " Escreva um numero " )
   leia (n1)
   se n1 MOD 2 = 0 entao
      Escreval("Par")
   senao
      Escreval ("Impar")
      fimse
      se n1 >= 0 entao
      Escreval ("positivo" )
      senao
      Escreval("negativo" )
      fimse


Fimalgoritmo