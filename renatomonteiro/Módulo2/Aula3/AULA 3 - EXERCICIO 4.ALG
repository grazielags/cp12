Algoritmo "Aula 3 - exercicio 4"
//Elabore um algoritmo que leia 5 valores inteiros e apresente na tela
//o maior e o menor deles.
Var

 num1, num2, num3, num4, num5, maior, menor: inteiro

Inicio
     escreva ("digite um numero qualquer: ")
     leia(num1)
     maior <-  num1
     menor <-  num1
     escreva ("digite um numero qualquer: ")
     leia(num2)
     se num2 > maior entao
        maior <-  num2
        fimse
     se num2 < menor entao
        menor <-  num2
        fimse
     escreva ("digite um numero qualquer: ")
     leia(num3)
     se num3 > maior entao
        maior <-  num3
        fimse
     se num3 < menor entao
        menor <-  num3
        fimse
     escreva ("digite um numero qualquer: ")
     leia(num4)
     se num4 > maior entao
        maior <-  num4
        fimse
     se num4 < menor entao
        menor <-  num4
     escreva ("digite um numero qualquer: ")
     leia(num5)
     se num5 > maior entao
        maior <-  num5
        fimse
     se num5 < menor entao
        menor <-  num5
        fimse
      escreval("maior: ", maior, " menor: ", menor)
Fimalgoritmo
