'''
Faça um programa que leia uma matriz 3x3 de inteiros e retorne a
linha de maior soma. Imprima na tela a matriz, a linha de maior soma e a soma.
'''

matriz = []
maiorSoma = 0
linhaSoma = 0

for linha in range(3):
    linhaMatriz = []
    soma = 0
    for coluna in range(3):
        linhaMatriz.append(int(input('Digite um número: ')))
        soma = soma + linhaMatriz[coluna]
    matriz.append(linhaMatriz)
    if soma > maiorSoma:
        maiorSoma = soma
        linhaSoma = linha

print('Matriz: ')
print(matriz)
print('Maior soma: ', maiorSoma)
print('Linha da maior soma: ', linhaSoma)
