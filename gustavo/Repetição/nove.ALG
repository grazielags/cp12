Algoritmo "nove"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 16/07/2019
Var
sexo, olhos: caracter
idade, i, maiorIdade, contadorInd: inteiro


Inicio
      para i de 0 ate 4 faca
           Escreva("Digite seu sexo (F/M): ")
           Leia(sexo)
           Escreva("Digite a cor dos olhos: ")
           Leia(olhos)
           Escreva("Digite sua idade: ")
           Leia(idade)
           
           se i= 0 entao
              maiorIdade <- idade
              senao
                   se idade > maiorIdade entao
                      maiorIdade <- idade
                   fimse
              fimse
           se ((sexo = "F" ) ou (sexo = "f")) e ((idade >= 18) e (idade <= 35)) e (olhos = "azul") entao
           contadorInd <- contadorInd + 1
           fimse
           
      fimpara
      Escreval("A maior idade do grupo �: ", maiorIdade)
      Escreval("Quantidade de pessoas do sexo Feminino cuja idade entre 18 e 35 e com olhos azuis: ", contadorInd)



Fimalgoritmo