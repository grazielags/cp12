algoritmo "Exercicio2"
//Escreva um algoritmo de um calculadora,
//que irá solicitar ao usuário qual operação deseja
//realizar. De acordo com a operação desejada será
//chamado um procedimento diferente que obterá 2
//valores, realizará o cálculo da operação informado
//e escreverá o resultado.
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
         escreva("Operação inválida!")
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
   escreva("Digite o primeiro número: ")
   leia(num1)
   escreva("Digite a operação desejada (+, -, *, /): ")
   leia(operacao)
   escreva("Digite o segundo número: ")
   leia(num2)
   escolheOperacao()
fimalgoritmo
