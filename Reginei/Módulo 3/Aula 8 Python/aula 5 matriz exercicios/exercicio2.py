'''
2) Faça um programa que leia as dimensões de duas matrizes A e B, e depois
   leia as duas matrizes (somente deve aceitar números inteiros positivos).
'''

matriz = []

A = int(input('Digite a quantidade de linhas da matriz: '))
B = int(input('Digite a quantidade de colunas da matriz: '))

for linhas in range(A):
       linha = []
       for colunas in range(B): 
              linha.append(eval(input("Digite um Número[" + str(linhas) + "," + str(colunas) + "]: ")))
       matriz.append(linha)
print(matriz)

       



