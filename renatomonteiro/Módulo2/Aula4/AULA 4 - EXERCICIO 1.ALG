Algoritmo "Aula 4 - exercicio 1"

//1. Somar os valores digitados enquanto o valor for par. No fim do
//algoritmo apresentar os valores da soma.

var

   valor1, resultado: inteiro
   
inicio

   escreva("digite um numero: ")
   leia (valor1)
   enquanto valor1 mod 2 = 0 faca
   resultado <- valor1 + resultado
   escreva("digite um numero: ")
   leia (valor1)

   fimenquanto

   escreva (resultado)
   
fimalgoritmo