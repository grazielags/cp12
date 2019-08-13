Algoritmo "exercicio 12"
//Uma seguradora concederá um desconto especial para alguns clientes. Faça
//um algoritmo que leia o valor do seguro de um cliente e calcule o valor
//de desconto de acordo com a tabela abaixo. Mostre uma mensagem informando
//o valor do desconto.
//        De R$ 0,00 a R$ 800,00 - nenhum desconto
//        De R$ 801,00 a R$ 1000,00 - 5% de desconto
//        De R$ 1001,00 a R$ 1500,00 - 10% de desconto
//        acima de R$ 1501,00 - 15% de desconto.

Var
nome :  caractere
valorAtual : inteiro

Inicio
escreva ("Nome assegurado: ")
leia (nome)
escreva ("valor do seguro: ")
leia (valorAtual)
escreval(" ")

se (valorAtual >= 0.00)e(valorAtual < 801.00) entao
escreval ("Assegurado recebe nenhum desconto")
fimse

se (valorAtual >= 801.00)e(valorAtual < 1001.00) entao
escreval ("Recebe 5% de deconto e fica: ", valorAtual-(valorAtual*0.05))
fimse

se (valorAtual >= 1001.00)e(valorAtual < 1501.00) entao
escreval ("Recebe 10% de deconto e fica: ", valorAtual-(valorAtual*0.10))
fimse

se (valorAtual >= 1501.00) entao
escreval ("Recebe 15% de deconto e fica: ", valorAtual-(valorAtual*0.15))
fimse

Fimalgoritmo