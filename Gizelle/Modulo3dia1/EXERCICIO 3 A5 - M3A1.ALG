Algoritmo "EXERCICIO 3 A5 - M3A1"
//Escreva um algoritmo que receba 10 números obtidos do usuário e armazene
//em um vetor a metade de cada número informado pelo usuário. Imprima todos
//os valores armazenados.

Var
numero : vetor [0..9] de reaL
i : inteiro

inicio

para i de 0 ate 9 passo 1 faca
   escreva ("Digite um número: ")
   leia (numero[i])
   numero[i] <- numero[i] / 2
   // ELE RECEBE ELE - NO CASO NUMERO[I]
fimpara

ESCREVAL (" ")
Escreval("Metade de cada número informado:")
para i de 0 ate 9 passo 1 faca
   Escreval(numero [i])
fimpara




Fimalgoritmo