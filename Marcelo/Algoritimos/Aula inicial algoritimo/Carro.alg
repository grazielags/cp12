Algoritmo "semnome"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 05/07/2019
Var
 hora: real
 velocidademedia: real
  kml: real
  distancia : real
  inicio
      Escreval (" Quantas horas de viagem ")
       leia (hora)
       Escreval(" Qual foi a velocidade media percorrida?")
       leia (velocidademedia)
       Escreval(" Quantos km/l o seu veiculo faz ? ")
       leia(kml)
       distancia <- hora*velocidademedia
        Escreval (" A sua distancia percorrida foi de ", distancia)
        Escreval ("    ")
       
       Escreval ("E o consumo real dele foi de :" ,distancia/kml)


       
       
Fimalgoritmo