Algoritmo "EXERCICIO 6 - A7 - M2D6"
// Calcular a soma dos n�meros �mpares de um intervalo informado pelo usu�rio.

var
i : inteiro
comeco, final: inteiro
somaImpar :inteiro

Procedimento somar()
Inicio
   somaImpar<-0
   para i de comeco ate final faca
      se (i mod 2 = 1) entao //se dividir por 2 e tem resto 1, ent�o � �mpar (mod �igual a %)
         somaImpar <- somaImpar + i //vai adicionando os �mpares
      fimse
   fimpara
fimprocedimento

inicio
   escreva ("Digite o valor do inicio do intervalo: ")
   Leia (comeco)
   escreva ("Digite o valor do final do intervalo: ")
   Leia (final)
   se comeco < final entao
      somar()
      escreval("A soma dos �mpares entre " , comeco, " e ", final, " � ", somaImpar)
   senao
      escreval ("Op��es com ordem inv�lida")
   fimse
Fimalgoritmo