Algoritmo "exercicio 4"
//Elabore um algoritmo que leia 5 valores inteiros e apresente na tela
//o maior e o menor deles.

var
num1, num2,num3, num4, num5 : inteiro
maior, menor : inteiro

inicio
      Escreva ("Digite primeiro número: ")
      Leia (num1)
           maior <- num1
           menor <- num1
      Escreva ("Digite segundo número:  ")
      Leia (num2)
           se num2 > maior entao
              maior <- num2
           fimse
           se num2 < menor entao
              menor <- num2
           fimse
      Escreva ("Digite terceiro número:  ")
      Leia (num3)
           se num3 > maior entao
              maior <- num3
           fimse
           se num3 < menor entao
              menor <- num3
           fimse
      Escreva ("Digite quarto número:  ")
      Leia (num4)
           se num4 > maior entao
              maior <- num4
           fimse
           se num2 < menor entao
              menor <- num2
           fimse
      Escreva ("Digite quinto número:  ")
      Leia (num5)
           se num5 > maior entao
              maior <- num5
           fimse
           se num5 < menor entao
              menor <- num5
           fimse
       Escreva ("O número maior é:", maior, " e o menor é: ", menor)

fimalgoritmo