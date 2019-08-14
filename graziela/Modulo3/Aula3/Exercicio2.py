'''
Imprimir a soma de todos os números pares entre dois números solicitados para o usuário.
'''
inicio = int(input('Digite o primeiro elemento: '))
fim = int(input('Digite o último elemento: '))
soma = 0
inicio = inicio + 1

''''while inicio < fim:
    if inicio % 2 == 0:
        soma = soma + inicio
    inicio = inicio + 1
'''
for i in range(inicio, fim - 1, 1):
    if i % 2 == 0:
        soma = soma + i
print(soma)
