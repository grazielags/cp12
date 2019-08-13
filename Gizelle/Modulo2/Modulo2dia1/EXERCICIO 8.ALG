Algoritmo "exercicio 8"
//Faça um algoritmo que calcule a área de um triângulo, considerando a fórmula
//area <- (base * altura) div 2. Utilize as variáveis area, base e altura
//(obter esses dados através do leia) e os operadores aritméticos
//de multiplicação e divisão. Após realizado os cálculos apresentar na tela
//através do escreva.

Var
A, B, H : real

Inicio
Escreva ("Base do triangulo:   ")
Leia (B)
Escreval(" ")
Escreva ("Altura do triângulo:  ")
Leia (H)
Escreval(" ")
A := ((B*H)/2)
// o div não funcinou dava resultado 2
Escreval(" ")
Escreva ("A área do riangulo é:  ", A)
Escreval(" ")


Fimalgoritmo