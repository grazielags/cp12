'''
6. Faça um Programa que leia um número inteiro menor que 1000
   e imprima a quantidade de centenas, dezenas e unidades do mesmo. 

Exemplos:
326 = 3 centenas, 2 dezenas e 6 unidades
12 = 1 dezena e 2 unidades  
'''

numero = int(input("Digite um numero até 1000 para ser fracionado: "))
print("O Número",numero,"fracionado é:")

u = numero // 1
d = numero // 10
c = numero // 100
m = numero // 1000

print("unidades: ",u)
print("dezenas: ",d)
print("centenas: ",c)
print("milhares: ",m)



