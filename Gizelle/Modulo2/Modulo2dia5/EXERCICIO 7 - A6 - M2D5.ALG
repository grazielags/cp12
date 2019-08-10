Algoritmo "EXERCICIO 7 - A6 - M2D5"
//  Crie uma matriz onde cada elemento terá o valor da soma dos seus índices:
//   0 + 0 = 0
//   0 + 1 = 1.


Var
   numeros : vetor [0..3, 0..3] de inteiro
   l, c, soma: inteiro

Inicio

   para l de 0 ate 3 passo 1 faca
      para c de 0 ate 3 passo 1 faca
         numeros[l, c] <- l + c
   // se fosse multiplicação seria <- l * c
   // ou poderia marcar uma matriz com valor unico seria <- 100 (por exemplo)
      fimpara
   fimpara
   
   limpatela
   
   para l de 0 ate 3 passo 1 faca
      para c de 0 ate 3 passo 1 faca
         escreval("Numero", l, " +", c, " = ", numeros[l, c])
      fimpara
   fimpara


Fimalgoritmo