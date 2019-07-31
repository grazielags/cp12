Algoritmo "Exercicio4"
//Escrever um algoritmo que preencha os valores
//de uma matriz 5x5. Após a matriz estar preenchida
//realizar a soma de todos os elementos da matriz
//e apresentar o resultado na tela.
Var
  valores : vetor [0..4, 0..4] de inteiro
  l, c, soma : inteiro
Inicio
  para l de 0 ate 4 passo 1 faca
       para c de 0 ate 4 passo 1 faca
            Escreval("Digite um valor [", l, "][", c, "]")
            leia(valores[l, c])
            soma <- soma + valores[l, c]
       fimpara
  fimpara
  Escreval("Soma dos valores é: ", soma)
Fimalgoritmo