Algoritmo "Média do aluno"

Var
   media: real
   nomealuno: caracter
   nota1, nota2, nota3, nota4: real

Inicio
   Escreval ("Escreva o seu nome")
   leia (nomealuno)
   Escreval ("Escreva a sua 1º nota")
   leia (nota1)
   Escreval ("Escreva a sua 2º nota")
   leia (nota2)
   Escreval ("Escreva a sua 3º nota")
   leia (nota3)
   Escreval ("Escreva a sua 4º nota")
   leia (nota4)

   media<- (nota1 + nota2 + nota3 + nota4) / 4

   escolha media
   caso 0 ate 3
      escreval ("Reprovado")
   caso 3.1 ate 6.9
      escreval ("Ema recuperação")
   caso 7 ate 10
      escreval ("Aprovado")
   outrocaso
      escreval ("Nota inválida.")
   fimescolha



Fimalgoritmo