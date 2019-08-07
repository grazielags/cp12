Algoritmo "EXERCICIO 6 - A7 - M2D6"
// Calcular a soma dos números ímpares de um intervalo informado pelo usuário.

var
i : inteiro
comeco, final: inteiro
somaImpar :inteiro

Procedimento somar()
Inicio
   somaImpar<-0
   para i de comeco ate final faca
      se (i mod 2 = 1) entao //se dividir por 2 e tem resto 1, então é ímpar (mod éigual a %)
         somaImpar <- somaImpar + i //vai adicionando os ímpares
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
      escreval("A soma dos ímpares entre " , comeco, " e ", final, " é ", somaImpar)
   senao
      escreval ("Opções com ordem inválida")
   fimse
Fimalgoritmo