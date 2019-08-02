Algoritmo "doze"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 09/07/2019
Var
tg: real
vm: real
distancia: real
litros: real

Inicio
Escreva("Informe o tempo gasto da viagem(Horas):")
Leia(tg)
Escreva("Informe a velocidade media durante a viagem(Km/h):")
Leia(vm)
distancia<- (tg*vm)
Escreval("Tempo gasto:", tg, " Horas")
Escreval("Velocidade media:", vm, " Km")
Escreval("Distancia percorrida:", distancia, " Km")
litros<- (distancia div 12)
Escreval("Qtd de litros utilizada:", litros)




Fimalgoritmo