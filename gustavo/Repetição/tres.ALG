Algoritmo "tres"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 11/07/2019
Var
   m, n, i: inteiro
   maior, menor, soma: inteiro



Inicio
   Escreva("Digite o primeiro num: ")
   Leia(n)
   Escreva("Digite o segundo num: ")
   Leia(m)
   se (m>n) entao
      maior <- m
      menor <- n
   senao
      maior <- n
      menor <- m
   fimse
   para i de menor ate maior passo 1 faca
      soma <- i + soma
   fimpara
   Escreval("Maior: ", maior)
   Escreval("Menor: ", menor)
   Escreval("Soma: ", soma)

Fimalgoritmo