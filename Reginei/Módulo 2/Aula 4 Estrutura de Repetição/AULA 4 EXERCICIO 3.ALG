algoritmo "aula 4 exercicio 3"
//3. Escrever um algoritmo que leia valores para m e n e que calcule a
//soma dos valores entre o menor valor de m e n e o maior valor de
//m e n.
var

   maior, menor, m, n, i, soma: inteiro

inicio
   Escreva("digite um numero: ")
   leia(m)
   escreval
   Escreva("digite outro numero: ")
   leia(n)
   se m > n entao
      maior <- m
      menor <- n
   senao
      maior <-n
      menor <-m
   fimse
   para i de menor ate maior passo 1 faca
      soma<- soma + i
   fimpara
   escreval
   escreva("A soma dos valores é: ", soma)
   escreval
fimalgoritmo
