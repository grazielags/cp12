Algoritmo "EXERCICIO 3 - A7 - M2D6"
//Escreva uma fun��o que retorna o n�mero maior de 2 n�meros
// obtidos do usu�rio.

var
num1, num2: inteiro

funcao comparacao() : caractere
   inicio
   retorne "O primeiro n�mero � maior do que o segundo n�mero"
fimfuncao

funcao outro() : caractere
   inicio
   retorne "O segundo n�mero � maior do que o primeiro n�mero"
fimfuncao

inicio

escreva("Digite primeiro n�mero: ")
leia (num1)
escreva("Digite segundo n�mero: ")
leia (num2)

// est� errado pq o se deveria estardentro da fun��o.

   se num1 > num2 entao
      escreval (comparacao())
      senao
           escreval (outro())
   fimse

Fimalgoritmo