vet = []
pos = []

for i in range(20):
    vet.append(eval(input('Digite um num: ')))
    if vet[i] >= 0:
        pos.append(vet[i])

print('Lista completa: ', vet)
print('Lista de positivos: ', pos)