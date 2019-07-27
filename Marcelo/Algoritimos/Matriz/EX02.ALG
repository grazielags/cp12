Algoritmo "semnome"
// Escreva um algoritmo que multiplique os valores de 2 matrizes 2 x
//2.
Var
   m1 : vetor [ 0..1,0..1 ] de inteiro
   m2 : vetor [ 0..1,0..1] de inteiro
   i,l,c: inteiro        /


Inicio

   para l de 0 ate 1 faca
      para c de 0 ate 1 faca
         escreval (" Matriz 1 ")
         leia(m1[l,c])

      fimpara
   fimpara

   para l de 0 ate 1 faca
      para c de 0 ate 1 faca
         escreval (" Matriz 2 ")
         leia(m2[l,c])
      fimpara
   fimpara
   para l de 0 ate 1 faca
      para c de 0 ate 1 faca
         escreval ("Resultado da,  Matriz 1{" ,m1[l,c] ,"} X Matriz 2 {", m2[l,c],"} é "  ,m1[l,c]*m2[l,c])
      fimpara
   fimpara
Fimalgoritmo