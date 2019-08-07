algoritmo "Exercicio7"
//Escreva uma função que retornará se o número
//informado pelo usuário é par ou ímpar.
var
   numero: inteiro
funcao ehPar(): caractere
inicio
   se numero % 2 = 0 entao
      retorne "O número é par! "
   senao
      retorne "O número é ímpar!"
   fimse
fimfuncao
inicio
   escreva("Digite um número: ")
   leia(numero)
   escreval(ehPar())
fimalgoritmo
