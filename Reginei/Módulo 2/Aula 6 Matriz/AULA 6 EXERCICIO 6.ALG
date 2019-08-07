Algoritmo "aula 6 exercicio 6"

//6. Escrever um algoritmo que crie uma matriz de 4 x 4 preencha os
//valores da matriz com informações do usuário e obtenha o número
//de uma linha do usuário para realizar a soma dos valores da linha
//informada.

Var
   valor: vetor [0..3, 0..3] de inteiro
   l, c, linha, somaLinha: inteiro

Inicio

   para l de 0 ate 3 passo 1 faca
      para c de 0 ate 3 passo 1 faca
         escreva("Digite o valor", l, " x", c, ": ")
         Leia(valor[l, c])
      fimpara
   fimpara
   limpatela

   Escreva("Digite a linha de (0 a 3) a ser somada: ")
   leia(linha)
   para c de 0 ate 3 passo 1 faca
      somaLinha <- somaLinha + valor[linha, c]
   fimpara
   escreval("A soma da linha é: ",somaLinha)

Fimalgoritmo