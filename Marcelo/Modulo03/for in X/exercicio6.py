'''6. Faça um programa que leia 5 números e informe a soma e a
média dos números.
'''


soma = 0
for x in range (1,6,1):
    numero= int(input("Escreva um numero: "))
    soma = soma + numero
media= soma//5    
print(soma)
print(media)


  
