Algoritmo "quatro"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 16/07/2019
Var
idadeV: vetor [1..3] de inteiro
categoriaV: vetor [1..3] de caracter
i, idade: inteiro


Inicio
para i de 1 ate 3 passo 1 faca
     Escreva("Informe a sua idade: ")
     Leia(idadeV[i])
     se (idadeV[i] >= 5) e (idadeV[i] <=7) entao
        categoriaV[i] <- "Infantil A"
     fimse
     se (idadeV[i] >= 8) e (idadeV[i] <=10) entao
        categoriaV[i] <- "Infantil B"
     fimse
     se (idadeV[i] >= 11) e (idadeV[i] <=13) entao
        categoriaV[i] <- "Juvenil A"
     fimse
     se (idadeV[i] >= 14) e (idadeV[i] <=17) entao
        categoriaV[i] <- "Juvenil B"
     fimse
     se (idadeV[i] >= 18) entao
        categoriaV[i] <- "Adulto"
     fimse
fimpara

limpatela
     
para i de 1 ate 3 passo 1 faca
     Escreval("Idade:", idadeV[i], "; Categoria: ", categoriaV[i])
fimpara


Fimalgoritmo