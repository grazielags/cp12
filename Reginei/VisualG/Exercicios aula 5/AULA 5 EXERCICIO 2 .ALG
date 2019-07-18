algoritmo "aula 5 exercicio 2 "
//3. Escreva um algoritmo que receba 10 números obtidos do usuário e
//armazene em um vetor a metade de cada número informado pelo
//usuário. Imprima todos os valores armazenados.
var
   notas :vetor [0..9] de real
   i: inteiro
inicio

   para i de 0 ate 9 passo 1 faca
      escreva("Digite um numero: ")
      leia(notas[i])
      notas[i] <- notas[i] / 2
      fimpara
      escreval
      Escreval("Listagem da metade dos numeros: ")
      para i de 0 ate 9 passo 1 faca
         Escreval(notas[i])

   fimpara
fimalgoritmo