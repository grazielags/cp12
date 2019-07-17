Algoritmo "semnome"
// Escreva um algoritmo que receba 10 números obtidos do usuário e
//armazene em um vetor a metade de cada número informado pelo
//usuário. Imprima todos os valores armazenados.
Var
   numeros : vetor [0..9] de inteiro
   i: inteiro

Inicio
   para i de 0 ate 9 passo 1 faca
      Escreval("Digite os seus numeros : ")
      leia(numeros[i])
      numeros[i]<- numeros[i] div 2
   fimpara
   para i de 0 ate 9 passo 1 faca
      Escreval(numeros[i])
   fimpara


Fimalgoritmo