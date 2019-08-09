'''2) Faça um programa que peça uma nota, entre zero e dez. Mostre
uma mensagem caso o valor seja inválido e continue pedindo
até que o usuário informe um valor válido.
'''

nota1= int(input("Escreva uma nota "))

while nota1<0 or nota1>=11:
    nota1= int(input("Escreva uma nota "))
    

print("A sua nota é :",nota1)

  
