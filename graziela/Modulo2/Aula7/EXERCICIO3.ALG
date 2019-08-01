algoritmo "Exercicio3"
//Escreva uma função que retorna o número maior
//de 2 números obtidos do usuário.
var
   num1, num2, maior: inteiro

funcao maiorValor(): inteiro
inicio
   se num1 > num2 entao
      retorne num1
   senao
      retorne num2
   fimse
fimfuncao
inicio
   escreva("Digite o primeiro número: ")
   leia(num1)
   escreva("Digite o segundo número: ")
   leia(num2)
   maior <- maiorValor()
   escreval("O maior número entre ", num1, " e ", num2, " é: ", maior)
fimalgoritmo
