Algoritmo "semnome"
// Escreva uma fun��o que retornar� se o n�mero informado pelo usu�rio
//� par ou �mpar.
var
   num1: inteiro

funcao parouimpar() : logico
inicio
      retorne num1 % 2 = 0
fimfuncao
inicio
      escreva("Digite o primeiro n�mero: ")
      leia(num1)

      se parouimpar() = verdadeiro entao
         escreval(" � par!")
         senao
         Escreval ("� impar!")
      fimse
fimalgoritmo