Algoritmo "dois"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 18/07/2019
Var
   vmA: vetor [1..2, 1..2] de inteiro
   vmB: vetor [1..2, 1..2] de inteiro
   linha, coluna: inteiro

Inicio
   para linha de 1 ate 2 passo 1 faca
      para coluna de 1 ate 2 passo 1 faca
         Escreva("Informe o valor da linha ", linha, " e coluna ", coluna,":")
         Leia(vmA[linha, coluna])
      fimpara
   fimpara
   para linha de 1 ate 2 passo 1 faca
      para coluna de 1 ate 2 passo 1 faca
         Escreva("Informe o valor da linha ", linha, " e coluna ", coluna,":")
         Leia(vmB[linha, coluna])
      fimpara
   fimpara
   para linha de 1 ate 2 passo 1 faca
      para coluna de 1 ate 2 passo 1 faca
           Escreval("Multiplicação das matrizes:", vmA[linha,coluna]*vmB[linha,coluna])
      fimpara
   fimpara
Fimalgoritmo