Algoritmo "EXERCICIO 7 - A7 - M2D6"
// Escreva uma fun��o que retornar� se o n�mero informado pelo usu�rio
// � par ou �mpar.


 
var
num, numero : inteiro

funcao impar() : caracter
Inicio
   retorne "�  um n�mero �mpar"
fimfuncao

funcao par()  : caractere
inicio
      retorne "� um n�mero par")
fimfuncao

inicio
   escreva ("Digite um n�mero: ")
   Leia (num)
   escreval (" ")
   se num mod 2 = 0 entao
         escreval (par())
      senao
         escreval (impar())
   fimSe

Fimalgoritmo