Algoritmo "EXERCICIO 5 COM - M2D4"
//  Leia 2 vetores de 3 posi��o de n�meros inteiro, ap�s isso verifique se
//os 2 vetores possuem os mesmos elementos

Var
num1, num2 : vetor [0..2, 0..2] de inteiro
i, l , quantidade: inteiro

Inicio

para i de 0 ate 2 passo 1 faca
     Escreva ("Digite um n�mero para o vetor1: ")
     leia(num1[i])
fimpara

para l de 0 ate 2 passo 1 faca
     Escreva ("Digite um n�mero para o vetor2: ")
     leia(num2[l])
fimpara

quantidade<-0

para i de 0 ate 2 faca
      se (num1[i] = num2[i]) entao
         quantidade <- quantidade + 1
      fimse
fimpara

escreval(" ")
  se (quantidade = 1) ent�o
     escreval("Os vetores possuem", quantidade, " igual")
  senao
     escreval ("Existem", quantidade, " n�meros iguais nas mesmas posi�es dos vetores")
  fimse

Fimalgoritmo