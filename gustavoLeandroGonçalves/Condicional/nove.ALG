Algoritmo "nove"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 11/07/2019
Var
nome: caracter
horas: inteiro
nivel: caracter


Inicio
Escreva("Informe seu nome: ")
Leia(nome)
Escreva("Informe seu nível (junior/pleno/senior): ")
Leia(nivel)
Escreva("Informe a quantidade de horas trabalhadas: ")
Leia(horas)
se nivel="junior" entao
   Escreval("Funcionario: ", nome)
   Escreval("Nível: ", nivel)
   Escreval("Pago: R$", 12*horas)
fimse
se nivel="pleno" entao
   Escreval("Funcionario: ", nome)
   Escreval("Nível: ", nivel)
   Escreval("Pago: R$", 25*horas)
fimsese nivel="senior" entao
   Escreval("Funcionario: ", nome)
   Escreval("Nível: ", nivel)
   Escreval("Pago: R$", 50*horas)
fimse


Fimalgoritmo