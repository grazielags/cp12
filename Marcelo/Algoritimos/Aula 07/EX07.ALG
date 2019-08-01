Algoritmo "semnome"
// Escreva uma função que retornará se o número informado pelo usuário
//é par ou ímpar.
var
   num1: inteiro

funcao parouimpar() : logico
inicio
      retorne num1 % 2 = 0
fimfuncao
inicio
      escreva("Digite o primeiro número: ")
      leia(num1)

      se parouimpar() = verdadeiro entao
         escreval(" É par!")
         senao
         Escreval ("É impar!")
      fimse
fimalgoritmo