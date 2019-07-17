Algoritmo "seis"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 09/07/2019
Var
notas100: inteiro
notas50: inteiro
notas10: inteiro
notas5: inteiro
notas1: inteiro
valor: inteiro


Inicio
Escreva("Informe o valor para retirar as notas: ")
Leia(valor)
se (valor/100) > 0 entao
   notas100 <- valor div 100
   valor <- valor mod 100
fimse
se (valor/100) > 0 entao
   notas50 <- valor div 50
   valor <- valor mod 50
fimse
se (valor/100) > 0 entao
   notas10 <- valor div 10
   valor <- valor mod 10
fimse
se (valor/100) > 0 entao
   notas5 <- valor div 5
   valor <- valor mod 5
fimse
se (valor/100) > 0 entao
   notas1 <- valor div 1
   valor <- valor mod 1
fimse

Escreval("Confirme os dados:")
Escreval("Notas de 100 que serão imprimidas:", notas100)
Escreval("Notas de 50 que serão imprimidas:", notas50)
Escreval("Notas de 10 que serão imprimidas:", notas10)
Escreval("Notas de 5 que serão imprimidas:", notas5)
Escreval("Notas de 1 que serão imprimidas:", notas1)

Fimalgoritmo