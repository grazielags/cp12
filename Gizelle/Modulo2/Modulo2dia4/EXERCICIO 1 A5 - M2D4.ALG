Algoritmo "EXERCICIO 1 A5 - M3A1"
//Escreva um algoritmo que possua um vetor inteiro de 5 posi��es
//com os n�meros fornecidos pelo usu�rio atrav�s do leia. Ap�s
//preencher o vetor apresentar a posi��o e o valor preenchido nessa
//posi��o.

Var
numero : vetor [1..5] de inteiro
i : inteiro

inicio

para i de 1 ate 5 passo 1 faca
   Escreva("Digite o n�mero: ")
   leia(numero[i])
fimpara

Escreval(" ")
para i de 1 ate 5 passo 1 faca
   Escreval("Posi��o:", i,(" - "), numero[i])
fimpara




Fimalgoritmo