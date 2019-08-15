l = int(input('Digite a quantidade de linhas da matriz: '))
c = int(input('Digite a quantidade de colunas da matriz: '))
matriz = []
for linhas in range(l):
    matriz.append([0]*c)

#imprimir em formato de matriz
for i in range(l):
    print(matriz[i])

print(matriz)
