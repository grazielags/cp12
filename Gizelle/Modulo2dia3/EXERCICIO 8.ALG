Algoritmo "exercicio 8"
//Obtenha o valor de um produto e apresente o valor das parcelas.
//        Dado que em:
//     • 1 parcela: 10% de desconto
//     • De 2 até 5 parcelas 5% de acréscimo
//     • De 6 até 10 parcelas 10% de acréscimo.
Var
i : inteiro
valor, valorfinal : real

Inicio

escreva ("Valor do produto:  ")
leia (valor)

para i de 1 ate 10 faca
// pq foi até 10 parcelas
     escolha i
        caso 1
             valorfinal <- valor * 0.90
        caso 2 ate 5
             valorfinal <- valor * 1.50
        caso 6 ate 10
             valorfinal <- valor * 1.10
        fimescolha
     ESCREVAL (i, " - ", valorfinal)
fimpara

Fimalgoritmo