"""
Faça um programa que calcule a área de um triângulo, considerando a fórmula area <- (base * altura) div 2.
Utilize as variáveis area, base e altura (obter esses dados através do leia) e os operadores aritméticos de multiplicação e divisão.
Após realizado os cálculos apresentar na tela através do escreva.
"""

base = int(input("Dê o valor da base: "))
altura = int(input("Dê o valor da altura: "))

area = (base*altura)/2

print("A área deste triângulo é: ", area)

