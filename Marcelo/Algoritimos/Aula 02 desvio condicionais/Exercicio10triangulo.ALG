Algoritmo "semnome"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 11/07/2019
Var
   // Se��o de Declara��es das vari�veis
   a,b,c: inteiro

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
   Escreval("Escreva o valor do lado A")
   leia(a)
   Escreval("Escreva o valor do lado B")
   leia(b)
   Escreval("Escreva o valor do lado C")
   leia(c)
   se (a<(b+c)) E (b<(a+c))E (c<(a+b)) entao
      se (a=B) E (a=c) E (b=c) entao
         Escreval ("O triangulo � Equilatero")
      senao
         se (a<>b) E (a<>c) E (b<>c) entao
            Escreval ("O triangulo � escaleno")
         senao
            Escreval ("O triangulo � Isosceles")
         fimse
      fimse
   senao
      Escreval ("N�o � um triangulo")
   fimse

Fimalgoritmo