algoritmo "AULA 6 EXERCICIO 3"
//3. Escreva um algoritmo que preencha os valores de uma matriz 5 x 5
//e após a matriz estar preenchida deve apresentar os valores da
//diagonal da matriz. Começando pelo valor na posição 0 x 0.

var
   valor: vetor [0..4, 0..4] de inteiro
   l, c: inteiro

inicio

   para l de 0 ate 4 passo 1 faca
      para c de 0 ate 4 passo 1 faca
         Escreva("Digite um valor [", l, "][", c, "]: ")
         leia(valor[l, c])
      fimpara
   fimpara
   escreval
   para l de 0 ate 4 passo 1 faca
      para c de 0 ate 4 passo 1 faca
         se l = c entao
            escreval("os valores das diagonais l,c de 5 por 5 é: ", valor[l, c])
         fimse
      fimpara
   fimpara


fimalgoritmo