'''
    Faça uma função que receba um número por parâmetro.
A função deverá retornar 'P', se seu número for positivo, e 'N',
se o número for zero ou negativo.
'''

def verificaPositivo(numero):
    if numero > 0:
        return 'P'
    else:
        return 'N'

numero = int(input('Digite um número: '))

print(verificaPositivo(numero))
