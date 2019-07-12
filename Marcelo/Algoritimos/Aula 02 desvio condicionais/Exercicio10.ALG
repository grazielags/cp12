Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 11/07/2019
Var
   // Seção de Declarações das variáveis
   a,b,c: inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   Escreval("Escreva o valor do lado A")
   leia(a)
   Escreval("Escreva o valor do lado B")
   leia(b)
   Escreval("Escreva o valor do lado C")
   leia(c)
   se (a<(b+c)) E (b<(a+c))E (c<(a+b)) entao
      se (a=B) E (a=c) E (b=c) entao
         Escreval ("O triangulo é Equilatero")
      senao
         se (a<>b) E (a<>c) E (b<>c) entao
            Escreval ("O triangulo é escaleno")
         senao
            Escreval ("O triangulo é Isosceles")
         fimse
      fimse
   senao
      Escreval ("Não é um triangulo")
   fimse

Fimalgoritmo