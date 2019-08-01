Algoritmo "EXERCICIO 6 - A7 - M2D6"
// Calcular a soma dos números ímpares de um intervalo informado pelo usuário.

 
var
i : inteiro
comeco, final: inteiro
somaImpar :inteiro

Procedimento somar
Inicio
   somaImpar<-0
   para i de comeco ate final faca
      se (i mod 2 = 1) ENTÃO //se dividir por 2 e tem resto 1, então é ímpar
         somaImpar <- somaImpar + i //vai adicionando os ímpares
      fimSe
   fimPara
   escreval("A soma dos ímpares entre " , comeco, " e ", final, " é ",somaImpar)
fimprocedimento

inicio
   escreva ("Digite o valor do inicio do intervalo: ")
   Leia (comeco)
   escreva ("Digite o valor do final do intervalo: ")
   Leia (final)
   somar

Fimalgoritmo