Algoritmo "semnome"
// Escreva um algoritmo que possua um vetor inteiro de 5 posi��es
//com os n�meros fornecidos pelo usu�rio atrav�s do leia. Ap�s
//preencher o vetor apresentar a posi��o e o valor preenchido nessa
//posi��o.
Var
   i:inteiro
   valores: vetor [0..4] de inteiro

Inicio
   para i de 0 ate 4   faca
      Escreval("Digite o valor : ")
      leia(valores[i])
   fimpara
   para i de 0 ate 4       faca
      Escreval(valores[i] , "-" , i)
   fimpara

Fimalgoritmo