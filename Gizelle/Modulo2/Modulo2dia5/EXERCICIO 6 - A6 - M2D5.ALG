Algoritmo "EXERCICIO 6 - A6 - M2D5"
// Escrever um algoritmo que crie uma matriz de 4 x 4 preencha os valores
// da matriz com informa��es do usu�rio e obtenha o n�mero de uma linha do
// usu�rio para realizar a soma dos valores da linha informada.


Var
numeros : vetor [0..3, 0..3] de inteiro
l, c, linha, soma : inteiro

Inicio
para l de 0 ate 3 passo 1 faca
     para c de 0 ate 3 passo 1 faca
          escreva ("Digite um n�mero [", l, "][", c, "]")
          leia (numeros[l, c])
     fimpara
fimpara

limpatela

escreva ("Digita a linha (0 a 3)que deseja apresentar a soma dos numeros: ")
leia (linha)
// como a linha j� existe, preciso variar somente nas colunas
para c de 0 ate 3 passo 1 faca
     soma <- soma + numeros[linha, c]
fimpara

escreval ("Soma dos valores de linha:", linha, " �: ", soma)

Fimalgoritmo