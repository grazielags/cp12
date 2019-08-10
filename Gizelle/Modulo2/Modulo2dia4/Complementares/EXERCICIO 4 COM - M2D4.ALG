Algoritmo "EXERCICIO 4 COM - M2D4"
// Ler um vetor com 10 nomes de pessoas, após pedir que o usuário digite
//um nome qualquer de pessoa. Escrever a mensagem “ACHEI”, se o nome estiver
//armazenado no vetor ou “NÃO ACHEI” caso contrário.

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
    escreval("Não achei!")
 fimse

Fimalgoritmo