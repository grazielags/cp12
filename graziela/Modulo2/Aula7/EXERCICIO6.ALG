algoritmo "Exercicio6"
//Calcular a soma dos n�meros �mpares de um
//intervalo informado pelo usu�rio.
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
   escreva("Digite um n�mero inicial: ")
   leia(comeco)
   escreva("Digite um n�mero final: ")
   leia(final)
   se comeco < final entao
      somar()
      escreva("A soma dos elementos do vetor �: ", soma)
   senao
      escreva("N�o tem como somar os valore de ", comeco, " at� ", final)
   fimse
fimalgoritmo
