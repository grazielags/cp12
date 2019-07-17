Algoritmo "semnome"
// Escreva um algoritmo que leia 2 valores X e Y e que calcule X na
//potência Y.
Var
   resultado,i,x,y:inteiro

Inicio
   Escreval("Escreva X " )
   leia(x)
   Escreval ("Escreva Y " )
   leia (y)
    resultado<-1
   para i de 1 ate y passo 1 faca
       resultado<- resultado*x
   fimpara
         Escreval(resultado)
Fimalgoritmo