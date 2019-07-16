Algoritmo "Exercicio8OutraForma"
//Obtenha o valor de um produto e apresente o valor
//das parcelas.
//	Dado que em:
//1 parcela: 10% de desconto
//De 2 até 5 parcelas 5% de acréscimo
//De 6 até 10 parcelas 10% de acréscimo.

Var
   valorProduto, valorFinal: real
   i, qtdParcelas: inteiro
Inicio
   Escreva("Digite o valor do produto: ")
   Leia(valorProduto)
   Escreva("Digite a quantidade de parcelas que deseja: ")
   Leia(qtdParcelas)
   escolha qtdParcelas
      caso 1
         valorFinal <- valorProduto * 0.90
      caso 2 ate 5
         valorFinal <- valorProduto * 1.05
      caso 6 ate 10
         valorFinal <- valorProduto * 1.10
   fimescolha
   para i de 1 ate qtdParcelas faca
      Escreval(i, " - ", valorFinal / qtdParcelas)
   fimpara
Fimalgoritmo