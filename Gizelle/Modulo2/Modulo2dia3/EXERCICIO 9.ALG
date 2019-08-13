Algoritmo "exercicio 9"
//Foi feito uma pesquisa com 5 pessoas de uma cidade e coletados os
//seguintes dados:
//          •sexo: M (masculino) e F (feminino)
//          •cor dos olhos: A (azuis), V (verdes) e C (castanhos)
//          •idade
// Deseja-se saber:
//           a) a maior idade do grupo
//           b) a quantidade de indivíduos do sexo feminino, cuja idade
//           está entre 18 e 35 anos e que tenham olhos azuis.

Var
sexo, corOlho : caracter
idade, i, maiorIdade, contadorIndividuos :inteiro

Inicio

para i de 0 ate 4 faca
     escreva ("Sexo F ou M: ")
     leia (sexo)
     escreva ("Cor de olhos A (azuis), V (verdes) e C (castanhos): ")
     leia (corOlho)
     escreva ("Idade: ")
     leia (idade)
     se i = 0 entao
        maiorIdade <- idade
     senao
        se idade > maiorIdade entao
           maiorIdade <- idade
        fimse
     fimse
fimpara

se (sexo = "f") ou (sexo = "F") e (idade >=18) e (idade <= 35) e (corOlho = "a") ou (corOlho = "A") entao
contadorIndividuos <- contadorIndividuos +1
// O PARÊNTESES DEVEA PARECER NAS EXPRESSÕESENTRE "E" E "OU"
fimse

Escreval (" ")
Escreval ("A maior idade é:", maiorIdade)
Escreval (" ")
Escreval ("Quantidade de indivíduos do sexo feminino, cuja idade está entre 18 e 35 anos e que tenham olhos azuis é: ", contadorIndividuos)

Fimalgoritmo