matriz = []
for l in range(3):
    linha = []
    for c in range(3):
        linha.append(eval(input('Digite o valor de ['+ str(l) + ',' + str(c) + ']:')))
    matriz.append(linha)

#contar pares
pares = 0
impares = 0
for l in range(3):
    #Mesmo comando que o abaixo -> for c in matriz[l]:
    for c in range(3):
        if matriz[l][c] % 2 == 0:
            pares = pares + 1
        else:
            impares = impares + 1

#imprimir em formato de matriz
for l in range(3):
    print(matriz[l])

#imprimir qtde de números pares
print('A matriz contém', pares, 'números pares e', impares, 'números ímpares!')
