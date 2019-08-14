'''
1. Imprimir a quantidade de números pares entre dois números
solicitados para o usuário.
'''

numero1 = int(input("Digite o primeiro Número: "))
numero2 = int(input("Digite o segundo Número: "))

quantidadepares = 0
numero1 = numero1 + 1
while numero1 < numero2:
       if numero1 % 2 == 0:
             quantidadepares += 1
       numero1 += 1
print(quantidadepares)
