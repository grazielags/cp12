Algoritmo "semnome"
//Calcular a soma dos números ímpares de um intervalo informado pelo usuário.




Var
   i,impar: inteiro
   numero : vetor [0..8] de inteiro
   soma:inteiro

procedimento inserir ()
inicio
   para i de 0 ate 8  faca
      Escreval("Escreva os  valores")
      leia(numero [i])
   fimpara
fimprocedimento

procedimento impar ()
inicio
   para i de 0 ate 9 faca
      impar<-numero[i]%2=1
      Escreval (numero [i], "é impar")
   fimpara
fimprocedimento

Inicio
   Escreval("Vamos começar")
   inserir()
   impar()

Fimalgoritmo