produto1 = float(input("Digite o valor do primeiro produto: "))
produto2 = float(input("Digite o valor do segundo produto: "))
produto3 = float(input("Digite o valor do terceiro produto: "))
if produto1 < produto2 and produto1 < produto3 :
    print("Compre o primeiro produto!")
elif produto2 < produto1 and produto2 < produto3 :
    print("Compre o segundo produto!")
else :
    print("Compre o terceiro produto!")
