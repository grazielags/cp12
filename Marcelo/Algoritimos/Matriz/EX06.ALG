Algoritmo "semnome"
// Escrever um algoritmo que crie uma matriz de 4 x 4 preencha os
//valores da matriz com informações do usuário e obtenha o número
//de uma linha do usuário para realizar a soma dos valores da linha
//informada.
Var
   v : vetor [0..3,0..3] de inteiro
   l,c: inteiro
   soma: inteiro

Inicio

   para l de 0 ate 3 faca
      para c de 0 ate 3 faca
         Escreval ("Escreva os valores")
         leia (v[l,c])
      fimpara
   fimpara
   para l de 0 ate 3 passo 1 faca
      Escreval ("Linha:", v[l])
      soma<- soma + v[l]
   fimpara
   Escreval (soma)
Fimalgoritmo