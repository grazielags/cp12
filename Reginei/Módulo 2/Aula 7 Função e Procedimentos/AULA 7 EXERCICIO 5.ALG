Algoritmo "aula 7 exercicio 5"
//5. Escreva um algoritmo com 2 procedimentos, um para preencher o
//vetor de 10 posições e outro que realize a soma dos valores deste
//vetor e apresente o valor total na tela.

Var
   i, soma: inteiro
   numeros:vetor[0..9] de inteiro
procedimento preencher()

inicio
   para i de 0 ate 9 faca
      escreva("Digite um numero: ")
      leia(numeros[i])
   fimpara
fimprocedimento
procedimento somar()
inicio
   para i de 0 ate 9 faca
      soma <- soma + numeros[i]
   fimpara
fimprocedimento

Inicio
   preencher()
   somar()
   escreva("A soma dos elementos do Vetor é: ", soma)
Fimalgoritmo