Algoritmo "semnome"
// Crie um algoritmo que armazenará 5 notas de 10 alunos em uma
//matriz.
Var
   notas : vetor [0..9,0..4] de inteiro
   a,b : inteiro

Inicio
   para a de 0 ate 9  faca
      para b de 0 ate 4  faca
         Escreval ("Escreva as notas  :" )
         leia ( notas[a,b] )
      fimpara
   fimpara

   para a de 0 ate 9  faca
      para b de 0 ate 4  faca
         Escreval ("As notas são :  " ,notas[a,b])
      fimpara
   fimpara

Fimalgoritmo