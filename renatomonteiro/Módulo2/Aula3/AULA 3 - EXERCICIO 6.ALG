Algoritmo "Aula 3 - exercicio 6"
//Escrever um algoritmo que lê um valor em reais e calcule qual o
//menor número possível de notas de 100, 50, 10, 5 e 1 em que o
//valor lido pode ser decomposto. Escrever o valor lido e a relação
//de notas necessárias.
Var

   notas100, valor: inteiro

Inicio
   escreva ("digite um valor: ")
   leia(valor)
   se (valor / 100) > 0 entao
      notas100 <- valor div 100
   valor <- valor mod 100
      FIMSE
      escreval ("notas de 100: ", notas100
      escreval ("valor: ", valor)
      
Fimalgoritmo
