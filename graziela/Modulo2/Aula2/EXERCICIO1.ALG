Algoritmo "Exercicio1"
//Escrever um algoritmo que leia o nome e as
//três notas obtidas por um aluno durante o semestre.
//Calcular a sua média (aritmética),
//informar o nome e sua menção aprovado (media >= 7),
//Reprovado (media < 7).
Var
   nome: caractere
   nota1, nota2, nota3, media: real
Inicio
   Escreva("Digite o nome: ")
   Leia(nome)
   Escreva("Digite a primeira nota: ")
   Leia(nota1)
   Escreva("Digite a segunda nota: ")
   Leia(nota2)
   Escreva("Digite a terceira nota: ")
   Leia(nota3)
   media <- (nota1 + nota2 + nota3) / 3
   se media >= 7 entao
      escreva(nome, " -> Aprovado! Com média: ", media)
   senao
      escreva(nome, " -> Reprovado! Com média: ", media)
   fimse
Fimalgoritmo