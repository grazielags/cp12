Algoritmo "EXERCICIO 7"
//Faça um programa que obtenha a idade de 10 pessoas. Calcule e apresente a
//idade média das 10 pessoas, a maior idade e a menor idade.

Var
count, idade, soma, media, maiorIdade, i : inteiro

Inicio

count <- 1
repita
Escreva (count, " Digite uma idade: ")
leia (idade)

soma <- idade + soma
count <- count + 1
ate count > 3

media <- soma div (count -1)

      se i = 0 entao
              maiorIdade <- idade
           senao
              se idade > maiorIdade entao
                 maiorIdade <- idade
              fimse
           fimse

escreval(" ")
escreval ("Media das idades é de: ", media)
escreval ("Maior idade é: ", maiorIdade)

Fimalgoritmo