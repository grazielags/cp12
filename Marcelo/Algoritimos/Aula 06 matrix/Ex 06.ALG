Algoritmo "semnome"
// Escrever um algoritmo que crie uma matriz de 4 x 4 preencha os
//valores da matriz com informações do usuário e obtenha o número
//de uma linha do usuário para realizar a soma dos valores da linha
//informada.
Var
   notas : vetor [0..3,0..3] de inteiro
   a,b,linha,soma : inteiro

Inicio
   para a de 0 ate 3  faca
      para b de 0 ate 3  faca
         Escreval ("Escreva os valores  :" )
         leia ( notas[a,b] )
      fimpara
   fimpara

   Escreval ("Escreva a linha")
   leia (linha)
   para b de 0 ate 3  faca
      Escreval ("Os valores são :  ", notas[linha,b])
      soma<- soma + notas[linha,b]
   fimpara

   Escreval (soma)
Fimalgoritmo