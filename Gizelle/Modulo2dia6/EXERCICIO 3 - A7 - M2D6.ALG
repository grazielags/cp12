Algoritmo "EXERCICIO 3 - A7 - M2D6"
//Escreva uma função que retorna o número maior de 2 números
// obtidos do usuário.

var
num1, num2: inteiro

funcao comparacao() : caractere
   inicio
   retorne "O primeiro número é maior do que o segundo número"
fimfuncao

funcao outro() : caractere
   inicio
   retorne "O segundo número é maior do que o primeiro número"
fimfuncao

inicio

escreva("Digite primeiro número: ")
leia (num1)
escreva("Digite segundo número: ")
leia (num2)

   se num1 > num2 entao
      escreval (comparacao())
      senao
           escreval (outro())
   fimse

Fimalgoritmo