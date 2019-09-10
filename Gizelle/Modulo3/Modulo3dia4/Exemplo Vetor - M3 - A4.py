"""
forma básica

nome1 = input('Informe o nome do aluno 1: ')
nome2 = input('Informe o nome do aluno 2: ')
nome3 = input('Informe o nome do aluno 3: ')
nota1 = eval(input('Informe a nota de ' + nome1 + ':'))
nota2 = eval(input('Informe a nota de ' + nome2 + ':'))
nota3 = eval(input('Informe a nota de ' + nome3 + ':'))

media = (nota1 + nota2 + nota3) / 3

print('A média da turma foi: ', media)

if nota1 > media:
    print('Parabéns', nome1)
if nota2 > media:
    print('Parabéns', nome2)
if nota3 > media:
    print('Parabéns', nome3)

"""

#forma Vetor

notas = []

quantidade = int(input("Digite aquantidade de notas: "))

for i in range(quantidade):
    notas.append(eval(input("Digite anota do aluno: ")))

notas.append(eval(input("Digite anota do aluno: ")))
#esta adição está fora do for in,masserá contabilizada no vetor/lista

print (notas)

for i in range (len(notas)):
        print(notas[i])


