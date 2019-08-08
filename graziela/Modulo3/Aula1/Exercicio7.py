'''
Faça um programa que leia dois valores para as variáveis A e B e
efetue a troca dos valores de forma que a variável A passe a possuir o valor
da variável B e a variável B passe a possuir o valor da variável A.
Apresentar (escreva) os valores trocados.
(Note que para haver a troca antes de serem trocados os valores, um deles deverá
ser armazenado em outro local para não perder seu valor.)
'''

a = int(input("Digite o valor de A: "))
b = int(input("Digite o valor de B: "))

c = a
a = b
b = c

print("a = ", a, "\nb = ", b)
