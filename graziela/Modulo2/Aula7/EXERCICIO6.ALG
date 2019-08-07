algoritmo "Exercicio6"
//Calcular a soma dos números ímpares de um
//intervalo informado pelo usuário.
var
   i, soma, comeco, final: inteiro
procedimento somar()
inicio
   para i de comeco ate final faca
      se i % 2 = 1 entao
         soma <- soma + i
      fimse
   fimpara
fimprocedimento
inicio
   escreva("Digite um número inicial: ")
   leia(comeco)
   escreva("Digite um número final: ")
   leia(final)
   se comeco < final entao
      somar()
      escreva("A soma dos elementos do vetor é: ", soma)
   senao
      escreva("Não tem como somar os valore de ", comeco, " até ", final)
   fimse
fimalgoritmo
