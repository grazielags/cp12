Algoritmo "semnome"
// Escrever um algoritmo que leia valores para m e n e que calcule a
//soma dos valores entre o menor valor de m e n e o maior valor de
//m e n.
Var

   m,n,i,menor,maior,soma:inteiro

Inicio
   Escreval("Escreva um valor")
   leia(m)
   Escreval ("Escreva outro valor")
   leia(n)
   se m > n entao
      maior<-m
      menor<-n
   senao
      maior<-n
      menor<-m
   fimse
   para i de menor ate maior passo 1 faca
      soma<- soma+i
   fimpara
        Escreval(soma)
Fimalgoritmo