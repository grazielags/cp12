algoritmo "Parametros"
//Escreva um algoritmo com uma fun��o que receba por par�metro
//um n�mero e retorne se este n�mero � par ou �mpar.


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
      Escreval ("� par")
   senao
      se resultado % 2=1 entao
         escreval ("� impar")
      fimse
   fimse



fimalgoritmo
