Algoritmo "exercicio 1"
//Escrever um algoritmo que leia o nome e as três notas obtidas por
//um aluno durante o semestre. Calcular a sua média (aritmética),
//informar o nome e sua menção aprovado (media >= 7),
//Reprovado (media < 7).
var
nota1, nota2, nota3 : real
nome : caractere
media : real

inicio

Escreva("Nome do aluno:  ")
Leia (nome)
Escreva ("Nota Prova 1: ")
Leia (nota1)
Escreva ("Nota Prova 2: ")
Leia (nota2)
Escreva ("Nota Trabalho: ")
Leia (nota3)
media := (nota1+nota2+nota3)/3
Escreva (media)

se media >= 7 entao
      escreval (" - Aprovado")
senao
          escreval (" - Reprovado")
fimse

fimalgoritmo