Algoritmo "dois"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 16/07/2019
Var
n: vetor[1..5] de inteiro
i, contador: inteiro


Inicio
contador <- 1
para i de 1 ate 5 passo 1 faca
     Escreval(contador)
     n[i] <- contador * contador
     contador <- contador + 2
fimpara


Escreval("Valores armazenados: ")
para i de 1 ate 5 passo 1 faca
     Escreval(n[i])
fimpara


Fimalgoritmo