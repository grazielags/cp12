Algoritmo "seis"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 18/07/2019
Var
   vm: vetor [1..4,1..4] de inteiro
   l, c: inteiro


Inicio
   para l de 1 ate 4 passo 1 faca
      para c de 1 ate 4 passo 1 faca
         Escreva("Informe o valor referente a linha ", l, " e coluna ", c, ":")
         Leia(vm[l, c])
      fimpara
   fimpara
   para l de 1 ate 4 passo 1 faca
   Escreval("Linha: ", vm[l])
   fimpara


Fimalgoritmo