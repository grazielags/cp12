Algoritmo "exercicio 9"
// A empresa �Flor do campo� faz o pagamento de seus funcion�rios
//por hora. Fa�a um algoritmo que calcule e exiba o sal�rio de um
//funcion�rio (obter nome, horas trabalhadas e n�vel do funcion�rio).
//Sabendo que o valor da hora segue a tabela abaixo:
//Funcion�rio N�vel Junior R$ 12,00 por hora
//Funcion�rio N�vel Pleno R$ 25,00 por hora
//Funcion�rio N�vel Senior R$ 50,00 por hora

Var
nome : caracter
horas : real
nivel : inteiro
salarioJunior, salarioPleno, salarioSenior : real

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
escreva ("Nome funcion�rio: ")
leia (nome)
escreva ("Digite 1 para n�vel Junior, 2 para Pleno ou 3 para Senior: ")
leia (nivel)
escreva ("Horas trabalhadas: ")
leia (horas)

se nivel = 1 entao
salariojunior <- (horas*12)
escreval ("")
escreval ("Sal�rio para ",nome, (" � de R$"), salariojunior)
fimse

se nivel = 2 entao
salarioPleno <- (horas*25)
escreval ("")
escreval ("Sal�rio para ",nome, (" � de R$"), salarioPleno)
fimse

se nivel = 3 entao
salarioSenior <- (horas*50)
escreval ("")
escreval ("Sal�rio para ",nome, (" � de R$"), salarioSenior)
fimse

Fimalgoritmo