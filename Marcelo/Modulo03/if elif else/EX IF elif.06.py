'''6.	Faça um Programa que leia um número inteiro menor que 1000
e imprima a quantidade de centenas, dezenas e unidades do mesmo. 
Exemplos:
326 = 3 centenas, 2 dezenas e 6 unidades
12 = 1 dezena e 2 unidades   
'''

numero=int(input("Digite um número\n"))
cem=0
dez=0
uni=0
if numero // 100 > 0:        
    cem = numero // 100
    numero = numero % 100
    
if numero // 10 > 0:
    dez = numero // 10
    numero = numero % 10
    
if numero // 1 > 0:
    uni= numero // 1
    numero = numero % 1

print(cem, "centena\n", dez, "dezenas\n", uni,"unidades\n")
