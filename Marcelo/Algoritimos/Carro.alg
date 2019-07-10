Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 05/07/2019
Var
// Seção de Declarações das variáveis 

 hora: real
 velocidademedia: real
  kml: inteiro

  funcao multiplicacao (hora,velocidademedia: real) : real
  var distancia : real
  inicio
        distancia <- (hora*velocidade)
        retorne distancia
        fimfuncao
Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
       Escreval (" Quantas horas de viagem ")
       leia (hora)
       Escreval(" Qual foi a velocidade media percorrida?")
       leia (velocidademedia)
        Escreval (" a sua distancia percorrida foi de " ,hora*velocidademedia)

        Escreval ("    ")
       Escreval(" Quantos km/l o seu veiculo faz ? ")
       leia(kml)
       
       Escreval ( distancia/kml)


       
       
Fimalgoritmo