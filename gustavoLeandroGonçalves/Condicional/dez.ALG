Algoritmo "dez"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 11/07/2019
Var
a: inteiro
b: inteiro
c: inteiro
ab: inteiro
ac: inteiro
bc: inteiro


Inicio
Escreva("Informe o primeiro comprimeito do lado de um triangulo: ")
Leia(a)
Escreva("Informe o segundo comprimeito do lado de um triangulo: ")
Leia(b)
Escreva("Informe o terceiro comprimeito do lado de um triangulo: ")
Leia(c)
ab <- a+b
ac <- a+c
bc <- b+c
se (ab>c)e(ac>b)e(bc>a) entao
      Escreval("Dados validos...")
      Escreval("Triangulo identificado!")
   se (a=b)e(b=c)e(c=a) entao
      Escreval("Triangulo Equilátero!")
   senao
   se (a<>b)e(b<>c)e(a<>c) entao
      Escreval("Triangulo Escaleno!")
   senao
      Escreval("Triangulo Isósceles!")
   fimse
fimse
senao
     Escreval("Dados invalidos...")
     Escreval("Não é um triangulo!!!")

fimse


Fimalgoritmo