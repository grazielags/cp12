"""
1) Faça um programa que leia duas matrizes A e B 2x2 de inteiros e
imprima a matriz C que é a soma das matrizes A e B.

"""

matrizA = []
matrizB = []
matrizC = []

print("Preenchimento da Matriz A: ")
for linha in range (2):
    linhaMatriz = []
    for coluna in range (2):
        linhaMatriz.append(int(input("Digite um número para Matriz A: ")))
    matrizA.append(linhaMatriz)

print("Preenchimento da Matriz B: ")
for linha in range (2):
    linhaMatriz = []
    for coluna in range (2):
        linhaMatriz.append(int(input("Digite um número para Matriz B: ")))
    matrizB.append(linhaMatriz)
 
            
for linha in range(2):
    linhaSoma = []
    for coluna in range(2):
        linhaSoma.append(int(matrizA[linha][coluna]) + int(matrizB[linha][coluna]))
    matrizC.append(linhaSoma)
    print("Linha", linha, " - ", linhaSoma)


    
    
