algoritmo "Vetor"
var
   notas : vetor [0..2] de inteiro
   i : inteiro
inicio
     para i de 0 ate 2 passo 1 faca
          Escreval("Digite a nota[", i, "]: ")
          leia(notas[i])
      fimpara
      limpatela
      Escreval("Listagem das notas: ")
      para i de 0 ate 2 passo 1 faca
           Escreval(notas[i])
      fimpara
fimalgoritmo