algoritmo "Exercicio2"
//Escreva um algoritmo de um calculadora,
//que ir� solicitar ao usu�rio qual opera��o deseja
//realizar. De acordo com a opera��o desejada ser�
//chamado um procedimento diferente que obter� 2
//valores, realizar� o c�lculo da opera��o informado
//e escrever� o resultado.
var
   operacao: caractere
   num1, num2: inteiro
procedimento escolheOperacao()
inicio
   escolha operacao
      caso "+"
         soma()
      caso "-"
         subtracao()
      caso "*"
         multiplicacao()
      caso "/"
         divisao()
      outrocaso
         escreva("Opera��o inv�lida!")
   fimescolha
fimprocedimento

procedimento soma()
inicio
   escreva(num1, " ", operacao, num2, " = ", num1 + num2)
fimprocedimento

procedimento subtracao()
inicio
   escreva(num1, " ", operacao, num2, " = ", num1 - num2)
fimprocedimento

procedimento multiplicacao()
inicio
   escreva(num1, " ", operacao, num2, " = ", num1 * num2)
fimprocedimento

procedimento divisao()
inicio
   escreva(num1, " ", operacao, num2, " = ", num1 / num2)
fimprocedimento

inicio
   escreva("Digite o primeiro n�mero: ")
   leia(num1)
   escreva("Digite a opera��o desejada (+, -, *, /): ")
   leia(operacao)
   escreva("Digite o segundo n�mero: ")
   leia(num2)
   escolheOperacao()
fimalgoritmo
