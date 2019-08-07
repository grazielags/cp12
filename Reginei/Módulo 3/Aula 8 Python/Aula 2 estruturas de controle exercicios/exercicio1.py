'''
1) Faça um programa que leia um número inteiros
   e informe se esse número é par ou ímpar.
'''

numero = int(input("digite um numero: "))
resto = numero % 2

if resto == 0:
       print("O Número",numero,"é Par!")
else:
       print("O número",numero,"é Impar")
