Algoritmo "semnome"
// Escreva um algoritmo que possua um vetor inteiro de 5 posições
//com os números fornecidos pelo usuário através do leia. Após
//preencher o vetor apresentar a posição e o valor preenchido nessa
//posição.
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