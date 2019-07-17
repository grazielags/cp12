Algoritmo "Aula 3 - exercicio 6"
//Escrever um algoritmo que lê um valor em reais e calcule qual o
//menor número possível de notas de 100, 50, 10, 5 e 1 em que o
//valor lido pode ser decomposto. Escrever o valor lido e a relação
//de notas necessárias.
Var

   notas100, notas50, notas10, notas1, valor: inteiro

Inicio
   escreva ("digite um valor: ")
   leia(valor)
   se (valor / 100) > 0 entao
      notas100 <- valor div 100
      valor <- valor mod 100
   FIMSE
   se (valor / 50) > 0 entao
      notas50 <- valor div 50
      valor <- valor mod 50
   FIMSE
   se (valor / 10) > 0 entao
      notas10 <- valor div 10
      valor <- valor mod 10
   FIMSE
   se valor > 0 entao
      notas1 <- valor

   FIMSE
   escreval ("quantidade de notas de 100: ", notas100)
   escreval ("quantidade de notas de 50: ", notas50)
   escreval ("quantidade de notas de 10: ", notas10)
   escreval ("quantidade de notas de 1: ", notas1)
   escreval ("valor: ", valor)


Fimalgoritmo