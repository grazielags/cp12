Algoritmo "exercicio 9"
// A empresa “Flor do campo” faz o pagamento de seus funcionários
//por hora. Faça um algoritmo que calcule e exiba o salário de um
//funcionário (obter nome, horas trabalhadas e nível do funcionário).
//Sabendo que o valor da hora segue a tabela abaixo:
//Funcionário Nível Junior R$ 12,00 por hora
//Funcionário Nível Pleno R$ 25,00 por hora
//Funcionário Nível Senior R$ 50,00 por hora

Var
nome : caracter
horas : real
nivel : inteiro
salarioJunior, salarioPleno, salarioSenior : real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreva ("Nome funcionário: ")
leia (nome)
escreva ("Digite 1 para nível Junior, 2 para Pleno ou 3 para Senior: ")
leia (nivel)
escreva ("Horas trabalhadas: ")
leia (horas)

se nivel = 1 entao
salariojunior <- (horas*12)
escreval ("")
escreval ("Salário para ",nome, (" é de R$"), salariojunior)
fimse

se nivel = 2 entao
salarioPleno <- (horas*25)
escreval ("")
escreval ("Salário para ",nome, (" é de R$"), salarioPleno)
fimse

se nivel = 3 entao
salarioSenior <- (horas*50)
escreval ("")
escreval ("Salário para ",nome, (" é de R$"), salarioSenior)
fimse

Fimalgoritmo