num1 = int(input("Informe o primeiro num: "))
num2 = int(input("Informe o segundo num: "))

for pares in range(num1,num2+1,1):
    if pares % 2 == 0:
        print(pares)
