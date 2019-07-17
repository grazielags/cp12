Algoritmo "semnome"
// EEscreva um algoritmo que receba a idade de 3 nadadores e após
//receber a idade armazene a categoria de acordo com a tabela
//abaixo:
//Idade - Categoria
//5 a 7 anos - Infantil A
//8 a 10 anos - Infantil B
//11-13 anos - Juvenil A
//14-17 anos - Juvenil B
//Maior ou igual a 18 - Adulto
//Liste as informações obtidas conforme o exemplo:
//Idade - Categoria
Var
   idade : vetor [0..2] de inteiro
   i: inteiro
   categoria : vetor [0..2] de caracter
Inicio
   para i de 0 ate 2 passo 1 faca
      Escreva("Digite as idades : ")
      leia(idade[i])
      escolha idade[i]
         caso  5 ate 7
            categoria[i] <- "Infantil A"
         caso 8 ate 10
            categoria[i] <- "Infantil B"
         caso 11 ate 13
            categoria[i] <- "Juvenil A"
         caso 14 ate 17
              categoria[i] <- "Juvenil B "
          caso 18 ate 200
              categoria[i]<- "Adulto"
         fimescolha
      fimpara
      para i de 0 ate 2 passo 1 faca
         Escreval(idade[i], " - ", categoria[i])
      fimpara


Fimalgoritmo