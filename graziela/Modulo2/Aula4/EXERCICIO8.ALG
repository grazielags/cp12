Algoritmo "Exercicio8"
//Obtenha o valor de um produto e apresente o valor
//das parcelas.
//	Dado que em:
//1 parcela: 10% de desconto
//De 2 at� 5 parcelas 5% de acr�scimo
//De 6 at� 10 parcelas 10% de acr�scimo.

Var
   valorProduto, valorFinal: real
   i: inteiro
Inicio
   Escreva("Digite o o valor do produto: ")
   Leia(valorProduto)
   para i de 1 ate 10 faca
      escolha i
         caso 1
              valorFinal <- valorProduto * 0.90
         caso 2 ate 5
             valorFinal <- valorProduto * 1.05
         caso 6 ate 10
             valorFinal <- valorProduto * 1.10
      fimescolha
      Escreval(i, " - ", valorFinal)
   fimpara
Fimalgoritmo