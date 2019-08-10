Algoritmo "exercicio 3"
//Elabore um algoritmo que leia dois números inteiros e mostre o
//resultado da diferença do maior valor pelo menor.

var
num1, num2 : inteiro
diferenca : inteiro

inicio
Escreva ("Digite primeiro número: ")
Leia (num1)
Escreva ("Digite segundo número:  ")
Leia (num2)
se num1 > num2 entao
     diferenca <- num1 - num2
     escreval("A diferença do", (" "), num1,(" "), "por", (" "), num2, (" "), "é: ", diferenca)
senao
     diferenca <- num2 - num1
     escreval("A diferença do", (" "), num2, (" "), "por", (" "), num1, (" "), "é: ", diferenca)
fimse

fimalgoritmo