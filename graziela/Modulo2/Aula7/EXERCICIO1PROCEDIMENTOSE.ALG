algoritmo "Exercicio1ProcedimentoSe"
//Escreva um algoritmo que irá obter a quantidade
//de lado e escreverá no console:
//3 lados - Triângulo
//4 lados - Quadrado
//5 lados - Pentágono
//Mais do que 5 ou menos do que 3 dados inválidos.
var
   qtdLados: inteiro
procedimento tipoFormaGeometrica()
inicio
   se qtdLados = 3 entao
      escreva("Triângulo!")
   senao
      se qtdLados = 4 entao
         escreva("Quadrado!")
      senao
         se qtdLados = 5 entao
            escreva("Pentágono!")
         senao
            escreva("Inválido!")
         fimse
      fimse
   fimse
fimprocedimento
inicio
      Escreva("Digite a quantidade de lados: ")
      leia(qtdLados)
      tipoFormaGeometrica()
fimalgoritmo
