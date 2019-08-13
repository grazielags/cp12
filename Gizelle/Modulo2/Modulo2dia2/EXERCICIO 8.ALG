Algoritmo "exercicio 8"
//Escrever um algoritmo que leia o nome e as 4 notas do semestre de
//um aluno. Calcular a média, informar o nome e:
//Aprovado (media >= 7); Reprovado (media <= 3) Recuperação (media 3.1 a 6.9).

var
nota1, nota2, trab1,trab2 : real
nome : caractere
media : real

inicio

Escreva("Nome do aluno:  ")
Leia (nome)
Escreva ("Nota Prova 1: ")
Leia (nota1)
Escreva ("Nota Prova 2: ")
Leia (nota2)
Escreva ("Nota Trabalho1: ")
Leia (trab1)
Escreva ("Nota Trabalho2: ")
Leia (trab2)

media := (nota1+nota2+trab1+trab2)/4


   se media >= 7 entao
   Escreval("Aluno(a): ", nome, " com média ", media, " está aprovado(a)")
   fimse
      se (media > 3.1)e(media < 6.9) entao
      escreval("Aluno(a): ", nome, " com média ", media, " está em recuperação")
      fimse
         se media <=3 entao
         escreval("Aluno(a): ", nome, " com média ", media, " está reprovado(a)")
         fimse

fimalgoritmo