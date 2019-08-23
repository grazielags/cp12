'''
Faça um programa que leia uma matriz 6x3 com números reais, calcule e mostre:
o maior elemento da matriz e sua respectiva posição (linha e coluna);
o menor elemento da matriz e sua respectiva posição. 
'''

matriz = []
maiorElemento = 0
maiorLinhaPosicao = 0
maiorColunaPosicao = 0
menorElemento = 0
menorLinhaPosicao = 0
menorColunaPosicao = 0

for linha in range(6):
    linhaMatriz = []
    for coluna in range(3):
        linhaMatriz.append(int(input('Digite um número: ')))

        if linha == 0 and coluna == 0:
            maiorElemento = linhaMatriz[coluna]
            menorElemento = linhaMatriz[coluna]
            maiorLinhaPosicao = linha
            maiorColunaPosicao = linha
            menorLinhaPosicao = coluna
            menorColunaPosicao = coluna
        else:
            if linhaMatriz[coluna] > maiorElemento:
                maiorElemento = linhaMatriz[coluna]
                maiorLinhaPosicao = linha
                maiorColunaPosicao = coluna
            if linhaMatriz[coluna] < menorElemento:
                menorElemento = linhaMatriz[coluna]
                menorLinhaPosicao = linha
                menorColunaPosicao = coluna
    matriz.append(linhaMatriz)

print('Matriz: ')
print(matriz)
print('Maior elemento: ', maiorElemento, ' - Linha: ', maiorLinhaPosicao, ' - Coluna: ', maiorColunaPosicao)
print('Menor elemento: ', menorElemento, ' - Linha: ', menorLinhaPosicao, ' - Coluna: ', menorColunaPosicao)