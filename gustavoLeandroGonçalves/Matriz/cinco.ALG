Algoritmo "cinco"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 18/07/2019
Var
   vm: vetor [1..5,1..10] de inteiro
   l, c: inteiro


Inicio
   para l de 1 ate 5 passo 1 faca
      para c de 1 ate 10 passo 1 faca
         escreva("Informe a nota ", l, " do aluno ", c, ":")
         leia(vm[l, c])
      fimpara
   fimpara



Fimalgoritmo