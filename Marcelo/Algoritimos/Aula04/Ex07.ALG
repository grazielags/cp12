Algoritmo "semnome"
// Fa�a um programa que obtenha a idade de 10 pessoas. Calcule e
//apresente a idade m�dia das 10 pessoas, a maior idade e a menor
//idade.
Var
   soma,maior,menor,i,idade: inteiro
        media:real
        

Inicio
   para i de 0 ate 9 passo 1 faca
      Escreval("Escreva a sua idade :")
      leia (idade)
      soma<-soma+idade

      se i=0 entao
         maior<- idade
         menor<- idade
      senao
         se idade> maior entao
            maior<- idade
         fimse
         se idade< menor entao
            menor<- idade
         fimse
      fimse
   fimpara
   escreval("idade menor: ", menor)
   escreval ("idade maior: ", maior)
   media <- soma/10
   escreval ("A idade media �   ", media)
Fimalgoritmo