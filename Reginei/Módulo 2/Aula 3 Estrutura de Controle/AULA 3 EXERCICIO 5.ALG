Algoritmo "aula 3 exercicio 5"
//Fa�a um algoritmo que leia um n�mero e mostre uma mensagem indicando se este
// n�mero � par ou �mpar e se � positivo ou negativo.

Var
   numero:inteiro
   par, impar:caractere
   positivo, negativo:logico
Inicio
      escreva("digite um  numero: ")
      leia(numero)
      se (numero mod 2) = 0 entao
      escreval(numero , " : Este n�mero � par")
      senao
      escreval(numero , " : Este n�mero � impar")
      fimse
      
Fimalgoritmo