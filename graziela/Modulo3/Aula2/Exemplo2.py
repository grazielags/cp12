while True:
    try:
        numero = int(input("Digite um número: "))
        print(numero)
        break
    except ValueError:
        print('Digite apenas números!')
print(numero * 10)
