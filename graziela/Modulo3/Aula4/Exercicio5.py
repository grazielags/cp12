'''
Faça um programa que leia um vetor vet de 20 posições.
O programa deve gerar, a partir do vetor lido, um outro vetor pos que
contenha apenas os valores positivos de vet.
'''
vet = []
pos = []

for i in range(20):
    vet.append(eval(input('Digite um número: ')))
    if vet[i] >= 0:
        pos.append(vet[i])

print('Lista completa: ', vet)
print('Lista de valores positivos: ', pos)
