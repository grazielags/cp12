algoritmo "AULA 6 EXERCICIO 2"
//   2. Escreva um algoritmo que multiplique os valores de 2 matrizes 2 x 2.

var
   valor, valor2: vetor [0..1, 0..1] de inteiro
   l, c: inteiro

inicio

   para l de 0 ate 1 passo 1 faca
      para c de 0 ate 1 passo 1 faca
         Escreva("Digite um valor [", l, "][", c, "]: ")
         leia(valor[l, c])
         Escreva("Digite outro valor [", l, "][", c, "]: ")
         leia(valor2[l, c])
      fimpara
   fimpara
   escreval
   para l de 0 ate 1 passo 1 faca
      para c de 0 ate 1 passo 1 faca
         escreval("A multiplicação de l * c na posição ", l, "", c, ": ", valor[l, c] * valor2[l, c])
      fimpara
   fimpara

fimalgoritmo