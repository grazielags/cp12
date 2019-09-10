"""

1) Faça um programa, com uma função que necessite de três argumentos,
e que forneça a soma desses três argumentos.

"""

def calcula_soma(parcela1, parcela2, parcela3):
    return (parcela1+parcela2+parcela3)


numero1 = int(input("Informe o primeiro número: "))
numero2 = int(input("Informe o segundo número: "))
terceiro = int(input("Informe o terceiro e último número: "))

print("A soma dos 3 números é: ",calcula_soma(numero1,numero2,terceiro))
