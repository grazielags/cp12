telefonou = input("Telefonou para a vitima? (S/N): ")
local = input("Esteve no local do crime? (S/N): ")
mora = input("Mora proximo da vitima? (S/N): ")
devia = input("Devia para a vitima? (S/N): ")
trabalhou = input("Trabalhou com a vitima? (S/N): ")
medidor = 0

if telefonou == 'S':
    medidor += 1
if local == 'S':
    medidor += 1
if mora == 'S':
    medidor += 1
if devia == 'S':
    medidor += 1
if trabalhou == 'S':
    medidor += 1
print("Classifição: ", medidor)
if medidor == 2:
    print("Suspeito!")
elif medidor == 3 or medidor == 4:
    print("Cumplice!")
elif medidor == 5:
    print("ASSASSINO!")
else :
    print("Inocente!")