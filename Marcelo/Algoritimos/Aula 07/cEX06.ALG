Algoritmo "semnome"
//Calcular a soma dos n�meros �mpares de um intervalo informado pelo usu�rio.




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

procedimento impar1 ()
inicio
   para i de 0 ate 9 faca
      impar<-numero[i]%2=1
      Escreval (numero [i], "� impar")
   fimpara
fimprocedimento

Inicio
   Escreval("Vamos come�ar")
   inserir()
   impar1()

Fimalgoritmo