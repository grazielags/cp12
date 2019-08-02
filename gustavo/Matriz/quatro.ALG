Algoritmo "quatro"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 18/07/2019
Var
vm: vetor [1..5, 1..5] de inteiro
l, c, soma: inteiro


Inicio
para l de 1 ate 5 passo 1 faca
     para c de 1 ate 5 passo 1 faca
          Escreva("Infore o valor referente a Linha ", l, " e a Coluna: ", c, ":")
          Leia(vm[l, c])
          soma <- soma + vm[l, c]
     fimpara
fimpara

Escreval("Resultado da soma: ", soma)



Fimalgoritmo