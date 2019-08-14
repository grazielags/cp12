'''
5) Faça um programa que leia 5 números e informe o maior número.
'''
numero = 0

for i in range(0,5,1): 
    numero = int(input("Digite o número: "))
    if i == 0:
        maior = numero
    elif numero > maior:
         maior = numero

print ("O Maior número digitado é: ",numero ) 

