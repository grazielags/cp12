"""

3) Faça um programa que leia uma matriz 3x3 de inteiros e multiplique os elementos da diagonal principal
(No qual os índices são iguais, linha e coluna possuem o mesmo valor) da matriz por um número k (obter do usuário).
Imprima a matriz na tela antes e depois da multiplicação.

"""


matriz = []

for linha in range(3):
    linhaMatriz = []
    for coluna in range(3):
        linhaMatriz.append(int(input("Digite um número: ")))
    matriz.append(linhaMatriz)
print(matriz)

numero = int(input("Digite o número que deseja multiplicar a diagonal principal: "))


for linha in range(3):
    for coluna in range(3):
            if linha == coluna:
                matriz[linha][coluna] = numero * matriz[linha][coluna]

print(matriz)


    
