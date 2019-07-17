Algoritmo "semnome"
// Foi feito uma pesquisa com 5 pessoas de uma cidade e coletados os
//seguintes dados:
//•sexo: M (masculino) e F (feminino)
//•cor dos olhos: A (azuis), V (verdes) e C (castanhos)
//•idade
//Deseja-se saber:
//a) a maior idade do grupo
//b) a quantidade de indivíduos do sexo feminino, cuja idade
//está entre 18 e 35 anos e que tenham olhos azuis.
Var
   sexo, olhos : caracter
   idade, i, soma, maior, menor: inteiro


Inicio
   para i de 0 ate 1 passo 1 faca
      Escreval ("Escreva qual o seu sexo")
      leia(sexo)
      Escreval ("Qual a cor dos olhos")
      leia (olhos)
      Escreval ("Escreva a sua idade : ")
      leia (idade)
      soma<- soma+idade
      se i = 0 entao
      maior<- idade
      menor<- idade
      senao
      se idade> maior entao
      idade<- maior
      fimse
      se idade < menor entao
      idade<- menor
      fimse
      fimse
      
   fimpara
   Escreval (" a idade maior é : ", idade)

Fimalgoritmo