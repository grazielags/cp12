
"""
Programa que retorna uma lista com todos os números pares
entre 2 e um número n, inclusive.

O rangevai depender do valor digitado e as quantidade de posições do vetor vão depender da ordem de 2 em 2 que está sinalizado pelo ultimonúmero da renge, no caso 2
"""

n = eval(input('Digite um número: '))
lista = []
for i in range(2, n+1, 2):
    lista = lista + [i]
print(lista)


