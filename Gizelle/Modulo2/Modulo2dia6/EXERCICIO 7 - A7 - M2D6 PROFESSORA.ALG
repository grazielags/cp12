Algoritmo "EXERCICIO 7 - A7 - M2D6 professora"
// Escreva uma fun��o que retornar� se o n�mero informado pelo usu�rio
// � par ou �mpar.

 
var
num : inteiro

funcao impar() : caracter
Inicio
   se (num % 2 = 0) entao
      escreval (" ")
      retorne ("� um n�mero par")
   senao
        escreval (" ")
        retorne ("� um n�mero �mpar")
   fimse
fimfuncao

inicio
   escreva ("Digite um n�mero: ")
   Leia (num)
      escreva (impar())

 escreval (" ")
Fimalgoritmo