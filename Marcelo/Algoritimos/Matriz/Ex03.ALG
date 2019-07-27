Algoritmo "semnome"
// Escreva um algoritmo que preencha os valores de uma matriz 5 x 5
//e após a matriz estar preenchida deve apresentar os valores da
//diagonal da matriz. Começando pelo valor na posição 0 x 0.
Var
   V : vetor [0..4,0..4] de inteiro
   l,c: inteiro

Inicio

   para l de 0 ate 4 faca
      para c de 0 ate 4 faca
         Escreval ("Escreva os valores")
         leia (v[l,c])
      fimpara
   fimpara


   para l de 0 ate 4 faca
      para c de 0 ate 4 faca

         se l = c entao
            escreval ("Linha", l , " Coluna ", c, " = ", v[l,c] )
         fimse
      fimpara
   fimpara


   //Escreval (v[0,0])
   //escreval (v[1,1])
   //Escreval (v[2,2])
   //Escreval (v[3,3])
   //Escreval (v[4,4])


Fimalgoritmo