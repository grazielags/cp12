Algoritmo "M�dia do aluno"

Var
   media: real
   nomealuno: caracter
   nota1, nota2, nota3, nota4: real

Inicio
   Escreval ("Escreva o seu nome")
   leia (nomealuno)
   Escreval ("Escreva a sua 1� nota")
   leia (nota1)
   Escreval ("Escreva a sua 2� nota")
   leia (nota2)
   Escreval ("Escreva a sua 3� nota")
   leia (nota3)
   Escreval ("Escreva a sua 4� nota")
   leia (nota4)

   media<- (nota1 + nota2 + nota3 + nota4) / 4

   escolha media
   caso 0 ate 3
      escreval ("Reprovado")
   caso 3.1 ate 6.9
      escreval ("Ema recupera��o")
   caso 7 ate 10
      escreval ("Aprovado")
   outrocaso
      escreval ("Nota inv�lida.")
   fimescolha



Fimalgoritmo