algoritmo "Exercicio4"
//Crie um menu com as op��es:
//1 - Inserir
//2 - Exibir
//3 - Sair
//Crie um procedimento para inserir
//e um para exibir conte�do do vetor
//e ao digitar a op��o 3 deve
//parar de executar o algoritmo.
var
   opcao, i: inteiro
   numeros: vetor [0..2] de inteiro
procedimento inserir(): inteiro
inicio
   para i de 0 ate 2 faca
      escreva("Digite um n�mero: ")
      leia(numeros[i])
   fimpara
fimprocedimento
procedimento exibir(): inteiro
inicio
   para i de 0 ate 2 faca
      escreval(numeros[i])
   fimpara
fimprocedimento
inicio
   escreval("1 - Inserir")
   escreval("2 - Exibir")
   escreval("3 - Sair")
   enquanto (opcao <> 3) faca
      escreva("Digite a op��o desejada: ")
      leia(opcao)
      escolha opcao
         caso 1
            inserir()
         caso 2
            exibir()
         caso 3
            escreva("Saindo!")
         outrocaso
            escreval("Op��o inv�lida!")
      fimescolha
   fimenquanto
fimalgoritmo
