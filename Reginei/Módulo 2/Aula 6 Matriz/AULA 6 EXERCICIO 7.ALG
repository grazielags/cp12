Algoritmo "aula 6 exercicio 7"

//7. Crie uma matriz onde cada elemento terá o valor da soma dos seus
//índices:
//0 + 0 = 0
//0 + 1 = 1
//...

Var
   valor: vetor [0..3,0..3] de inteiro
   l, c : inteiro

Inicio

   para l de 0 ate 3 passo 1 faca
      para c de 0 ate 3 passo 1 faca
         valor[l, c] <- l + c
      fimpara
   fimpara
   para l de 0 ate 3 passo 1 faca
      para c de 0 ate 3 passo 1 faca
         escreval("A soma de [", l, "] + [", c, "]", valor[l,c])
      fimpara
   fimpara

fimalgoritmo