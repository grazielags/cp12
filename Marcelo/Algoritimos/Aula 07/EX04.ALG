Algoritmo "semnome"
// Crie um menu com as opções:
//1 - Inserir
//2 - Exibir
//3 - Sair
//Crie um procedimento para inserir e um para exibir conteúdo do vetor
// e ao digitar a opção 3 deve parar de executar o algoritmo.
Var
   i,opcao: inteiro
   numero : vetor [0..3] de inteiro

procedimento inserir ()
inicio
   para i de 0 ate 3  faca
      Escreval("Escreva os  valores")
      leia(numero [i])
   fimpara
fimprocedimento

procedimento exibir ()
inicio
   para i de 0 ate 3  faca
      Escreval (numero[i])
   fimpara
fimprocedimento

Inicio
   enquanto opcao <> 3 faca
      Escreval ("OPÇÕES" )
      Escreval ("[1]Inserir ")
      Escreval ("[2]Exibir" )
      Escreval ("[3]Sair")
      leia(opcao)
      escolha opcao
      caso 1
         inserir ()
      caso 2
         exibir ()
      caso 3
         escreva("Saindo!!!")
      outrocaso
         escreva("Opção inválida!")
      fimescolha
   fimenquanto
Fimalgoritmo