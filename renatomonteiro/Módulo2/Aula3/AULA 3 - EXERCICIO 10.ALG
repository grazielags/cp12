Algoritmo "Aula 3 - exercicio 10"
//10) Dados tr�s valores A, B e C, verifique se eles podem ser os
//comprimentos dos lados de um tri�ngulo, se forem, verificar o ti
//po do tri�ngulo. Se os lados n�o formarem um tri�ngulo, escrever
//uma mensagem.
Var
    a, b, c: inteiro
 Inicio
   escreva ("digite o valor do lado a: ")
   leia(a)
   escreva ("digite o valor do lado b: ")
   leia(b)
   escreva ("digite o valor do lado c: ")
   leia(c)
   se (a < (b + c)) e (b < (a + c)) e (c < (a + b)) entao
      se (a = b) e (a = c) e (b = c) entao
         escreval ("o triangulo e equilatero!")
      senao
         se (a <> b) e (a <> c) e (b <> c) entao
            escreval ("o triangulo e escaleno")
         senao
            escreval ("o triangulo e isoseles")
            fimse
            fimse
         senao
            escreval ("nao e um triangulo!")
                     fimse

Fimalgoritmo