Algoritmo "aula 5 xercicio 1"

//1. Escreva um algoritmo que possua um vetor inteiro de 5 posi��es
//com os n�meros fornecidos pelo usu�rio atrav�s do leia. Ap�s
//preencher o vetor apresentar a posi��o e o valor preenchido nessa
//posi��o.

var

notas : vetor [0..4] de inteiro
i : inteiro

inicio

para i de 0 ate 4 passo 1 faca
Escreval("Digite a nota: ")
leia(notas[i])
fimpara
limpatela
para i de 0 ate 4 passo 1 faca
Escreval(notas[i], " -> ", i)
fimpara

fimalgoritmo