Algoritmo "EXEMPLO FUNÇÃO 2 - A7 - M2D6"

//        "FUNÇÃO"

var

num1, num2, RESULTADO: inteiro
funcao soma() : inteiro

inicio
      retorne num1 + num2
      // pode pedir para retornar fixo. exemplo 100 ao inves de (num1 + num2)
fimfuncao

inicio
   num1 <- 1
   num2 <- 2
   resultado <- soma()
Escreval(resultado)
   num1 <- 4
   num2 <- 5
Escreval(soma())
   num1 <- 6
   num2 <- 10
Escreval(soma())

fimalgoritmo