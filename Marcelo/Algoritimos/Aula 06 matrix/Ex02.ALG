Algoritmo "semnome"
// Escreva um algoritmo que multiplique os valores de 2 matrizes 2 x
//2.
Var
   valor: vetor [0..5,0..5] de inteiro
   a,b : inteiro
   valor2 : vetor [0..5,0..5] de inteiro

Inicio
   para a de 0 ate 5 faca
      para b de 0 ate 5 faca
         Escreval ("Digite os valores")
         leia(valor [a,b] )
      fimpara
   fimpara
   para a de 0 ate 5 faca
      para b de 0 ate 5 faca
         Escreval ("Digite os valores")
         leia (valor2[a,b])
      fimpara
   fimpara
   para a de 0 ate 5 faca
      para b de 0 ate 5 faca
         Escreval(valor[a,b] * valor2[a,b])
      fimpara
   fimpara
Fimalgoritmo