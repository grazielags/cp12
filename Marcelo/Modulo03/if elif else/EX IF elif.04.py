'''Faça um Programa que pergunte em que turno você estuda.
Peça para digitar M-matutino ou V-Vespertino ou N- Noturno.
Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!",
conforme o caso. 
'''

print("Escreva o turno que trabalha\n")
print("M/Matutino")
print("V/Vespertino")
print("N/Noturno")
turno = input("Escreva o turno:\n")

if turno.upper()=="M":        
    print("Matutino")    
elif turno.upper()=="V":
    print("Vespertino")
elif turno.upper()=="N":
    print("Noturno")
else:
    print("Turno invalido!")


