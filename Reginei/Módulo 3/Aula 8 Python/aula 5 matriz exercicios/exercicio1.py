'''
1) Faça um programa que leia duas matrizes A e B 2x2
   de inteiros e imprima a matriz C que é a soma das matrizes A e B.

'''

A = []
B = []
C = []
for linhas in range(2):
       linha = []
       for colunas in range(2):
              linha.append(eval(input("Digite um Número[" + str(linhas) + "," + str(colunas) + "]: ")))
       A.append(linha)
       
for linhas in range(2):
       linha = []
       for colunas in range(2):
              linha.append(eval(input("Digite um Número[" + str(linhas) + "," + str(colunas) + "]: ")))
       B.append(linha)
       
for linhas in range(2):
       linha = []
       for colunas in range(2):
              linha.append(A[linhas][colunas] + B[linhas][colunas])
       C.append(linha)
print(A)
print(B)
print(C)

