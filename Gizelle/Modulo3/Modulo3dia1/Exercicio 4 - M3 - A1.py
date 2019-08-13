"""
Faça um programa, que obtenha do usuário o valor do produto e a quantidade deste produto que
está sendo comprado e ao fim apresente em tela o valor que deverá ser pago.
"""

valorProduto = int(input("Digite o valor do produto: "))
qtyProduto = int(input("Qual é a quantidade de compra? "))


Total = valorProduto*qtyProduto

print("O valor da compra é: ",Total)
