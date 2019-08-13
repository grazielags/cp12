"""
8.Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são: 
    "Telefonou para a vítima?"
    "Esteve no local do crime?"
    "Mora perto da vítima?"
    "Devia para a vítima?"
    "Já trabalhou com a vítima?"

O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
    Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita".
    Entre 3 e 4 como "Cúmplice".
    5 como "Assassino".
    Caso contrário, ele será classificado como "Inocente".   

"""


count = 0

resposta = input("Telefonou para a vítima? Resposta: ")
if resposta.upper() == "sim" or resposta.upper() == "S":
    count = count + 1 #count += 1

resposta = input("Esteve no local do crime? Resposta: ")
if resposta.upper() == "sim" or resposta.upper() == "S":
    count = count + 1 #count += 1

resposta = input("Mora perto da vítima? Resposta: ")
if resposta.upper() == "sim" or resposta.upper() == "S":
    count = count + 1 #count += 1

resposta = input("Devia para a vítima? Resposta: ")
if resposta.upper() == "sim" or resposta.upper() == "S":
    count = count + 1 #count += 1

resposta = input("Já trabalhou com a vítima? Resposta: ")
if resposta.upper() == "sim" or resposta.upper() == "S":
    count = count + 1 #count += 1

if count == 2:
    print ("Suspeita")
elif count >= 3 or count <= 4:
    print ("Cúmplice")
elif count == 5:
    print ("Assassino")
    
