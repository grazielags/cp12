algoritmo "ExemploMaiorMenor"
var
   num1, num2: inteiro
funcao maiorMenor(a, b : inteiro) : inteiro
inicio
      se a > b entao
         retorne a
      senao
         retorne b
      fimse
fimfuncao
inicio
   escreva("Digite o primeiro número: ")
   leia(num1)
   escreva("Digite o segundo número:")
   leia(num2)
   escreval("O maior número é: ", maiorMenor(num1, num2))
      
fimalgoritmo
