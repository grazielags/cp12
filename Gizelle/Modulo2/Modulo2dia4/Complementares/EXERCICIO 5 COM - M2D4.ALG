Algoritmo "EXERCICIO 5 COM - M2D4"
//  Leia 2 vetores de 3 posição de números inteiro, após isso verifique se
//os 2 vetores possuem os mesmos elementos

Var
num1, num2 : vetor [0..2, 0..2] de inteiro
i, l , quantidade: inteiro

Inicio

para i de 0 ate 2 passo 1 faca
     Escreva ("Digite um número para o vetor1: ")
     leia(num1[i])
fimpara

para l de 0 ate 2 passo 1 faca
     Escreva ("Digite um número para o vetor2: ")
     leia(num2[l])
fimpara

quantidade<-0

para i de 0 ate 2 faca
      se (num1[i] = num2[i]) entao
         quantidade <- quantidade + 1
      fimse
fimpara

escreval(" ")
  se (quantidade = 1) então
     escreval("Os vetores possuem", quantidade, " igual")
  senao
     escreval ("Existem", quantidade, " números iguais nas mesmas posiões dos vetores")
  fimse

Fimalgoritmo