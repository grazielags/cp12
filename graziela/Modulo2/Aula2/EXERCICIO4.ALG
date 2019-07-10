Algoritmo "Exercicio4"
//Elabore um algoritmo que leia 5 valores
//inteiros e apresente na tela o maior e o
//menor deles.
Var
   numero1, numero2, numero3, numero4: inteiro
   numero5, maior, menor: inteiro
Inicio
   escreva("Digite o primeiro número: ")
   leia(numero1)
   maior <- numero1
   menor <- numero1
   escreva("Digite o segundo número: ")
   leia(numero2)
   se numero2 > maior entao
      maior <- numero2
   fimse
   se numero2 < menor entao
      menor <- numero2
   fimse
   escreva("Digite o terceiro número: ")
   leia(numero3)
   escreva("Digite o quarto número: ")
   leia(numero4)
   escreva("Digite o quinto número: ")
   leia(numero5)
   //se (numero1 > numero2) E (numero1 > numero3) E (numero1 > numero4) E (numero1 > numero5) entao
      //maior <- numero1
   //fimse
   algoritmo