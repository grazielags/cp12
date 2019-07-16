Algoritmo "semnome"
// Uma seguradora concederá um desconto especial para alguns
//clientes. Faça um algoritmo que leia o valor do seguro de um
//cliente e calcule o valor de desconto de acordo com a tabela abaixo.
//Mostre uma mensagem informando o valor do desconto.
//De R$ 0,00 a R$ 800,00 - nenhum desconto
//De R$ 801,00 a R$ 1000,00 - 5% de desconto
//De R$ 1001,00 a R$ 1500,00 - 10% de desconto
//acima de R$ 1501,00 - 15% de desconto.
Var
   valor:real
   valorfinal: real
Inicio
   Escreval(" Valor do seguro : ")
   leia(valor)

   escolha valor
   caso 0 ate 800.00
      escreval("nenhum desconto.")
   caso 801.0 ate 1000.0
      valorfinal<- valor*5/100
      Escreval ("O Valor final do seguro é : ", valor - valorfinal )
      escreval("5 % de desconto")
   caso 1001.0 ate 1500.0
      valorfinal<- valor*10/100
      Escreval ("O Valor final do seguro é : ", valor - valorfinal )
      escreval("10% de desconto")
   outrocaso
      valorfinal<- valor*15/100
      Escreval(" O valor final do seguro é : ",valor - valorfinal)
      escreval("15% de desconto.")
   fimescolha
fimalgoritmo


Fimalgoritmo