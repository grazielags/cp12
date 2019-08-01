Algoritmo "EXERCICIO 3 - A7 - M2D6 professora"
//Escreva uma função que retorna o número maior de 2 números
// obtidos do usuário.

var
num1, num2, maior: inteiro

funcao maiorValor() : inteiro
   inicio
   se num1 > num2 entao
      retorne num1
   senao
        retorne num2
   fimse
fimfuncao


inicio

escreva("Digite primeiro número: ")
leia (num1)
escreva("Digite segundo número: ")
leia (num2)
maior <- maiorValor()
   escreva ("O maior número entre ", num1, " e ", num2, " é ", maiorvalor())

Fimalgoritmo