Algoritmo "EXERCICIO 3 COM - M2D4"
//Preencha 2 vetores de 5 posições cada um e armazene números nele. Após isso
//multiplique os elemento de mesma posição e armazene em um terceiro vetor.
//Por fim apresente o resultado da multiplicação desses vetores

Var
matrizA, matrizB : vetor [0..4, 0..4] de inteiro
l, c : inteiro

inicio
para l de 0 ate 4 passo 1 faca
     para c de 0 ate 4 passo 1 faca
          Escreva("Informe os valores da Matriz A ",l , " x ",c , " : ")
          leia(matrizA[l, c])
          fimpara
fimpara

para l de 0 ate 4 passo 1 faca
     para c de 0 ate 4 passo 1 faca
          Escreva("Informe os valores da Matriz B ",l , " x ",c , " : ")
          leia(matrizB[l, c])
          fimpara
fimpara

escreval(" ")
para l de 0 ate 4 passo 1 faca
     para c de 0 ate 4 passo 1 faca
     Escreval("Valores da * M-A x M-B[", l, "][", c, "] = ", ((matrizA[l,0]) * (matrizB[0,c])))
     Escreval("Valores da * M-A x M-B[", l, "][", c, "] = ", ((matrizA[0,l]) * (matrizB[c,0])))
     fimpara
fimpara


fimalgoritmo