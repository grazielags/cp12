Algoritmo "um"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 11/07/2019
Var
   num1, soma: inteiro


Inicio
   Escreva("Digite o primeiro num: ")
   Leia(num1)
   enquanto (num1 mod 2 ) = 0 faca
      soma <- num1 + soma
      Escreval("Soma parcial: ", soma)
      Escreva("Digite o outro num para somar: ")
      Leia(num1)
   fimenquanto
   Escreval("Soma final: ", soma)
   Escreval("Num impar identificado!")

Fimalgoritmo