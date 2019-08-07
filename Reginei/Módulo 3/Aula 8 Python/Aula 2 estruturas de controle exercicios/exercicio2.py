'''
2.Faça um Programa que verifique se uma letra digitada é "F" ou "M".
Conforme a letra escrever: F - Feminino, M - Masculino,
Sexo Inválido - Caso o usuário digite algo diferente de "F" ou "M"
'''

sexo = input("digite (f) para Feminino ou (m) para masculino: ")

if sexo.lower() == "f":
       print(sexo, "é Feminino!")
elif sexo.lower() == "m":
       print(sexo, "é Masculino!")
else:
       print("Sexo Inválido")


'''
.lower() analisa mausculo e minusculo
'''
