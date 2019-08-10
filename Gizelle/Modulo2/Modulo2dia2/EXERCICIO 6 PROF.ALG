Algoritmo "exercicio 6 prof"
//Escrever um algoritmo que lê um valor em reais e calcule qual o menor
//número possível de notas de 100, 50, 10, 5 e 1 em que o valor lido
//pode ser decomposto. Escrever o valor lido e a relação de notas necessárias.


Var

valor,notas100,notas50, notas10, notas5, notas1 : inteiro

Inicio

escreva ("informe valor em real: ")
leia (valor)
se (valor / 100) > 0 entao
notas100 <- valor div 100
valor <- valor MOD 100
fimse

se (valor / 50) > 0 entao
notas50 <- valor div 50
valor <- valor MOD 50
fimse

se (valor / 10) > 0 entao
notas10 <- valor div 10
valor <- valor MOD 10
fimse

se (valor / 5) > 0 entao
notas5 <- valor div 5
valor <- valor MOD 5
fimse

se (valor / 1) > 0 entao
notas1 <- valor div 1
valor <- valor MOD 1
fimse


escreval ("Nota de 100: ", notas100)
escreval ("Notas de 50  ", notas50)
escreval ("Notas de 10  ", notas10)
escreval ("Notas de 5  ", notas5)
escreval ("Notas de 1  ", notas1)
escreval ("valor: ", valor)



Fimalgoritmo