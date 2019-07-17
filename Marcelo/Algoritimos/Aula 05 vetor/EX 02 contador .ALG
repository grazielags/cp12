Algoritmo "semnome"
// Escreva um algoritmo que armazene em um vetor de tamanho 5 o
//quadrado dos números ímpares de 1 a 10 (1, 3, 5, 7 e 9). Imprima
//todos os valores armazenados.
Var
   valor: vetor [0..4] de inteiro
   i,contador: inteiro


Inicio
contador<- 1
   para i de 0 ate 4 passo 1 faca
    valor[i]<- contador * contador
    contador <- contador + 2
   fimpara
   para i de 0 ate 4 passo 1 faca
      Escreval(valor[i])
   fimpara

Fimalgoritmo