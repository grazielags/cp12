notas = []

quantidade= int(input('Digite a quantidade de notas:'))

for i in range(quantidade):
    notas.append(eval(input('Digite a nota aluno: ')))

notas.append(eval(input('Digite a nota aluno: ')))

print(notas)

for i in range(len(notas)):
    print(notas[i])
