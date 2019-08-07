Algoritmo "um"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 18/07/2019
Var
vm: vetor [1..4, 1..4] de inteiro
linha, coluna, maior, menor: inteiro


Inicio
para linha de 1 ate 4 passo 1 faca
     para coluna de 1 ate 4 passo 1 faca
          Escreva("Informe o valor referente a Linha ", linha, " e Coluna ", coluna, ":")
          Leia(vm[linha, coluna])
          menor <- vm[linha, coluna]
          se  maior < vm[linha, coluna] entao
              maior <- vm[linha, coluna]
          fimse
          se menor >= vm[linha, coluna] entao
             menor <- vm[linha, coluna]
          fimse
     fimpara
fimpara

          Escreval("Maior: ", maior, " - Menor: ", menor)
Fimalgoritmo