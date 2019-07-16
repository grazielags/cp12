Algoritmo "Exercicio9"
//Foi feito uma pesquisa com 5 pessoas de uma cidade
//e coletados os seguintes dados:
//sexo: M (masculino) e F (feminino)
//cor dos olhos: A (azuis), V (verdes) e C (castanhos)
//idade
//Deseja-se saber:
//a maior idade do grupo
//a quantidade de indivíduos do sexo feminino,
//cuja idade está entre 18 e 35 anos e que tenham
//olhos azuis.

Var
   sexo, corOlhos: caractere
   idade, i, maiorIdade, contadorIndividuos: inteiro
Inicio
   para i de 0 ate 4 faca
      Escreva("Digite o sexo da pessoa (F/M): ")
      Leia(sexo)
      Escreva("Digite a cor dos olhos da pessoa (A (Azul)/C (Castanho)/V (Verde)): ")
      Leia(corOlhos)
      Escreva("Digite a idade da pessoa: ")
      Leia(idade)
      se i = 0 entao
         maiorIdade <- idade
      senao
         se idade > maiorIdade entao
            maiorIdade <- idade
         fimse
      fimse
      
      se sexo = "F" e idade >= 18 e idade <= 35 e corOlhos = "a" entao
         contadorIndividuos <- contadorIndividuos + 1
      fimse
   fimpara
   Escreval("A maior idade do grupo é: ", maiorIdade)
   Escreval("A quantidade de pessoas do sexo feminino com idade entre 18 e 35 anos e cor dos olhos azul é: ", contadorIndividuos)
Fimalgoritmo