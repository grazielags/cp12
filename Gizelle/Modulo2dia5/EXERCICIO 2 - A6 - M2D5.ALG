algoritmo "exercicio 2 - M2A5"
//Escreva um algoritmo que multiplique os valores de 2 matrizes 2 x 2.

var
matrizA, matrizB : vetor [0..1, 0..1] de inteiro
l, c : inteiro

inicio
para l de 0 ate 1 passo 1 faca
     para c de 0 ate 1 passo 1 faca
          Escreva("Informe os valores da Matriz A ",l , " x ",c , " : ")
          leia(matrizA[l, c])
          fimpara
fimpara

para l de 0 ate 1 passo 1 faca
     para c de 0 ate 1 passo 1 faca
          Escreva("Informe os valores da Matriz B ",l , " x ",c , " : ")
          leia(matrizB[l, c])
          fimpara
fimpara

escreval(" ")
para l de 0 ate 1 passo 1 faca
     para c de 0 ate 1 passo 1 faca
     Escreval("Valores da multiplicação Matriz A x matriz B[", l, "][", c, "] = ", ((matrizA[l,c]) * (matrizB[l,c])))
     fimpara
fimpara



fimalgoritmo