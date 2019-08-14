'''
Faça um programa que preencha por leitura um vetor de 10 posições e
obtenha por leitura um número para verificar quantas vezes esse número existe no vetor.
'''
vetor = []
contador = 0

for i in range(10):
    vetor.append(eval(input('Digite um número: ')))

numero = int(input('Digite um número que deseja verificar quantas vezes existe no vetor: '))

for i in range(len(vetor)):
    if vetor[i] == numero:
        contador = contador + 1

print('Lista completa: ', vetor)
print('O número ', numero, ' aparece ', contador, ' vezes no vetor!')
