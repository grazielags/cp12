'''
4) Faça um programa, que obtenha do usuário o valor do produto e
a quantidade deste produto que está sendo comprado e ao fim
apresente em tela o valor que deverá ser pago.
'''

produto = float(input('Digite o Valor do Produdo: '))
print(produto)
quantidade = int(input('Digite a Quantidade que deseja Comprar: '))
print(quantidade)

valor = produto * quantidade
print(('O Valor a ser Pago é: '),valor)
