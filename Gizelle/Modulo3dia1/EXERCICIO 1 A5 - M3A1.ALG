Algoritmo "EXERCICIO 1 A5 - M3A1"
//Escreva um algoritmo que possua um vetor inteiro de 5 posições
//com os números fornecidos pelo usuário através do leia. Após
//preencher o vetor apresentar a posição e o valor preenchido nessa
//posição.

Var
numero : vetor [1..5] de inteiro
i : inteiro

inicio

para i de 1 ate 5 passo 1 faca
   Escreva("Digite o número: ")
   leia(numero[i])
fimpara

Escreval(" ")
para i de 1 ate 5 passo 1 faca
   Escreval("Posição:", i,(" - "), numero[i])
fimpara




Fimalgoritmo