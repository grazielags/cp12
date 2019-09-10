"""

2) Faça um programa que leia as dimensões de duas matrizes A e B,
e depois leia as duas matrizes (somente deve aceitar números inteiros positivos).

"""

a = []
b = []
qtdLinhas = int(input("Digite a quantidade de linhas: "))
qtdColunas = int(input("Digite a quantidade de colunas: "))

for linha in range (qtdLinhas):
    linhaMatrizA = []
    linhaMatrizB = []
    for coluna in range (qtdColunas):
        numero = 0
        while numero <= 0:
        #o numero começavalendo zero por causa da escala
            numero = (int(input("Digite um número maior do que 0 para a matriz A: ")))
        linhaMatrizA.append(numero)
        numero = 0
        while numero <= 0:
            numero = (int(input("Digite um número maior do que 0 para a matriz B: ")))
        linhaMatrizB.append(numero)

    a.append(linhaMatrizA)
    b.append(linhaMatrizB)

print (a)
print (b)


    
