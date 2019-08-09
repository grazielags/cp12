'''Faça um Programa que verifique se uma letra digitada é "F" ou "M".
Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido
Caso o usuário digite algo diferente de "F" ou "M".
'''
letra = input("Escreva F ou M\n")
if letra.lower() == "f":        
    print("Feminino")    
elif letra.lower() == "m":
    print("Masculino")
else:
    print("Invalido!")

