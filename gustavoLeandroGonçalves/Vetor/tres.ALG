Algoritmo "tres"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 16/07/2019
Var
n: vetor [1..10] de real
i: inteiro


Inicio
para i de 1 ate 10 passo 1 faca
     Escreva("Digite o numero ", i, ": ")
     Leia(n[i])
     n[i] <- n[i] / 2
fimpara
Escreval("Valores armazenados: ")
para i de 1 ate 10 passo 1 faca
     Escreval("Posição", i, ":", n[i])
fimpara


Fimalgoritmo