algoritmo "aula 7 exercicio 1"

//1. Escreva um algoritmo que ir� obter a quantidade de lado e
//escrever� no console:
//3 lados - Tri�ngulo
//4 lados - Quadrado
//5 lados - Pent�gono
//Mais do que 5 ou menos do que 3 dados inv�lidos.

var
   qtdLados: inteiro
procedimento FormaGeometrica()

inicio
   se qtdLados = 3 entao
      escreval("Tri�ngulo!")
   senao
      se qtdLados = 4 entao
         escreval("Quadrado!")
      senao
         se qtdLados = 5 entao
            escreval("Pent�gono!")
         senao
            escreval("inv�lido")
         fimse
      fimse
   fimse
fimprocedimento
inicio
   escreva("Digite a quantidade de lados:")
   leia(qtdLados)
   FormaGeometrica()
fimalgoritmo