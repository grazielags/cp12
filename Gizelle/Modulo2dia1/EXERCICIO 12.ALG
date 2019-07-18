Algoritmo "exercicio 12"
//Calcule a quantidade de litros de combustível gasta em uma viagem,
//utilizando um automóvel que faz 12 k/l. Para obter o cálculo,
//o usuário deve fornecer (leia) o tempo gasto na viagem e a velocidade média
//durante ela. Desta forma, será possível obter a distância percorrida
//com a fórmula distancia <- tempo * velocidade. Tendo o valor da distância,
//basta calcular a quantidade de litros de combustível utilizada na viagem
//com a fórmula: litros <- distancia div 12. O programa deve apresentar
//(escreva) os valores da velocidade média, tempo gasto na viagem,
//a distância percorrida e a quantidade de litros utilizada na viagem.

Var
T, V, D, L : real

Inicio
Escreva ("Horas de viagem:   ")
Leia (T)
Escreval(" ")
Escreva ("Velocidade média da viagem em Km/h:  ")
Leia (V)
Escreval(" ")
D <- (T * V) div 12
Escreval(" ")
Escreva ("A distancia percorrida é de: ", D, "Km")
Escreval(" ")
L <- D div 12
Escreval(" ")
Escreva ("A quantidade de litros de combustível gasta foi de: ", L, " ", "litros")
Escreval(" ")

Fimalgoritmo