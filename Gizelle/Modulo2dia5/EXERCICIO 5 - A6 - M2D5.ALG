Algoritmo "EXERCICIO 5 - A6 - M2D5"
// Crie um algoritmo que armazenará 5 notas de 10 alunos em uma matriz.


Var
notas: vetor [0..9, 0..4] de inteiro
l, c: inteiro


Inicio
para l de 0 ate 9 passo 1 faca
     para c de 0 ate 4 passo 1 faca
          escreva ("Digite uma nota [", l, "][", c, "]")
          leia (notas[l, c])
     fimpara
fimpara
limpatela

para l de 0 ate 9 passo 1 faca
     para c de 0 ate 4 passo 1 faca
          escreva ("Nota [", l, "][", c, "]:", notas[l, c])
          leia (notas[l, c])
     fimpara
fimpara


Fimalgoritmo