Algoritmo "EXERCICIO 1-P2 - A7 - M2D6"
// Escreva um algoritmo com uma fun��o que receba por par�metro um n�mero
//e retorne se este n�mero � par ou �mpar.

 // sem resultado
 
var
numero, resultado: inteiro


funcao resultado (numero: inteiro): inteiro


var
resultado : inteiro

inicio
se resultado mod 2 = 0 entao
           escreva("O n�mero ", numero, " � par!")
       senao
           escreva("O n�mero ", numero, " � �mpar!")
       fimse
retorne numero

fimfuncao


inicio
escreva ("Digite um numero: ")
leia (numero)
Escreval(resultado())

fimalgoritmo