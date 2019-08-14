'''
Faça um programa que preencha por leitura um vetor de 5 posições,
e informe a primeira vez que o valor x (lido do teclado) se encontra no vetor.
Caso o valor x não seja encontrado, o programa deve imprimir o valor -1.
'''
vetor = []
posicao = -1

for i in range(5):
    vetor.append(eval(input('Digite um número: ')))

numero = int(input('Digite o número que deseja saber a primeira posição encontrada: '))

for i in range(len(vetor)):
    if numero == vetor[i]:
        posicao = i
        break

print(vetor)
print('A primeira posição do número: ', numero, 'é: ', posicao)
