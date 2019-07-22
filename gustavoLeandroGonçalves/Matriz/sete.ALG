Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 19/07/2019
Var
   vm: vetor [0..2, 0..2]
   l, c, soma: inteiro


Inicio
   para l de 0 ate 2 passo 1 faca
      para c de 0 ate 2 passo 1 faca
         soma<- l+c
         Escreval("A soma da linha ", l, " com a coluna ", c, " é: ", soma)
      fimse
   fimpara
fimpara


Fimalgoritmo