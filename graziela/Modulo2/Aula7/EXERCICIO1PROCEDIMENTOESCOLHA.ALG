algoritmo "Exercicio1ProcedimentoEscolha"
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
   escolha qtdLados
      caso 3
         escreva("Triângulo!")
      caso 4
         escreva("Quadrado!")
      caso 5
         escreva("Pentágono!")
      outrocaso
         escreva("Inválido!")
   fimescolha
fimprocedimento
inicio
      Escreva("Digite a quantidade de lados: ")
      leia(qtdLados)
      tipoFormaGeometrica()
fimalgoritmo
