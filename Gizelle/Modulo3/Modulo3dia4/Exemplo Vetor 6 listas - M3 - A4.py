
"""
Inicialização de listas com zero

Em diversas situações onde já sabemos de antemão qual será o
tamanho da lista, é útil inicializar a lista com o valor 0. Isso evita
que precisemos usar o append para adicionar valores

lista [0] - diz que eu inicio com valor zero [0]

"""


n = eval(input('Digite um número: '))
lista = [0]*n
print(lista)


