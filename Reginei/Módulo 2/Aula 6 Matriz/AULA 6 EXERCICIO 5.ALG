Algoritmo "aula 6 exercicio 5"

//5. Crie um algoritmo que armazenará 5 notas de 10 alunos em uma
//matriz.

Var
   nota: vetor [0..9, 0..4] de inteiro
   l, c: inteiro

Inicio

   para l de 0 ate 9 passo 1 faca
      para c de 0 ate 4 passo 1 faca
         escreva("Digite a nota", l, " do aluno", c, " :")
         Leia(nota[l, c])
      fimpara
   fimpara


Fimalgoritmo