Algoritmo "EXEMPLO Parametros 1 - A7 - M2D6"

//        "parâmetros"

var
num1, num2, resultado: inteiro


funcao soma(numero1, numero2 : inteiro; nome: caractere): inteiro
// fora dos parentesestem que dizer que tipo de variavel deve retornar
var
resultado : inteiro

inicio
resultado <- numero1 + numero2
retorne resultado

fimfuncao


inicio
num1 <- 1
num2 <- 2
resultado <- soma(num1, num2, "Gizelle")
// os valores podem ser fixos. exemplo: soma(5,3) vai gravar os valores fixos
// qto ao nome não escrevena tela pq não foi pedido escrever.

Escreval(resultado)

fimalgoritmo