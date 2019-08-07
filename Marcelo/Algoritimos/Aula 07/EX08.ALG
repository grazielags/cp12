algoritmo "Parametros"
//Escreva um algoritmo com uma função que receba por parâmetro
//um número e retorne se este número é par ou ímpar.


var
   num1,resultado: inteiro
funcao n(numero1 : inteiro) : inteiro
var
   resultado : inteiro
inicio
   resultado <- numero1
   retorne resultado
fimfuncao
inicio
   num1 <- 3
   resultado <- n(num1)

   se resultado % 2=0 entao
      Escreval ("é par")
   senao
      se resultado % 2=1 entao
         escreval ("é impar")
      fimse
   fimse



fimalgoritmo
