algoritmo "Exercicio1ProcedimentoEscolha"
//Escreva um algoritmo que ir� obter a quantidade
//de lado e escrever� no console:
//3 lados - Tri�ngulo
//4 lados - Quadrado
//5 lados - Pent�gono
//Mais do que 5 ou menos do que 3 dados inv�lidos.
var
   qtdLados: inteiro
procedimento tipoFormaGeometrica()
inicio
   escolha qtdLados
      caso 3
         escreva("Tri�ngulo!")
      caso 4
         escreva("Quadrado!")
      caso 5
         escreva("Pent�gono!")
      outrocaso
         escreva("Inv�lido!")
   fimescolha
fimprocedimento
inicio
      Escreva("Digite a quantidade de lados: ")
      leia(qtdLados)
      tipoFormaGeometrica()
fimalgoritmo
