Algoritmo "EXERCICIO 7 - A7 - M2D6 professora"
// Escreva uma função que retornará se o número informado pelo usuário
// é par ou ímpar.

 
var
num : inteiro

funcao impar() : caracter
Inicio
   se (num % 2 = 0) entao
      escreval (" ")
      retorne ("É um número par")
   senao
        escreval (" ")
        retorne ("É um número ímpar")
   fimse
fimfuncao

inicio
   escreva ("Digite um número: ")
   Leia (num)
      escreva (impar())

 escreval (" ")
Fimalgoritmo