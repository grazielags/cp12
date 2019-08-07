
'''
4) Faça um programa, que obtenha do usuário o valor do produto
   e a quantidade deste produto que está sendo comprado e
   ao fim apresente em tela o valor que deverá ser pago.
'''

produto = float(input('Digite o valor do Produto: R$'))
print('R$',produto)
quantidade = int(input('Digite a quantidade que deseja: '))
print(quantidade)

valor = produto * quantidade
print('O valor a ser pago é: R$',valor)

