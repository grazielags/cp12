Algoritmo "condicional exercicio 10"
//10) Dados tr�s valores A, B e C, verifique se eles podem ser os comprimentos dos lados de um tri�ngulo, se forem, verificar o tipo do tri�ngulo. Se os lados n�o formarem um tri�ngulo, escrever uma mensagem.

//O comprimento de cada lado em um tri�ngulo � menor que a soma dos outros dois lados;
//Equil�teros: tem os comprimentos dos tr�s lados iguais;
//Is�sceles: tem os comprimentos de dois lados iguais;
//Escaleno: tem os comprimentos dos tr�s lados diferentes


Var
   a, b, c:inteiro

Inicio
   escreva("Digite o valor do lado a: ")
   leia(a)
   escreva("Digite o valor do lado b: ")
   leia(b)
   escreva("Digite o valor do lado c: ")
   leia(c)
   se (a < (b+c))  e (b < (a + c)) e (c < (a + b)) entao
      se (a = b) e (a = c) e (b = c) entao
         escreval(" O Triangulo � Equilatero!")
      senao
         se (a <> b) e (a <> c) e (b <> c) entao
            escreval ("O Triangulo � Escaleno!")
         senao
            escreval(" O triangulo � Isosceles!")
         fimse
      fimse
   senao
      escreval("N�o � um Triangulo")
   fimse

Fimalgoritmo