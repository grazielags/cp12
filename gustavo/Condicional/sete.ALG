Algoritmo "sete"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 11/07/2019
Var
ano: inteiro
valor: real
imposto: real


Inicio
Escreva("Informe o valor do veiculo:")
Leia(valor)
Escreva("Informe o ano do veiculo:")
Leia(ano)
se ano<1990 entao
   imposto <- (valor/100)*1
   Escreval("Imposto: ", imposto)
senao
   imposto <- (valor/100)*1.5
   Escreval("Imposto: ", imposto)
fimse


Fimalgoritmo