Algoritmo "semnome"
// Escrever um algoritmo que preencha os valores de uma matriz 5x5.
//Após a matriz estar preenchida realizar a soma de todos os
//elementos da matriz e apresentar o resultado na tela.
Var
v: vetor [0..4,0..4] de inteiro
l,c,soma : inteiro

Inicio
para l de 0 ate 4 faca
 para c de 0 ate 4 faca
    Escreval ("Escreva os valores")
   leia(v[c,l])
  fimpara
fimpara

  para l de 0 ate 4 faca
     para c de 0 ate 4 faca
   soma<- soma + v[l,c])
   fimpara
fimpara

  Escreval ("A somatoria é :"soma)
Fimalgoritmo