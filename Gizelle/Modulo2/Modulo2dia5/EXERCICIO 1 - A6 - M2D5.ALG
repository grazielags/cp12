algoritmo "exercicio A - M2A5"
//Escrever um algoritmo que crie uma matriz de 4 x 4 preencha os valores da
//matriz com informações do usuário e após verifique qual o maior valor e
//qual o menor valor presente na matriz.

var
notas : vetor [0..3, 0..3] de inteiro
l, c, maior, menor : inteiro

inicio
para l de 0 ate 3 passo 1 faca
     para c de 0 ate 3 passo 1 faca
          Escreva("Digite a nota [", l, "][", c, "] = ")
          leia(notas[l, c])
           se (l = 0) e (c = 0) entao
              maior <- notas[l, c]
              menor <- notas[l, c]
           senao
              se notas[l, c] > maior entao
                 maior <- notas[l, c]
              fimse
           fimse
     fimpara
fimpara
escreval(" ")
para l de 0 ate 3 passo 1 faca
     para c de 0 ate 3 passo 1 faca
                    Escreval("Nota [", l, "][", c, "] = ", notas[l, c])
     fimpara
fimpara

escreval (" ")
escreval ("Menor valor de nota é:", menor)
Escreval ("Maior valor de nota é", maior)

fimalgoritmo