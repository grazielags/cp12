Algoritmo "EXERCICIO 7 - A7 - M2D6"
// Escreva uma função que retornará se o número informado pelo usuário
// é par ou ímpar.


 
var
num, numero : inteiro

funcao impar() : caracter
Inicio
   retorne "É  um número ímpar"
fimfuncao

funcao par()  : caractere
inicio
      retorne "É um número par")
fimfuncao

inicio
   escreva ("Digite um número: ")
   Leia (num)
   escreval (" ")
   se num mod 2 = 0 entao
         escreval (par())
      senao
         escreval (impar())
   fimSe

Fimalgoritmo