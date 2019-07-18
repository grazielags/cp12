Algoritmo "oito"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 16/07/2019
Var
parcelas, contador: inteiro
valorParcela, valorProduto: real



Inicio
contador <- 1
Escreva("Digite o valor do produto: ")
Leia(valorProduto)
Escreval("1 Parcela = 10% de desconto;")
Escreval("2 até 5 Parcelas = 5% de acréscimo;")
Escreval("6 até 10 Parcelas = 10% de acréscimo.")
Escreval()
Escreva("Digite em quantas vezes gostaria de parcelar o valor: ")
Leia(parcelas)
se parcelas = 1 entao
   valorProduto <-  valorProduto * 0.90
fimse
se (parcelas > 1) e (parcelas < 6)  entao
   valorProduto <- valorProduto * 1.05
fimse
se (parcelas > 5) e (parcelas < 11)  entao
   valorProduto <- valorProduto * 1.10
fimse
valorParcela <- valorProduto / parcelas
enquanto contador <= parcelas faca
         Escreval(valorParcela)
         contador <- contador + 1
fimenquanto


Fimalgoritmo