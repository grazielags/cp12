Algoritmo "semnome"
//    Entre com 1 valor n e calcule e apresente o valor da tabuada de 1
//até esse valor n, conforme o exemplo abaixo:
//1 x n = n
//2 x n = 2n
//3 x n = 3n

Var
   valor1, i:inteiro


Inicio
   Escreval ("Escreva o numero da tabuada que deseja: " )
   leia(valor1)
   para i de 1 ate 10 passo 1 faca
      Escreval(i , " X " ,valor1,"=",i*valor1)
   fimpara


Fimalgoritmo