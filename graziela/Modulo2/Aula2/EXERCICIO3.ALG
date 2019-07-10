Algoritmo "Exercicio3"
//Elabore um algoritmo que leia dois números inteiros e
//mostre o resultado da diferença do maior valor pelo menor.
Var
   numero1, numero2, diferenca: inteiro
Inicio
   Escreva("Digite um número: ")
   Leia(numero1)
   Escreva("Digite um número: ")
   Leia(numero2)
   se numero1 > numero2 entao
      diferenca <- numero1 - numero2
      Escreval("A diferença de ", numero1, " por ", numero2, " é: ", diferenca)
   senao
      diferenca <- numero2 - numero1
      Escreval("A diferença de ", numero2, " por ", numero1, " é: ", diferenca)
   fimse
Fimalgoritmo