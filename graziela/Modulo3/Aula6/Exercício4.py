'''
Faça um programa com uma função chamada somaImposto.
A função possui dois parâmetros formais: taxaImposto
(que é a quantia de imposto sobre vendas expressa em porcentagem)
e custo (que é o custo de um item antes do imposto).
A função "altera" o valor de custo para incluir o imposto sobre vendas
e retorna o mesmo.
'''

def somaImposto(taxaImposto, custo):
    custo = custo + (custo * (taxaImposto / 100))
    return custo

taxaImposto = int(input('Digite a taxa do imposto: '))
custo = int(input('Digite o custo: '))

print('O custo total é: ', somaImposto(taxaImposto, custo))
