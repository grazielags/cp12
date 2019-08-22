def maior(vetor):
    vetor.sort()
    print('Tamanho do vetor: ', len(vetor))
    print('Maior posição: ', len(vetor) - 1)
    return vetor[len(vetor)-1]

v = [1, 9, 8, 7, 6]
print('Vetor: ', v)
m = maior(v)
print('Maior valor: ', m)
print('Vetor ordenador: ', v)
