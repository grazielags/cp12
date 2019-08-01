algoritmo "AULA 6 EXERCICIO 1"
//1. Escrever um algoritmo que crie uma matriz de 4 x 4
//preencha os valores da matriz com informações do usuário e após
//verifique qual o maior valor e qual o menor valor presente na matriz.

var
   valor : vetor [0..3, 0..3] de inteiro
   l, c, maior, menor: inteiro

inicio

   para l de 0 ate 3 passo 1 faca
      para c de 0 ate 3 passo 1 faca
         Escreva("Digite um valor [", l, "][", c, "]: ")
         leia(valor[l, c])
         se (l = 0) e (c = 0) entao
            maior <-valor[l, c]
            menor <-valor[l, c]
         senao
            se valor[l, c] > maior entao
               maior <- valor[l, c]
            fimse
            se valor[l, c] < menor entao
               menor <- valor[l, c]
            fimse
         fimse
      fimpara
   fimpara
   escreval

   escreval("Maior nota: ", maior)
   escreval("menor nota: ", menor)

fimalgoritmo