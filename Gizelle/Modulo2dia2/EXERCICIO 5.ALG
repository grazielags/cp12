Algoritmo "exercicio 5"
//Faça um algoritmo que leia um número e mostre uma mensagem
//indicando se este número é par ou ímpar e se é positivo ou
//negativo. (CondicionalEncadead0)

var
numero : inteiro


inicio
      Escreva ("Digite um número: ")
      Leia (numero)
      escreval (" ")
           se numero > 0 entao
              escreva ("Número positivo")
           senão
              escreva("Número negativo")
           fimse
      escreval (" ")
           se (numero mod 2) = 0 entao
              escreva ("Número par")
           senão
              escreva ("Número impar")
           fimse
      escreval(" ")

fimalgoritmo