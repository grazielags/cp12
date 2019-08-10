"""
2 - Faça um Programa que verifique se uma letra digitada é "F" ou "M".
Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido
Caso o usuário digite algo diferente de "F" ou "M".

"""

genero = input("Digite F para feminino e M para masculino: ")

if genero == "F" or genero == "f":
    print ("Genero Feminino")
elif genero == "M" or genero == "m":
    print ("Genero Masculino")
else:
    print ("Genero não cadastrado")


"""
if genero.lower() == "f"
if genero.upper() == "F"
"""
