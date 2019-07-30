Algoritmo "Exercicio7"
//Crie uma matriz onde cada elemento terá o valor
//da soma dos seus índices:
//0 + 0 = 0
//0 + 1 = 1
//…
Var
  numeros : vetor [0..3, 0..3] de inteiro
  l, c : inteiro
Inicio
  para l de 0 ate 3 passo 1 faca
       para c de 0 ate 3 passo 1 faca
            numeros[l, c] <- l + c
       fimpara
  fimpara
  limpatela
  para l de 0 ate 3 passo 1 faca
     para c de 0 ate 3 passo 1 faca
        escreval("Número [", l, "][", c, "]: ", numeros[l, c])
     fimpara
  fimpara
Fimalgoritmo