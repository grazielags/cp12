Algoritmo "semnome"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 09/07/2019
Var
   // Se��o de Declara��es das vari�veis
   n1,n2,n3,n4,n5,maior,menor : inteiro

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
   Escreval ("escreva n1")
   leia (n1)
   maior <- n1
   menor <- n1
   Escreval ("escreva n2")
   leia (n2)
   se n2 > maior entao
      maior <- n2
   fimse
   se n2 < menor ent�o
      menor <- n2
   fimse
   Escreval ("escreva n3")
   leia (n3)
   se n3 > maior entao
      maior <- n3
   fimse
   se n3 < menor entao
      menor <- n3
   fimse
   Escreval ("escreva n4")
   leia (n4)
   se n4 > maior entao
      maior <- n4
   fimse
   se n4 < menor entao
      menor <- n4
   fimse
   Escreval ("escreva n5")
   leia (n5)
   se n5 > maior entao
      maior <- n5
   fimse
   se n5 < menor entao
      menor <- n5
   fimse
   Escreval("o maior � ", maior , " e o menor �" , menor)
Fimalgoritmo