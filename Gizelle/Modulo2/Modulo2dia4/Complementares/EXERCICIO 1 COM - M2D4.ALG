Algoritmo "EXERCICIO 1 COM - M2D4"
//Leia um vetor de 10 posições e após o preenchimento de todo o vetor,
//imprimir seus valores na ordem contrária, ou seja, do último elemento
//ao primeiro elemento informado


Var
numero : vetor [1..10] de inteiro
i : inteiro

inicio

para i de 1 ate 10 passo 1 faca
   Escreva("Digite o número: ")
   leia(numero[i])
fimpara

escreval ("Na ordem inversa")
para i de 10 ate 1 passo -1 faca
    escreva ( numero[i] ," ")
fimpara
escreval()

Fimalgoritmo