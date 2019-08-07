Algoritmo "EXERCICIO 1 - A7 - M2D6"
//Escreva um algoritmo que irá obter a quantidade de lado e escreverá no
//console:
//        3 lados - Triângulo
//        4 lados - Quadrado
//        5 lados - Pentágono
//        Mais do que 5 ou menos do que 3 dados inválidos.

// observação sala:  OBTER E ESCREVER então éum procedimento

Var
qtdLados: inteiro
procedimento tipoGeometrico() : inteiro

Inicio
// sequencia do procedimento
      se qtdLados = 3 entao
      escreval ("Triângulo")
      senao
           se qtdLados = 4 entao
              escreval ("Quadrado")
           senao
                se qtdLados = 5 entao
                   escreval("Pentágono")
                senao
                     escreval("Inválido")
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