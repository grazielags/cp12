algoritmo "Exercicio7"
//Escreva uma fun��o que retornar� se o n�mero
//informado pelo usu�rio � par ou �mpar.
var
   numero: inteiro
funcao ehPar(): caractere
inicio
   se numero % 2 = 0 entao
      retorne "O n�mero � par! "
   senao
      retorne "O n�mero � �mpar!"
   fimse
fimfuncao
inicio
   escreva("Digite um n�mero: ")
   leia(numero)
   escreval(ehPar())
fimalgoritmo
