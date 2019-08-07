Algoritmo "oito"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 11/07/2019
Var
nome: caracter
n1: real
n2: real
n3: real
n4: real
media: real


Inicio
Escreva("Informe seu nome: ")
LEia(nome)
Escreva("Informe a nota da prova 1: ")
Leia(n1)
Escreva("Informe a nota da prova 2: ")
Leia(n2)
Escreva("Informe a nota da prova 3: ")
Leia(n3)
Escreva("Informe a nota da prova 4: ")
Leia(n4)
media <- (n1+n2+n3+n4)/4
se media>=7 entao
   Escreval("Nome: ", nome)
   Escreval("Média: ", media)
   Escreval("Aprovado!!!")
fimse
se media<7 entao
   Escreval("Nome: ", nome)
   Escreval("Média: ", media)
   Escreval("Reprovado!!!")
fimse
se (media>=3.1) e (media<=6.9) entao
   Escreval("Em recuperação!!!")
fimse


Fimalgoritmo