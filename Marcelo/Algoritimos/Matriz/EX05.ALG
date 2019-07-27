Algoritmo "semnome"
// Crie um algoritmo que armazenará 5 notas de 10 alunos em uma
//matriz.
Var
notas : vetor [ 0..9,0..4] de inteiro
l,c : inteiro

Inicio
 para l de 0 ate 9 faca
     para c de 0 ate 4 faca
       Escreval ("Escreva as notas dos alunos :")
     leia(notas[l,c])
  fimpara
fimpara

 para l de 0 ate 9 faca
     para c de 0 ate 4 faca
       Escreva (  notas[l,c] )
     fimpara
 fimpara
Fimalgoritmo