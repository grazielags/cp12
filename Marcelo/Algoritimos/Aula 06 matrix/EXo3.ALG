Algoritmo "semnome"
// Escreva um algoritmo que preencha os valores de uma matriz 5 x 5
//e após a matriz estar preenchida deve apresentar os valores da
//diagonal da matriz. Começando pelo valor na posição 0 x 0.
Var
 valor : vetor [0..5,0..5] de inteiro
 a,b: inteiro


Inicio

   para a de 0 ate 4 faca
       para b de 0 ate 4 faca
           Escreval("Digite os valores")
           leia(valor[a,b])
       fimpara
    fimpara
   para a de 0 ate 4 faca
      para b de 0 ate 4 faca
        se   a = b entao
      Escreval (valor[a,b])
        fimse
      fimpara
         fimpara

Fimalgoritmo