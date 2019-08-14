'''
2. Imprimir a soma de todos os números pares entre dois números
solicitados para o usuário.

'''

num1 = int(input("Digite um Número: "))
num2 = int(input("Digite outro Número: "))
soma = 0
num1 = num1 + 1

'''while num1 < num2:
       if num1 % 2 == 0:
              soma = soma + num1
       num1 = num1 + 1       
print(soma)
'''

for i in range(num1, num2 - 1, 1):
       if i % 2 == 0:
              soma = soma + i
print(soma)
