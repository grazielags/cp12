Algoritmo "EXERCICIO 4 - A7 - M2D6"
//   Crie um menu com as opções:
//     1 - Inserir
//     2 - Exibir
//     3 - Sair
//   Crie um procedimento para inserir e um para exibir conteúdo do vetor e
//   ao digitar a opção 3 deve parar de executar o algoritmo.

var
opcao, i: inteiro
numero:vetor [0..2] de inteiro

procedimento inserir()
Inicio
   para i de 0 ate 2 faca
        escreval(" ")
        escreva ("Digite um número: ")
        leia (numero[i])
        escreval(" ")
   fimpara
fimprocedimento

procedimento exibir()
Inicio
   para i de 0 ate 2 faca
        escreval(" ")
        escreval (numero[i])
        escreval(" ")
   fimpara
fimprocedimento

procedimento sair()

fimprocedimento

inicio
enquanto (opcao<>3) faca // para ter o looping de opções
escreval(" ")
   escreva("Digite 1 para inserir, 2 para exibir e 3 para sair: ")
   leia (opcao)
      escolha  opcao
          caso 1
               inserir()
          caso 2
               exibir()
          caso 3
               escreval(" ")
               escreva ("Algoritmo encerrado")
               escreval(" ")
          outrocaso
               escreval(" ")
               escreva ("Opção Inválida")
               escreval(" ")
      fimescolha
fimenquanto
     
     

Fimalgoritmo