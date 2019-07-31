Algoritmo "semnome"
// Escrever um algoritmo que crie uma matriz de 4 x 4 preencha os
//valores da matriz com informações do usuário e após verifique qual
//o maior valor e qual o menor valor presente na matriz.
Var
   valor: vetor [0..3,0..3] de inteiro
   l,c : inteiro
   maior,menor: inteiro

Inicio
   para l de 0 ate 3     faca
      para c de 0 ate 3  faca
         Escreval ("Digite os valores")
         leia(valor[l,c])
         se (l = 0) e (c = 0) entao
         maior<- valor[l,c]
         menor<- valor[l,c]
      senao
         se valor[l,c]> maior entao
            maior<- valor[l,c]
         fimse
         se valor[l,c]< menor entao
            menor<- valor[l,c]
         fimse
      fimse
      fimpara
   fimpara

         Escreval("O maior valor é :", maior, " e o menor valor é :", menor)

Fimalgoritmo