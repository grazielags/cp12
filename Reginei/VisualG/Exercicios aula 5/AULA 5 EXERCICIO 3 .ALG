algoritmo "aula 5 exercicio 3 "
//2. Escreva um algoritmo que armazene em um vetor de tamanho 5 o
//quadrado dos números ímpares de 1 a 10 (1, 3, 5, 7 e 9). Imprima
//todos os valores armazenados.
var
   i:inteiro
   valores:vetor[0..4] de inteiro
inicio
   para i de 0 ate 4 faca
      escreva("Digite o valor: ")
      leia (valores[i])
   fimpara
   para i de 0 ate 4 faca
      escreva(valores[i], "-" , i)
   fimpara

fimalgoritmo