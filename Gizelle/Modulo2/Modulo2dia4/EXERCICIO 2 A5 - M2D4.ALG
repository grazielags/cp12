Algoritmo "EXERCICIO 2 A5 - M3A1"
//Escreva um algoritmo que armazene em um vetor de tamanho 5 o quadrado
//dos números ímpares de 1 a 10 (1, 3, 5, 7 e 9). Imprima todos os valores
//armazenados.

Var
numero : vetor [0..4] de inteiro
i, contador : inteiro

inicio
 contador <- 1
para i de 0 ate 4 passo 1 faca
   numero[i] <- contador * contador
   contador <- contador + 2
fimpara

Escreval("Lista do quadrado dos números ímpares 1, 3, 5, 7 e 9:")
para i de 0 ate 4 passo 1 faca
   Escreval(numero [i])
fimpara




Fimalgoritmo