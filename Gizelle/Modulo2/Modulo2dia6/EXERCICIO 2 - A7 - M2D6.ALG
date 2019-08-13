Algoritmo "EXERCICIO 2 - A7 - M2D6"
//Escreva um algoritmo de um calculadora, que irá solicitar ao usuário qual
// operação deseja realizar. De acordo com a operação desejada será chamado
// um procedimento diferente que obterá 2 valores, realizará o cálculo da
// operação informado e escreverá o resultado.

Var
operacao: caracter
num1, num2 : inteiro

// fazer um procdimento para cada conta.
// Não se declara tipo de variável pq não tem retorno
procedimento soma()
Inicio
   escreval (" ")
   escreva ("Resultado: ", num1, (" "), operacao, num2, " =", num1+num2)
fimprocedimento

procedimento subtracao()
Inicio
   escreval (" ")
   escreva ("Resultado: ", num1, (" "), operacao, num2, " =", num1-num2)
fimprocedimento

procedimento multiplicacao()
Inicio
   escreval (" ")
   escreva ("Resultado: ", num1, (" "), operacao, num2, " =", num1*num2)
fimprocedimento

procedimento divisao()
Inicio
   escreval (" ")
   escreva ("Resultado: ", num1, (" "), operacao, num2, " =", num1 / num2)
fimprocedimento

inicio
// sequencia fora do procedimento. a prof escreveu primeiro do que a do procedimento
   escreva ("Digite um número: ")
   leia(num1)
   escreval (" ")
   escreva ("Outro número: ")
   leia(num2)
   escreval (" ")
   escreva ("Digite a operação desejada (+, -, *, /): ")
   Leia (OPERACAO)
   ESCOLHA OPERACAO
           caso "+"
                soma()
           caso "-"
                subtracao()
           caso "*"
                multiplicacao()
           caso "/"
                divisao()
           outrocaso
                escreva ("Operação Inválida")
   fimescolha

escreval (" ")

Fimalgoritmo