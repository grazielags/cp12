Algoritmo "EXEMPLO ESCOPO 1 - A7 - M2D6"

//        "ESCOPO"


var
num1, num2, resultado: inteiro
// AQUI EST�OO AS VARI�VEIS GLOBAIS

funcao soma() : inteiro
       var
      resultado : inteiro
       // AQUI EST�O AS VARI�VEIS LOCAL
inicio
   resultado <- num1 + num2
   // ESTE RESULTADO � DA VARIAVEL FUN��O (ENTRE INICIO E FIMFUN��O)
   retorne resultado
fimfuncao

inicio
      num1 <- 1
      num2 <- 2
      resultado <- soma()
      // ESTE RESULTADO � DAVAIRAVEL GLOBAL(ENTREINICIO E FIMALGORITMO)
      Escreval(resultado)

fimalgoritmo