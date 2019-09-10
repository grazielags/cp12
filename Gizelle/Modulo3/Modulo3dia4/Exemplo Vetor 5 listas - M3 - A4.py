
"""
Programa que retorna uma lista com todos os números pares
entre 2 e um número n, inclusive, em ordem reversa:

no caso abaixo ele vai decrescendo pois está acrescentando antes no numero informado. o [i] + lista:
[2]
[4,2]
[6,4,2]

"""


n = eval(input('Digite um número: '))
lista = []
for i in range(2, n+1, 2):
    lista = [i] + lista
print(lista)

