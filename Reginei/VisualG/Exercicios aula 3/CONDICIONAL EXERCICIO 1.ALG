Algoritmo "condicional exercicio 1"
Var
   nome:caractere
   nota1 ,nota2, nota3 ,media :real

Inicio
   escreva("Qual nome: ")
   leia(nome)
   escreva("digite a nota 1: ")
   leia(nota1)
   escreva("digite a nota 2: ")
   leia(nota2)
   escreva("digite a nota 3: ")
   leia (nota3)
   media <- (nota1+nota2+nota3)/3
   escreva( media )
   se media >= 7 entao
      escreval( nome , " Aprovado")
   senao
      escreval( nome, " Reprovado")
   fimse
Fimalgoritmo