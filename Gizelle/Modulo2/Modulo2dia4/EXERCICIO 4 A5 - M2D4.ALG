Algoritmo "EXERCICIO 4 A5 - M3A1"
//Escreva um algoritmo que receba a idade de 3 nadadores e após receber a
//idade armazene a categoria de acordo com a tabela abaixo:
//            Idade - Categoria
//       5 a 7 anos - Infantil A
//      8 a 10 anos - Infantil B
//       11-13 anos - Juvenil A
//       14-17 anos - Juvenil B
//      Maior ou igual a 18 - Adulto
//
//Liste as informações obtidas conforme o exemplo:
//      Idade - Categoria

Var
idade : vetor [0..9] de inteiro
categoria : vetor [0..9] de caracter
i : inteiro
// o i vale para os dois vetores pq são do mesmo tamanho de 0..2

inicio

para i de 0 ate 9 passo 1 faca
   escreva ("Qual idade? ")
   leia (idade[i])
     escolha idade[i] <- categoria[i]
        caso 0 ate 4
             categoria[i] <- "Bebe - chame sua mãe"
        caso 5 ate 7
             categoria[i] <- "Infantil A"
//sempre qdo a variável for caracter deve a palavra deve estar entre "aspas"
        caso 8 ate 10
             categoria[i] <- "Infantil B"
        caso 11 ate 13
             categoria[i] <- "Juvenil A"
        caso 14 ate 17
             categoria[i] <- "Juvenil B"
        caso 18 ate 100
// não aceita caso até infinito, usamos 100 como idade limite
             categoria[i] <- "Adulto"
        caso 101 ate 150
             categoria[i] <- "Super-humano - favor apresentar autorização médica"
     fimescolha
fimpara

ESCREVAL (" ")
Escreval("Tabela de categorias:")
para i de 0 ate 9 passo 1 faca
   Escreval(idade [i], " ", categoria[i])
fimpara




Fimalgoritmo