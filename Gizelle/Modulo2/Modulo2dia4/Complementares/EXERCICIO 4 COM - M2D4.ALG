Algoritmo "EXERCICIO 4 COM - M2D4"
// Ler um vetor com 10 nomes de pessoas, ap�s pedir que o usu�rio digite
//um nome qualquer de pessoa. Escrever a mensagem �ACHEI�, se o nome estiver
//armazenado no vetor ou �N�O ACHEI� caso contr�rio.

var
nome: vetor[1..10] de caracter
x:caracter
i:inteiro
achou : logico

inicio
para i de 1 ate 10 faca
   escreva ("Digite nome: ")
   Leia (nome[i])
fimpara

escreva("Digite o nome que voce procura: ")
leia(x)

achou <- falso
para i de 1 ate 10 faca
se(nome[i] = x) entao
    achou <- verdadeiro
 fimse
 fimpara
escreval("")
 se (achou = verdadeiro) entao
    escreval("Achei!")
 senao
    escreval("N�o achei!")
 fimse

Fimalgoritmo