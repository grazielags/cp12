Algoritmo "exercicio 12"
//Calcule a quantidade de litros de combust�vel gasta em uma viagem,
//utilizando um autom�vel que faz 12 k/l. Para obter o c�lculo,
//o usu�rio deve fornecer (leia) o tempo gasto na viagem e a velocidade m�dia
//durante ela. Desta forma, ser� poss�vel obter a dist�ncia percorrida
//com a f�rmula distancia <- tempo * velocidade. Tendo o valor da dist�ncia,
//basta calcular a quantidade de litros de combust�vel utilizada na viagem
//com a f�rmula: litros <- distancia div 12. O programa deve apresentar
//(escreva) os valores da velocidade m�dia, tempo gasto na viagem,
//a dist�ncia percorrida e a quantidade de litros utilizada na viagem.

Var
T, V, D, L : real

Inicio
Escreva ("Horas de viagem:   ")
Leia (T)
Escreval(" ")
Escreva ("Velocidade m�dia da viagem em Km/h:  ")
Leia (V)
Escreval(" ")
D <- (T * V) div 12
Escreval(" ")
Escreva ("A distancia percorrida � de: ", D, "Km")
Escreval(" ")
L <- D div 12
Escreval(" ")
Escreva ("A quantidade de litros de combust�vel gasta foi de: ", L, " ", "litros")
Escreval(" ")

Fimalgoritmo