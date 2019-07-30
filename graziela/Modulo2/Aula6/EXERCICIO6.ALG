Algoritmo "Exercicio6"
//Escrever um algoritmo que crie uma matriz de 4 x 4
//preencha os valores da matriz com informações do
//usuário e obtenha o número de uma linha do usuário
//para realizar a soma dos valores da linha informada.
Var
  numeros : vetor [0..3, 0..3] de inteiro
  l, c, linha, soma : inteiro
Inicio
  para l de 0 ate 3 passo 1 faca
       para c de 0 ate 3 passo 1 faca
            Escreval("Digite uma número [", l, "][", c, "]")
            leia(numeros[l, c])
       fimpara
  fimpara
  limpatela
  Escreva("Digite a linha (0 até 3) que deseja apresentar a soma dos números.")
  Leia(linha)
  para c de 0 ate 3 passo 1 faca
     soma <- soma + numeros[linha, c]
  fimpara
  Escreval("Soma dos valores da linha: ", linha, " é: ", soma)
Fimalgoritmo