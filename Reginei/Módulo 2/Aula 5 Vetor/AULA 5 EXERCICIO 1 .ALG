algoritmo "aula 5 exercicio 1 "
//1. Escreva um algoritmo que possua um vetor inteiro de 5 posições
//com os números fornecidos pelo usuário através do leia. Após
//preencher o vetor apresentar a posição e o valor preenchido nessa
//posição.
var
   numero : vetor [0..4] de inteiro
   i : inteiro
inicio
     para i de 0 ate 4 passo 1 faca
          Escreva("Digite a nota[",i,"]:")
          leia(numero[i])
      fimpara
      limpatela
      Escreval("Listagem dos numeros: ")
      para i de 0 ate 4 passo 1 faca
           Escreval(" o numero de", i, numero[i])
      fimpara
fimalgoritmo