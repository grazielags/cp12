Algoritmo "EXERCICIO 1 - A7 - M2D6"
//Escreva um algoritmo que ir� obter a quantidade de lado e escrever� no
//console:
//        3 lados - Tri�ngulo
//        4 lados - Quadrado
//        5 lados - Pent�gono
//        Mais do que 5 ou menos do que 3 dados inv�lidos.

// observa��o sala:  OBTER E ESCREVER ent�o �um procedimento

Var
qtdLados: inteiro
procedimento tipoGeometrico() : inteiro

Inicio
// sequencia do procedimento
      se qtdLados = 3 entao
      escreval ("Tri�ngulo")
      senao
           se qtdLados = 4 entao
              escreval ("Quadrado")
           senao
                se qtdLados = 5 entao
                   escreval("Pent�gono")
                senao
                     escreval("Inv�lido")
                fimse
           fimse
      fimse

fimprocedimento

inicio
// sequencia fora do procedimento. a prof escreveu primeiro do que a do procedimento
   escreva ("Digite a quantidade delados: ")
   Leia (qtdLados)
   tipoGeometrico()


Fimalgoritmo