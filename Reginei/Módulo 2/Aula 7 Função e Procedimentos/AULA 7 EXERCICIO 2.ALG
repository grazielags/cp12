algoritmo "aula 7 exercicio 2"

//2. Escreva um algoritmo de um calculadora, que irá solicitar ao
//usuário qual operação deseja realizar. De acordo com a operação
//desejada será chamado um procedimento diferente que obterá 2
//valores, realizará o cálculo da operação informado e escreverá o
//resultado.
var
   operacao: caractere
   num1, num2: inteiro
procedimento escolhaOperacao()
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
      escreval("Operacão inválida!")
   fimescolha
fimprocedimento

procedimento soma()
inicio
   escreva(num1, " " ,operacao , num2, " = ", num1 + num2)
fimprocedimento

procedimento subtracao()
inicio
   escreva(num1, " " , operacao, num2, " = ", num1 - num2)
fimprocedimento

procedimento multiplicacao()
inicio
   escreva(num1, " " ,operacao, num2, " = ", num1 * num2)
fimprocedimento

procedimento divisao()
inicio
   escreva(num1, " " ,operacao, num2, " = ", num1 / num2)
fimprocedimento

inicio
   escreva("Digite o Primeiro Número: ")
   leia(num1)
   escreva("Digite a operação desejada ( + , - , * , / ) : ")
   leia(operacao)
   escreva("Digite o Segundo Número: ")
   leia(num2)
   escolhaOperacao()

fimalgoritmo
