Algoritmo "EXEMPLO ESCOPO 1 - A7 - M2D6"

//        "ESCOPO"


var
num1, num2, resultado: inteiro
// AQUI ESTÃOO AS VARIÁVEIS GLOBAIS

funcao soma() : inteiro
       var
      resultado : inteiro
       // AQUI ESTÃO AS VARIÁVEIS LOCAL
inicio
   resultado <- num1 + num2
   // ESTE RESULTADO É DA VARIAVEL FUNÇÃO (ENTRE INICIO E FIMFUNÇÃO)
   retorne resultado
fimfuncao

inicio
      num1 <- 1
      num2 <- 2
      resultado <- soma()
      // ESTE RESULTADO É DAVAIRAVEL GLOBAL(ENTREINICIO E FIMALGORITMO)
      Escreval(resultado)

fimalgoritmo