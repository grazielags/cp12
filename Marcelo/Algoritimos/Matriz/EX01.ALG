Algoritmo "semnome"
// Escrever um algoritmo que crie uma matriz de 4 x 4 preencha os
//valores da matriz com informa��es do usu�rio e ap�s verifique qual
//o maior valor e qual o menor valor presente na matriz.
Var
   valores : vetor [0..3,0..3] de inteiro
   l,c,maior,menor : inteiro


Inicio

   para l de 0 ate 3 faca
      para c de 0 ate 3  faca
         Escreval (" Escreva os valores " )
          leia(valores[l,c])



        se valores[l,c]> maior entao
     maior <- valores [l,c]
       fimse
     se valores[l,c]< menor entao
     menor <- valores [l,c]
       fimse
            fimpara
                     fimpara
     Escreval( "O valor menor �  " , menor,  "   O valor maior � ", maior )
                     

Fimalgoritmo