Algoritmo "EXERCICIO 4 - A6 - M2D5"
// Escrever um algoritmo que preencha os valores de uma matriz 5x5.
// Ap�s a matriz estar preenchida realizar a soma de todos os elementos da
//matriz e apresentar o resultado na tela


Var
valores: vetor [0..4,0..4] de inteiro
l, c, soma : inteiro
// assim que declara a soma aqui ela j� temo valor de zero por isso
// l� embaixo n�o preciso informar soma<- 0 antes de tudo


Inicio
para l de 0 ate 4 passo 1 faca
     para c de 0 ate 4 passo 1 faca
          escreva ("Digite valor (", l, ") (", c, ")")
          leia (valores [l, c])
          soma <- soma + valores [l, c]
     fimpara
fimpara

escreval (" ")
escreval ("soma dos valores �: ", soma)

Fimalgoritmo