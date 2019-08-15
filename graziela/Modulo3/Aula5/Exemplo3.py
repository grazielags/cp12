l = int(input('Digite a quantidade de linhas da matriz: '))
c = int(input('Digite a quantidade de colunas da matriz: '))
matriz = []
for linhas in range(l):
    linha = []
    for colunas in range(c):
        linha.append(eval(input('Digite um número: ')))
    matriz.append(linha)
print(matriz)
