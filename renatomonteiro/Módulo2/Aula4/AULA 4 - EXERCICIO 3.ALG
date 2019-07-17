Algoritmo "Aula 4 - exercicio 3"

//Escrever um algoritmo que leia valores para m e n e que calcule a
//soma dos valores entre o menor valor de m e n e o maior valor de
//m e n.

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
