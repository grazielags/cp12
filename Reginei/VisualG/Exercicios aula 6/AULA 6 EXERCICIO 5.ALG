Algoritmo "aula 6 exercicio 5"

//5. Crie um algoritmo que armazenará 5 notas de 10 alunos em uma
//matriz.

Var
   nota: vetor [1..5, 1..10] de inteiro
   l, c: inteiro

Inicio

   para l de 1 ate 5 passo 1 faca
      para c de 1 ate 10 passo 1 faca
         escreva("Digite a nota", l, " do aluno", c, " :")
         Leia(nota[l, c])

      fimpara
   fimpara
Fimalgoritmo