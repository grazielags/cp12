'''
8. Faça um programa que faça 5 perguntas para uma pessoa sobre um crime.
   As perguntas são: 

"Telefonou para a vítima?"
"Esteve no local do crime?"
"Mora perto da vítima?"
"Devia para a vítima?"
"Já trabalhou com a vítima?"

O programa deve no final emitir uma classificação sobre a participação
da pessoa no crime.

Se a pessoa responder positivamente a 2 questões ela deve ser classificada
como "Suspeita".

Entre 3 e 4 como "Cúmplice".

5 como "Assassino".
Caso contrário, ele será classificado como "Inocente".
'''


pergunta1 = int(input("Telefonou para a vítima 1-sim ou 2- não ?"))
pergunta2 = int(input("Esteve no local do crime 1-sim ou 2- não ?"))
pergunta3 = int(input("Mora perto da vítima 1-sim ou 2- não ?"))
pergunta4 = int(input("Devia para a vítima 1-sim ou 2- não ?"))
pergunta5 = int(input("Já trabalhou com a vítima 1-sim ou 2- não ?"))

soma = 0

if pergunta1 == 1:
       soma = soma +1
if pergunta2 == 1:
       soma = soma +1
if pergunta3 == 1:
       soma = soma +1
if pergunta4 == 1:
       soma = soma +1
if pergunta5 == 1:
       soma = soma +1

if soma == 2 or soma == 1:
       print("Você é suspeito!")
elif soma == 3 or soma == 4:
       print("Você é Cúmplice!")
elif soma == 5:
       print("Você é A1ssassino!")
elif soma != 1 or soma != 2 or soma != 3 or soma != 4 or soma != 5:
       print("Você é Inocente!")


'''

if soma = pergunta1 + pergunta2 + pergunta3 + pergunta4 + pergunta5:

if soma == 2 or soma == 1:
       print("Você é suspeito!")
elif soma == 3 or soma == 4:
       print("Você é Cúmplice!")
elif soma == 5:
       print("Você é A1ssassino!")
elif soma != 1 or soma != 2 or soma != 3 or soma != 4 or soma != 5:
       print("Você é Inocente!")
'''




              







