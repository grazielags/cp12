Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 09/07/2019
Var
// Seção de Declarações das variáveis 
nota1,nota2,nota3 : real
    Aluno : caracter
    media: real
Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
    Escreval ("Escreva a nota 1")
    leia (nota1)
    Escreval ("Escreva a nota 2")
    leia(nota2)
    Escreval ("Escreva a nota 3")
    leia (nota3)
    media <- (nota1+nota2+nota3) /3
    se media >= 7 então
    Escreval ("Passou")
    senao
    Escreval ("Rodou")
    fimse
Fimalgoritmo