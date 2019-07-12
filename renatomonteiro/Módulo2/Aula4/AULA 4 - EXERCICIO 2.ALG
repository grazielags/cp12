Algoritmo "Aula 4 - exercicio 2"

//2. Entre com 1 valor n e calcule e apresente o valor da tabuada de 1
//até esse valor n, conforme o exemplo abaixo:
//1 x n = n
//2 x n = 2n
//3 x n = 3n
var

   maior, menor, i, m, n, soma: inteiro

inicio
   escreva ("digite um numero")
   leia (m)
   escreva ("digite um numero")
   leia (n)
   se m > n entao
      maior <- m
      menor <- n
   senao
      maior <- n
      menor <- m
   fimse
   para i de menor ate maior passo 1 faca
        soma <- soma + i
   fimpara
   escreva ("a soma dos valores e: ", soma)
   
fimalgoritmo
