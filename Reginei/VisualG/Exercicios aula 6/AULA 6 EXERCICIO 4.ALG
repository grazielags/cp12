Algoritmo "aula 6 exercicio 4"
//4. Escrever um algoritmo que preencha os valores de uma matriz 5x5.
//Após a matriz estar preenchida realizar a soma de todos os
//elementos da matriz e apresentar o resultado na tela.

Var
   valor: vetor [1..5, 1..5] de inteiro
   l, c, soma: inteiro

Inicio

   para l de 1 ate 5 passo 1 faca
      para c de 1 ate 5 passo 1 faca
         Escreva("Digite um valor para Linha",l, " e Coluna",c, ": ")
         Leia(valor[l, c])
         soma <- soma + valor[l, c]
      fimpara
   fimpara
   escreval
   Escreval("Resultado da soma: ", soma)

Fimalgoritmo