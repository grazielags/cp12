Algoritmo "exercicio 3"
//Elabore um algoritmo que leia dois n�meros inteiros e mostre o
//resultado da diferen�a do maior valor pelo menor.

var
num1, num2 : inteiro
diferenca : inteiro

inicio
Escreva ("Digite primeiro n�mero: ")
Leia (num1)
Escreva ("Digite segundo n�mero:  ")
Leia (num2)
se num1 > num2 entao
     diferenca <- num1 - num2
     escreval("A diferen�a do", (" "), num1,(" "), "por", (" "), num2, (" "), "�: ", diferenca)
senao
     diferenca <- num2 - num1
     escreval("A diferen�a do", (" "), num2, (" "), "por", (" "), num1, (" "), "�: ", diferenca)
fimse

fimalgoritmo