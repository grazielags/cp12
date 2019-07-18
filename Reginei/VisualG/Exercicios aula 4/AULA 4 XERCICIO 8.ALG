Algoritmo "aula 4 xercicio 8"
//8. Obtenha o valor de um produto e apresente o valor das parcelas.
//Dado que em:
//• 1 parcela: 10% de desconto
//• De 2 até 5 parcelas 5% de acréscimo
//• De 6 até 10 parcelas 10% de acréscimo.

Var

   i, valor, parcela, desconto, acrescimo1, acrescimo2: inteiro

Inicio
   para i de 1 ate 1    faca
      escreva("Digite o valor da compra: ")
      leia(i)
      escreva("Digite a quantidade de parcelas: ")
      leia (parcela)
      se parcela = 1 entao
         desconto<- ((i div 10) * 9)
         se parcela = 2 ou parcela > 2 ou parcela = < 5
         acrescimo1<- ((i div 20) + i)
         
      fimse
      escreva("valor com desconto", desconto)
      fimpara



Fimalgoritmo