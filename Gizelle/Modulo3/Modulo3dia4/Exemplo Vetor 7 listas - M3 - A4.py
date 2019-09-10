
"""
Inicialização de listas com zero - exemplo 2

Em diversas situações onde já sabemos de antemão qual será o
tamanho da lista, é útil inicializar a lista com o valor 0. Isso evita
que precisemos usar o append para adicionar valores

lista [0] - diz que eu inicio com valor zero [0]

"""


# inicializa vetor de notas com 0
notas = [0] * 3
soma = 0

# preenche vetor de notas, sem usar append
for i in range(3):
    notas[i] = eval(input("Digite a nota do aluno " + str(i) + ": "))
    soma = soma + notas[i]

print("A média da turma é: ", soma/3)


