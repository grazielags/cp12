"""
4 - Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato. 

"""


valor1 = int(input("Digite o valor do Produto 1: "))
valor2 = int(input("Digite o valor do Produto 2: "))
valor3 = int(input("Digite o valor do Produto 3: "))

if valor1 < valor2 and valor1 < valor3:
    print("Produto 1 tem o melhor valor de compra com ", valor1, "reais")
elif valor2 < valor1 and valor2 < valor3:
    print("Produto 2 tem o melhor valor de compra com ", valor2, "reais")
elif valor3 < valor2 and valor3 < valor1:
    print("Produto 3 tem o melhor valor de compra com ", valor3, "reais")


'''
barato = valor1
produto = "Produto 1"
if valor2 < barato:
    barato = valor2
    produto = "Produto 2"
elif valor3 < barato:
    barato = valor3
    produto = "Produto 3"
print("O melhor produto para se comprar é:", produto, com preço: ", barato)
'''
