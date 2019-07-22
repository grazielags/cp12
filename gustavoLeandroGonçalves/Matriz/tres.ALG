Algoritmo "tres"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 18/07/2019
Var
   vm: vetor [1..5, 1..5] de inteiro
   l, c: inteiro


Inicio
   para l de 1 ate 5 passo 1 faca
      para c de 1 ate 5 passo 1 faca
         escreva("Informe o valor referente a linha ", l, " e coluna ", c, ":")
         leia(vm[l, c])
      fimpara
   fimpara
   para l de 1 ate 5 passo 1 faca
      para c de 1 ate 5 passo 1 faca
         se l = c entao
            Escreval("Linha ", l, " e Coluna ", c,":", vm[l, c])
         fimse
      fimpara
   fimpara
Fimalgoritmo