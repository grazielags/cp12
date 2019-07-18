Algoritmo "aula 5 xercicio 4"

//4. Escreva um algoritmo que receba a idade de 3 nadadores e após
//receber a idade armazene a categoria de acordo com a tabela
//abaixo:
//Idade - Categoria
//5 a 7 anos - Infantil A
//8 a 10 anos - Infantil B
//11-13 anos - Juvenil A
//14-17 anos - Juvenil B
//Maior ou igual a 18 - Adulto

var

   i:inteiro
   idade: vetor [0..2] de inteiro
   categoria: vetor [0..2] de caractere

inicio
   para i de 0 ate 2 passo 1 faca
      escreva("digite a idade: ")
      leia(idade[i])
      se (idade[i] >= 5) ou (idade[i]<= 7) entao
         categoria[i]<- "Infantil A"

      fimse
   fimpara
   para i de 0 ate 2 passo 1 faca
   escreval(idade[i], "-", categoria[i])
   fimpara
fimalgoritmo