Algoritmo "EXERCICIO 2 - A7 - M2D6"
//Escreva um algoritmo de um calculadora, que ir� solicitar ao usu�rio qual
// opera��o deseja realizar. De acordo com a opera��o desejada ser� chamado
// um procedimento diferente que obter� 2 valores, realizar� o c�lculo da
// opera��o informado e escrever� o resultado.

Var
operacao: caracter
num1, num2 : inteiro

// fazer um procdimento para cada conta.
// N�o se declara tipo de vari�vel pq n�o tem retorno
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
   escreva ("Digite um n�mero: ")
   leia(num1)
   escreval (" ")
   escreva ("Outro n�mero: ")
   leia(num2)
   escreval (" ")
   escreva ("Digite a opera��o desejada (+, -, *, /): ")
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
                escreva ("Opera��o Inv�lida")
   fimescolha

escreval (" ")

Fimalgoritmo