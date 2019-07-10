Algoritmo "Exercicio 1"
// 
//  
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Lucas Silva Porto
// Data atual  : 09/07/2019
Var
// Seção de Declarações das variáveis 
nota1, nota2, nota3, media: real


Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreva ("digite a nota 1: ")
leia (nota1)
escreva ("digite a nota 2: ")
leia (nota2)
escreva ("digite a nota 3: ")
leia (nota3)
media := (nota1+nota2+nota3)/3
escreva (media)
se media >= 7 entao
escreval (" - aprovado")
senao
escreval (" - reprovado")
fimse
Fimalgoritmo