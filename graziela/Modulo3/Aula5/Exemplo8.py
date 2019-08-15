m = []
#preenche a matriz
for l in range(10):
    linha = []
    linha.append(input('Digite o nome da pessoa ' + str(l) + ':'))
    linha.append(int(input('Digite a idade de ' + linha[0] + ':')))
    m.append(linha)
#procura a pessoa mais nova
menor = m[0][1]
pos = 0
for l in range(10):
    if m[l][1] < menor:
        menor = m[l][1]
        pos = l
#imprime a matriz
for l in range(10):
    print(m[l])
print('A pessoa mais nova é: ', m[pos][0], 'com idade: ', m[pos][1])
