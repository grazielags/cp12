Algoritmo "EXERCICIO 4 - A7 - M2D6"
//   Crie um menu com as opções:
//     1 - Inserir
//     2 - Exibir
//     3 - Sair
//   Crie um procedimento para inserir e um para exibir conteúdo do vetor e
//   ao digitar a opção 3 deve parar de executar o algoritmo.

var
opcao: inteiro
num1 : inteiro

procedimento inserir()
Inicio
   escreval (" ")
   escreval ("Inserir número: ")
   leia (num1)
fimprocedimento

procedimento exibir()
Inicio
   escreval (" ")
   escreval ("Inserir número: ")
   leia (num1)
fimprocedimento

procedimento sair()

fimprocedimento

inicio
escreva("Digite 1 para inserir, 2 para exibir e 3 para sair: ")
leia (opcao)
   escolha  opcao
       caso 1
            inserir()
       caso 2
            exibir()
       caso 3
            sair()
       outrocaso
            escreva ("Operação Inválida")
   fimescolha
     
     

Fimalgoritmo