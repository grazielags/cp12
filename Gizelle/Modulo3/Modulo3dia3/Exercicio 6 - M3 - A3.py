"""

6) Faça um programa que leia 5 números e informe a soma e a média dos números.


"""
 
num1 = (int(input("Digite o primeiro número: ")))
num2 = (int(input("Digite o segundo número: ")))
num3 = (int(input("Digite o terceiro número: ")))
num4 = (int(input("Digite o quarto número: ")))
num5 = (int(input("Digite o quinto número: ")))

soma = (num1+num2+num3+num4+num5)
media = soma/5

print ("A soma dos 5 números é: ", soma, " e a média é: ",media)



"""

Correção em sala:

        soma = 0.0
        media = 0.0

        for i in range (0,5,1)
            numero = int(input("Digite um número: "))
            soma = soma + numero

        media = soma/5
        print("soma é: ", soma "\ne média é: ", media)


"""
