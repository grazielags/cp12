Algoritmo "Exercicio4"
//Escreva um algoritmo que receba a idade de 3
//nadadores e após receber a idade armazene
//a categoria de acordo com a tabela abaixo:
//Idade 		-		Categoria
//5 a 7 anos 	-		Infantil A
//8 a 10 anos 	- 		Infantil B
//11-13 anos 	- 		Juvenil A
//14-17 anos 	- 		Juvenil B
//Maior ou igual a 18 - 	Adulto
//Liste as informações obtidas conforme o exemplo:
//Idade - Categoria
Var
   idades: vetor[0..2] de inteiro
   categorias: vetor[0..2] de caractere
   i: inteiro
Inicio
   para i de 0 ate 2 faca
      escreva("Digite uma idade: ")
      leia(idades[i])
      escolha idades[i]
         caso 5 ate 7
            categorias[i] <- "Infantil A"
         caso 8 ate 10
            categorias[i] <- "Infantil B"
         caso 11 ate 13
            categorias[i] <- "Juvenil A"
         caso 14 ate 17
            categorias[i] <- "Juvenil B"
         caso 18 ate 150
            categorias[i] <- "Adulto"
      fimescolha
      //se (idades[i] >= 5) e (idades[i] <= 7) entao
         //categorias[i] <- "Infantil A"
      //senao
         //se (idades[i] >= 8) e (idades[i] <= 10) entao
            //categorias[i] <- "Infantil B"
         //senao
            //se (idades[i] >= 11) e (idades[i] <= 13) entao
               //categorias[i] <- "Juvenil A"
            //senao
               //se (idades[i] >= 14) e (idades[i] <= 17) entao
                  //categorias[i] <- "Juvenil B"
               //senao
                  //se idades[i] >= 18 entao
                     //categorias[i] <- "Adulto"
                  //fimse
               //fimse
            //fimse
         //fimse
      //fimse
   fimpara
   para i de 0 ate 2 faca
      escreval(idades[i], " - ", categorias[i])
   fimpara
Fimalgoritmo