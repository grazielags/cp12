Algoritmo "semnome"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 09/07/2019
Var
// Se��o de Declara��es das vari�veis 
nota1,nota2,nota3 : real
    Aluno : caracter
    media: real
Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc...
    Escreval ("Escreva a nota 1")
    leia (nota1)
    Escreval ("Escreva a nota 2")
    leia(nota2)
    Escreval ("Escreva a nota 3")
    leia (nota3)
    media <- (nota1+nota2+nota3) /3
    se media >= 7 ent�o
    Escreval ("Passou")
    senao
    Escreval ("Rodou")
    fimse
Fimalgoritmo