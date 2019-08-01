Algoritmo "condicional exercicio 6"
//6) Escrever um algoritmo que lê um valor em reais e calcule qual o menor
//número possível de notas de 100, 50, 10, 5 e 1 em que o valor lido pode ser
// decomposto. Escrever o valor lido e a relação de notas necessárias.

Var
   valor, notas100, notas50, notas10, notas5, notas2, notas1 :inteiro

Inicio
   escreva("Digite o valor do saque: ")
   leia(valor)
   se (valor / 100) > 0 entao
      notas100 <- valor div 100
      valor <- valor mod 100
   fimse
   se (valor / 50) > 0 entao
      notas50 <- valor div 50
      valor <- valor mod 50
   fimse
   se (valor / 10) > 0 entao
      notas10 <- valor div 10
      valor <- valor mod 10
   fimse
   se (valor / 5) > 0 entao
      notas5 <- valor div 5
      valor <- valor mod 5
   fimse
   se (valor / 2) > 0 entao
      notas2 <- valor div 2
      valor <- valor mod 2
   fimse
   se (valor / 1) > 0 entao
      notas1 <- valor div 1
      valor <- valor mod 1
   fimse
   escreval("quantidade de notas de 100: " ,notas100)
   escreval("quantidade de notas de 50: " ,notas50)
   escreval("quantidade de notas de 10: " ,notas10)
   escreval("quantidade de notas de 5: " ,notas5)
   escreval("quantidade de notas de 2: " ,notas2)
   escreval("quantidade de notas de 1: " ,notas1)


Fimalgoritmo