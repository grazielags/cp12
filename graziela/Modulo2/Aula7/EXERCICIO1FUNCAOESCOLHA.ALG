algoritmo "Exercicio1FuncaoEscolha"
//Escreva um algoritmo que irá obter a quantidade
//de lado e escreverá no console:
//3 lados - Triângulo
//4 lados - Quadrado
//5 lados - Pentágono
//Mais do que 5 ou menos do que 3 dados inválidos.
var
   qtdLados, i: inteiro
funcao tipoFormaGeometrica(): caractere
inicio
   escolha qtdLados
      caso 3
         retorne "Triângulo!"
      caso 4
         retorne "Quadrado!"
      caso 5
         retorne "Pentágono!"
      outrocaso
         retorne "Inválido!"
   fimescolha
fimfuncao
inicio
   para i de 0 ate 5 faca
      Escreva("Digite a quantidade de lados: ")
      leia(qtdLados)
      escreval(tipoFormaGeometrica())
   fimpara
fimalgoritmo
