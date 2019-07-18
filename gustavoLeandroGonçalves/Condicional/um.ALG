Algoritmo "um"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 09/07/2019
Var
n1, n2, n3, media: real
nome: caracter


Inicio
Escreva("Digite seu nome: ")
Leia(nome)
Escreva("Informa a nota 1: ")
Leia(n1)
Escreva("Informa a nota 2: ")
Leia(n2)
Escreva("Informa a nota 3: ")
Leia(n3)
media <- (n1+n2+n3)/3
Escreval()
se (media<7) entao
   Escreval("Aluno: ", nome)
   Escreval("Status: Reprovado")
senao
     Escreval("Aluno: ", nome)
     Escreval("Status: Aprovado")
fimse


Fimalgoritmo