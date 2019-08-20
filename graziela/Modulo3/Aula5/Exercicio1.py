a = []
b = []
c = []

print('Preenchimento da matriz A: ')
for linha in range(2):
    linhaMatriz = []
    for coluna in range(2):
        linhaMatriz.append(int(input('Digite um número: ')))
    a.append(linhaMatriz)

print('Preenchimento da matriz B: ')
for linha in range(2):
    linhaMatriz = []
    for coluna in range(2):
        linhaMatriz.append(int(input('Digite um número: ')))
    b.append(linhaMatriz)

for linha in range(2):
    linhaSoma = []
    for coluna in range(2):
        linhaSoma.append(int(a[linha][coluna]) + int(b[linha][coluna]))
    c.append(linhaSoma)
    print('Linha: ', linha, ' - ', linhaSoma)
