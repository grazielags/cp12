Algoritmo "aula 4 xercicio 7"
//7. Faça um programa que obtenha a idade de 10 pessoas. Calcule e
//apresente a idade média das 10 pessoas, a maior idade e a menor
//idade.

Var
   i, idade, somaIdade, maiorIdade, menorIdade, mediaIdade:inteiro

Inicio
   para i de 1 ate 10 faca
      escreva("Digite a Idade: ")
      leia (idade)
      somaIdade<-somaIdade + idade
      se i = 0 entao
         maiorIdade <-idade
         menorIdade <-idade
      senao
         se idade > maiorIdade entao
            maiorIdade <- idade
         fimse
         se idade < maiorIdade entao
            menorIdade <- idade
         fimse
      fimse
   fimpara
   mediaIdade <- somaIdade div 10

   escreval("Maior Idade: ",maiorIdade)
   escreval("Menor idade: ",menorIdade)
   escreval("Media Idade: ", mediaIdade)


Fimalgoritmo