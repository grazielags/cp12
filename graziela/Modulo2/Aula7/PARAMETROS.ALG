algoritmo "Parametros"
var
   num1, num2, resultado: inteiro
funcao soma(numero1, numero2 : inteiro; nome: caractere) : inteiro
var
   resultado : inteiro
inicio
      resultado <- numero1 + numero2
      retorne resultado
fimfuncao
inicio
      num1 <- 1
      num2 <- 2
      resultado <- soma(num1, num2, "Graziela")
      Escreval(resultado)
      
fimalgoritmo
