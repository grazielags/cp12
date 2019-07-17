Algoritmo "sete"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 11/07/2019
Var
   idade, i, soma: inteiro
   maior, menor, media: inteiro



Inicio
   para i de 1 ate 10 passo 1 faca
      Escreva("Digite a sua idade: ")
      Leia(idade)
      soma <- soma + idade
      se i=1 entao
         maior <- idade
         menor <- idade
      senao
         se idade>maior entao
            maior <- idade
         fimse
         se idade<menor entao
            menor <- idade
         fimse
      fimse


   fimpara
   media <- (soma) div 10
   Escreval("Maior idade: ", maior)
   Escreval("Idade media: ", media)
   Escreval("Menor idade: ", menor)

Fimalgoritmo