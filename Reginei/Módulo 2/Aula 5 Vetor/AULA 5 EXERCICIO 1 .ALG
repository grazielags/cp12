algoritmo "aula 5 exercicio 1 "
//1. Escreva um algoritmo que possua um vetor inteiro de 5 posi��es
//com os n�meros fornecidos pelo usu�rio atrav�s do leia. Ap�s
//preencher o vetor apresentar a posi��o e o valor preenchido nessa
//posi��o.
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