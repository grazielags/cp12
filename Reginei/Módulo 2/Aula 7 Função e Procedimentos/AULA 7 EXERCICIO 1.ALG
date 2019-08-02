algoritmo "aula 7 exercicio 1"

//1. Escreva um algoritmo que irá obter a quantidade de lado e
//escreverá no console:
//3 lados - Triângulo
//4 lados - Quadrado
//5 lados - Pentágono
//Mais do que 5 ou menos do que 3 dados inválidos.

var
   qtdLados: inteiro
procedimento FormaGeometrica()

inicio
   se qtdLados = 3 entao
      escreval("Triângulo!")
   senao
      se qtdLados = 4 entao
         escreval("Quadrado!")
      senao
         se qtdLados = 5 entao
            escreval("Pentágono!")
         senao
            escreval("inválido")
         fimse
      fimse
   fimse
fimprocedimento
inicio
   escreva("Digite a quantidade de lados:")
   leia(qtdLados)
   FormaGeometrica()
fimalgoritmo