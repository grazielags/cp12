Algoritmo "semnome"
//  Escreva um algoritmo com 2 procedimentos, um para preencher o vetor de 10
//posições e outro que realize a soma dos valores deste vetor
//e apresente o valor total na tela.

Var
   i,soma: inteiro
   numero : vetor [0..9] de inteiro

procedimento inserir ()
inicio
   para i de 0 ate 9  faca
      Escreval("Escreva os  valores")
      leia(numero [i])
   fimpara
fimprocedimento

procedimento somar ()
inicio
   para i de 0 ate 9  faca
      soma<- soma+numero[i]
   fimpara
fimprocedimento

Inicio
    inserir ()
    somar ()
    Escreval ("A soma é ",soma )

Fimalgoritmo