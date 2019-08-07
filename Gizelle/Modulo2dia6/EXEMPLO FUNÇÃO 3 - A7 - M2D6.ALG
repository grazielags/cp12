Algoritmo "EXEMPLO FUNÇÃO 3 - A7 - M2D6"

//        "FUNÇÃO"
// verificar exemplo dado da Grazi...está incompleto

var
   num1, num2: inteiro

funcao soma() : inteiro
inicio
      retorne num1 + num2
fimfuncao

funcao ehPar() : logico

inicio
      retorne num1 % 2 = 0
fimfuncao

inicio
      escreva("Digite o primeiro número: ")
      leia(num1)
      escreva("Digite o segundo número: ")
      leia(num2)
      Escreval(num1, " + ", num2, " = ", soma())
      Escreval(num1, " é par? ", ehPar())
      se ehPar() = verdadeiro entao
         escreval(num1, ": É par!")
      fimse
fimalgoritmo