Algoritmo "dez"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 09/07/2019
Var
a: real
b: real
c: real
option: caractere


Inicio
Escreva("Digite um numero para ser armazenado na variavel a:")
Leia(a)
Escreva("Digite um numero para ser armazenado na variavel b:")
Leia(b)
Escreval("Dados armazenados . . .")
Escreval("a:", a)
Escreval("b:", b)
Escreva("Deseja trocar os valores entre as variaveis a e b?(s ou n)")
Leia(option)
se (option="s") entao
c<-a
a<-b
b<-c
Escreval("a:", a)
Escreval("b:", b)
senao pause
fimse

Fimalgoritmo