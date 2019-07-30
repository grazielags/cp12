algoritmo "exercicio 3 - M2A5"
//Escreva um algoritmo que preencha os valores de uma matriz 5 x 5 e após
//a matriz estar preenchida deve apresentar os valores da diagonal da matriz.
//Começando pelo valor na posição 0 x 0.

var
matrizA, matrizB : vetor [0..4, 0..4] de inteiro
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
     Escreval("Valores da multiplicação Matriz A x matriz B[", l, "][", c, "] = ", ((matrizA[l,0]) * (matrizB[0,c])))
     fimpara
fimpara



fimalgoritmo