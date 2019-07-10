Algoritmo "condicional exercicio 1"
Var
   nome:caractere
   nota1 ,nota2, nota3 ,media :real
   
Inicio
      escreva("Qual nome: ")
      leia(nome)
      escreva("digite a nota1: ")
      leia(nota1)
      escreva("digite a nota2: ")
      leia(nota2)
      escreva("digite a nota3: ")
      leia (nota3)
      media <- (nota1+nota2+nota3)/3
      escreva(media)
      se media > 7 entao
      escreval(" Aprovado")
      senao
      escreval(" Reprovado")
      fimse
Fimalgoritmo