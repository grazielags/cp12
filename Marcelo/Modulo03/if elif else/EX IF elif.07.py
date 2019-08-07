'''8.	Faça um programa que faça 5 perguntas para uma pessoa sobre um crime.
As perguntas são: 
"Telefonou para a vítima?"
"Esteve no local do crime?"
"Mora perto da vítima?"
"Devia para a vítima?"
"Já trabalhou com a vítima?"

O programa deve no final emitir uma classificação sobre a participação da pessoa
no crime.

Se a pessoa responder positivamente a 2 questões ela deve ser classificada
como "Suspeita".
Entre 3 e 4 como "Cúmplice".
5 como "Assassino".
Caso contrário, ele será classificado como "Inocente".   
'''

telefone = input("Telefonou para vitima??\n")
local = input("Esteve no local do crime\n")
mora = input("Mora perto da vítima?\n")
devia = input("Devia para a vítima?\n")
trabalhou = input("Já trabalhou com a vítima?\n")
contador = 0

if telefone.lower()=="s":        
    contador+=1
    
if local == "s":
    contador+=1
    
if mora == "s":
    contador+=1

if devia == "s":
    contador+=1

if trabalhou == "s":
    contador+=1


if contador == 2:
    print("Suspeita")
    
elif contador == 3 or contador == 4:
    print ("Cumplice")

elif contador == 5:
    print("Assassino")

elif contador == 0:
    print("Inocente")

print(contador)

