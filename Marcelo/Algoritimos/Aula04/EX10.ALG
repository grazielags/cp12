Algoritmo "semnome"
// Escreva um algoritmo dado o nome, cargo e o seu salário bruto de
//um funcionário considere:
//a. O salário bruto teve um reajuste de 38%.
//b. O funcionário receberá uma gratificação de 20% do salário bruto.
//c. O Salário total é descontado em 15%
//d. Imprimir Nome, idade e cargo.
//e. Imprimir o salário bruto.
//f. Imprimir o salário líquido.
Var
   nome,cargo: caracter
   salario,salarioreajuste, salariodesconto, salarioboni: real
   idade:inteiro

Inicio

   Escreval("Escreva o nome do funcionario ?" )
   leia(nome)
   Escreval ("Qual a idade")
   leia(idade)
   Escreval("Escreva o cargo :")
   leia(cargo)
   Escreval ("Escreva o salário bruto : " )
   leia(salario)
   salarioreajuste<- salario*38/100
   Escreval ("Seu salario com o ajuste de 38% é de R$", salarioreajuste+salario)
   salarioboni<- (salarioreajuste+salario)*20/100
   Escreval ("Gratificação de 20% no seu salario bruto R$", salarioboni)
   salariodesconto <- ((salarioreajuste + salario + salarioboni) * (15/100))
   Escreval("Descontos de 15% R$", salariodesconto)
   Escreval ("Seu salario bruto é de R$:", salarioreajuste + salario)
   Escreval ("Salario liquido é de R$:  ", (salarioreajuste + salario + salarioboni) - salariodesconto)
Fimalgoritmo