Algoritmo "nove"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 11/07/2019
Var
nome: caracter
horas: inteiro
nivel: caracter


Inicio
Escreva("Informe seu nome: ")
Leia(nome)
Escreva("Informe seu n�vel (junior/pleno/senior): ")
Leia(nivel)
Escreva("Informe a quantidade de horas trabalhadas: ")
Leia(horas)
se nivel="junior" entao
   Escreval("Funcionario: ", nome)
   Escreval("N�vel: ", nivel)
   Escreval("Pago: R$", 12*horas)
fimse
se nivel="pleno" entao
   Escreval("Funcionario: ", nome)
   Escreval("N�vel: ", nivel)
   Escreval("Pago: R$", 25*horas)
fimsese nivel="senior" entao
   Escreval("Funcionario: ", nome)
   Escreval("N�vel: ", nivel)
   Escreval("Pago: R$", 50*horas)
fimse


Fimalgoritmo