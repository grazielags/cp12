Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 11/07/2019
Var
// Seção de Declarações das variáveis 
valor:inteiro
notas100,notas50,notas10,notas5,notas1: inteiro


Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
    Escreval("Escreva o  saque")
    leia (valor)
    se (valor/100)> 0 entao
    notas100<- valor div 100
    valor <- valor Mod 100
    fimse
    se (valor/50)> 0 entao
    notas50<- valor div 50
    valor <- valor Mod 50
    fimse
    se (valor/10)> 0 entao
    notas10<- valor div 10
    valor <- valor Mod 10
    fimse
    se (valor/5)> 0 entao
    notas5<- valor div 5
    valor <- valor Mod 5
    fimse
    se valor > 0 entao
    notas1<- valor
    fimse

    Escreval ("quantidades de notas de 100",notas100)
    Escreval ("quantidades de notas de 50",notas50)
    Escreval ("quantidades de notas de 10",notas10)
    Escreval ("quantidades de notas de 5",notas5)
    Escreval ("quantidades de notas de 1",notas1)
Fimalgoritmo