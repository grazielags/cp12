Algoritmo "aula 5 xercicio 3"

//3. Escreva um algoritmo que receba 10 números obtidos do usuário e
//armazene em um vetor a metade de cada número informado pelo
//usuário. Imprima todos os valores armazenados.

var

   notas : vetor [0..9] de inteiro
   i: inteiro

inicio
   para i de 0 ate 9 passo 1 faca
      escreva("digite um numero")
      leia (notas[i])
      notas[i] <- notas[i] div 2
   fimpara
   Escreval("listagem dos valores dividido por 2: ")
   para i de 0 ate 9 passo 1 faca
      Escreval(notas[i])
   fimpara

fimalgoritmo