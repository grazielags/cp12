Algoritmo "aula 6 exercicio 6"

//6. Escrever um algoritmo que crie uma matriz de 4 x 4 preencha os
//valores da matriz com informações do usuário e obtenha o número
//de uma linha do usuário para realizar a soma dos valores da linha
//informada.

Var
   valor: vetor [1..4, 1..4] de inteiro
   l, c, somaLinha: inteiro

Inicio

   para l de 1 ate 4 passo 1 faca
      para c de 1 ate 4 passo 1 faca
         escreva("Digite o valor", l, " x", c, ": ")
         Leia(valor[l, c])

      fimpara
   fimpara
      para l de 1 ate 1 passo 1 faca
   Escreva("Digite a linha a ser somada: ")
   leia(valor[l,c])
   somaLinha<-somaLInha + valor[l]
   escreval("A soma da linha é: ",somaLinha)

   fimpara
Fimalgoritmo