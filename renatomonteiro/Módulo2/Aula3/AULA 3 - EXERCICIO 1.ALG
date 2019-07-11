Algoritmo "Aula 3 - exercicio 1"

Var
 nome1, nome2:caractere
 nota1, nota2, nota3, media:real
 num1, num2: inteiro


Inicio
     escreva ("Qual nome?: ")
     leia(nome1)
     escreva ("digite nota1: ")
     leia(nota1)
      escreva ("digite nota2: ")
     leia(nota2)
      escreva ("digite nota3: ")
     leia(nota3)
     media <- (nota1+nota2+nota3)/3
     escreva(media)
     se media > 7 entao
     escreval(" Aprovado")
     senao
     escreval(" Reprovado")
     fimse

Fimalgoritmo