'''
Faça um programa que leia dois vetores de 3 posições, que representam forças sobre um ponto no espaço 3D,
e escreva a força resultante
Dica: força resultante é obtida pela soma dos valores das coordenadas correspondentes nos dois vetores:
(x1 + x2), (y1 + y2), (z1 + z2)
'''
vetorA = []
vetorB = []

for i in range(3):
    vetorA.append(eval(input('Digite um número para o vetorA[' + str(i) + ']: ')))
    vetorB.append(eval(input('Digite um número para o vetorB[' + str(i) + ']: ')))

for i in range(3):
    print(vetorA[i], ' + ', vetorB[i], ' = ', vetorA[i] + vetorB[i])
