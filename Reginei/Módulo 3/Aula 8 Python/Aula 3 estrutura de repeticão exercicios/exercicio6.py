'''
6. Faça um programa que leia 5 números e informe a soma e a
média dos números.
'''
soma = 0
media = 0

for i in range(0,5,1):
       numero = int(input("digite um numero: "))
               media = media + numero
              media = media / 5
print(media)


