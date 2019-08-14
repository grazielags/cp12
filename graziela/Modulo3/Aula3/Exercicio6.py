'''
Faça um programa que leia 5 números e informe a soma e a média dos números.
'''
#comentário
soma = 0
media = 0

for i in range(0, 5, 1):
    numero = int(input('Digite o número: '))
    soma = soma + numero

media = soma / 5
print('Média: ', media, "\nSoma: ", soma)
