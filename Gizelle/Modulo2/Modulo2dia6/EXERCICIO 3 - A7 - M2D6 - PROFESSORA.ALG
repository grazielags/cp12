Algoritmo "EXERCICIO 3 - A7 - M2D6 professora"
//Escreva uma fun��o que retorna o n�mero maior de 2 n�meros
// obtidos do usu�rio.

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

escreva("Digite primeiro n�mero: ")
leia (num1)
escreva("Digite segundo n�mero: ")
leia (num2)
maior <- maiorValor()
   escreva ("O maior n�mero entre ", num1, " e ", num2, " � ", maiorvalor())

Fimalgoritmo