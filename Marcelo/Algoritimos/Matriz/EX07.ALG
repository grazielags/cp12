Algoritmo "semnome"
// Crie uma matriz onde cada elemento ter� o valor da soma dos seus
//�ndices:
//0 + 0 = 0
Var
   m : vetor [0..5,0..5] de inteiro
   l,c,soma: inteiro

Inicio
   para l de 0 ate 5  faca
      para c de 0 ate 5  faca
         soma <- l + c
         Escreval ("A soma da linha  ", l, "com a coluna   ", c, " �: ", soma)

   fimpara
fimpara
Fimalgoritmo