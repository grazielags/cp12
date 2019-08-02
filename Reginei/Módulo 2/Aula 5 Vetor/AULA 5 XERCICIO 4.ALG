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
      se (idade[i] >= 5) e (idade[i]<= 7) entao
         categoria[i]<- ("Infantil A")
      senao
         se (idade[i] >= 8) e (idade[i]<= 10) entao
            categoria[i]<- ("Infantil B")
         senao
            se (idade[i] >= 11) e (idade[i]<= 13) entao
               categoria[i]<- ("Juvenil A")
            senao
               se (idade[i] >= 14) e (idade[i]<= 17) entao
                  categoria[i]<- ("Juvenil B")
               senao
                  se (idade[i] >= 18) entao
                     categoria[i]<- ("Adulto")
                  fimse
               fimse
            fimse
         fimse
      fimse
   fimpara
   para i de 0 ate 2 passo 1 faca
      escreval(idade[i], " anos - Categoria: ", categoria[i])
   fimpara
fimalgoritmo