Algoritmo "exercicio 6"
// Escrever um algoritmo que l� um valor em reais e calcule qual o
//menor n�mero poss�vel de notas de 100, 50, 10, 5 e 1 em que o
//valor lido pode ser decomposto. Escrever o valor lido e a rela��o
//de notas necess�rias.

Var
v100, v50, v20, v10, v5, v2, v1, Valor : Inteiro


Inicio

  Escreva("Informe um valor inteiro em Reais: ")
  Leia(Valor)

  v100 <- Valor div 100
  Valor <- Valor - v100 * 100
// valor <- 556
//se (valor / 100) > 0 entao
//  notas100 <- valor div 100
//  valor <- valor MOD 100
//fimse
// escreval ("Nota de 100: ", notas100)
// escraval ("valor: ", valor)


  v50 <- Valor div 50
  Valor <- Valor - v50 * 50

  v20 <- Valor div 20
  Valor <- Valor - v20 * 20

  v10 <- Valor div 10
  Valor <- Valor - v10 * 10

  v5 <- Valor div 5
  Valor <- Valor - v5 * 5

  v2 <- Valor div 2
  Valor <- Valor - v2 * 2

  v1 <- Valor

  Escreva("O n�mero de notas de 100 �: ", v100)
  escreval(" ")
  Escreva("O n�mero de notas de 50 �: ", v50)
  escreval(" ")
  Escreva("O n�mero de notas de 20 �: ", v20)
  escreval(" ")
  Escreva("O n�mero de notas de 10 �: ", v10)
  escreval(" ")
  Escreva("O n�mero de notas de 5 �: ", v5)
  escreval(" ")
  Escreva("O n�mero de notas de 2 �: ", v2)
  escreval(" ")
  Escreva("O n�mero de notas de 1 �: ", v1)


Fimalgoritmo