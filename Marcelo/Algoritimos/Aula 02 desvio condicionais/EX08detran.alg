Algoritmo "semnome"
//Num determinado Estado, para transfer�ncias de ve�culos, o
//DETRAN cobra uma taxa de 1% para carros fabricados antes de
//1990 e uma taxa de 1.5% para os fabricados de 1990 em diante,
//taxa est� incidindo sobre o valor de tabela do carro. Elabore um algoritimo
//que leia o ano e o pre�o do carro e em seguida calcule e
//imprima o imposto a ser pago.

Var
   anodoveiculo : inteiro
   valordoveiculo,valor: real


Inicio
   Escreval ("Escreva o ano do veiculo")
   leia (anodoveiculo)
   Escreval ("Valor do veiculo")
   leia (valor)

   se anodoveiculo < 1990 entao
   valordoveiculo<- valor*1/100
      Escreval ("R$",valordoveiculo+valor,"  Valor com o acrescimo de 1%")
   senao
   valordoveiculo<- valor*1.5/100
      Escreval("R$",valordoveiculo+valor,"  Valor com o acrescimo de 1.5%")
   fimse
   


Fimalgoritmo