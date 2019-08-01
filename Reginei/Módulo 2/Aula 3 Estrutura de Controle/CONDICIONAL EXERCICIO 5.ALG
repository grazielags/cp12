Algoritmo "aula 3 exercicio 5"
//Faça um algoritmo que leia um número e mostre uma mensagem indicando se este
// número é par ou ímpar e se é positivo ou negativo.

Var
   numero:inteiro
   par, impar:caractere
   positivo, negativo:logico
Inicio
      escreva("digite um  numero: ")
      leia(numero)
      se (numero mod 2) = 0 entao
      escreva(numero , " é par")
      senao
      escreva(numero , " é impar")
      fimse
Fimalgoritmo