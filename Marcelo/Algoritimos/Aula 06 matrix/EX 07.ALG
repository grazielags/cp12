Algoritmo "semnome"
// Crie uma matriz onde cada elemento terá o valor da soma dos seus
//índices:
//0 + 0 = 0
//0 + 1 = 1
Var
   valor : vetor [0..2,0..2] de inteiro
   a,b: inteiro
Inicio

   para a de 0 ate 2 faca
      para b de 0 ate 2 faca
         valor [a,b] <- a + b
      fimpara
   fimpara

   para a de 0 ate 2 faca
      para b de 0 ate 2 faca
         Escreval (valor[a,b])
      fimpara
   fimpara



Fimalgoritmo