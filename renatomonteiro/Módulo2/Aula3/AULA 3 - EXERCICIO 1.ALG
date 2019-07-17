Algoritmo "Aula 3 - exercicio 1"
//1. Escrever um algoritmo que leia o nome e as três notas obtidas por
//um aluno durante o semestre. Calcular a sua média (aritmética),
//informar o nome e sua menção aprovado (media >= 7),
//Reprovado (media < 7).
Var

 nome:caractere
 nota1, nota2, nota3, media:real

Inicio
     escreva ("Qual nome?: ")
     leia(nome)
     escreva ("digite nota1: ")
     leia(nota1)
      escreva ("digite nota2: ")
     leia(nota2)
      escreva ("digite nota3: ")
     leia(nota3)
     media <- (nota1+nota2+nota3)/3
     escreval("sua media foi" media,)
     se media > 7 entao
     escreval(nome, " Aprovado!")
     senao
     escreval(nome, " Reprovado!")
     fimse

Fimalgoritmo