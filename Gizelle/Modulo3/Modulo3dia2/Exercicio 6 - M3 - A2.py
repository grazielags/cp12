"""
6 - Faça um Programa que leia um número inteiro menor que 1000 e imprima a quantidade de centenas, dezenas e unidades do mesmo. 
Exemplos:
    326 = 3 centenas, 2 dezenas e 6 unidades
     12 = 1 dezena e 2 unidades  

"""


num = int(input("Digite um número menor que 1000: "))
numeroStr = str(num)
qtNumero = len(numeroStr)


if num > 1000:
    print("Não sabe brincar não desce para o play - NÚMERO INVÁLIDO")
    
elif qtNumero == 3:
    centena = numeroStr[0:1]
    dezena = numeroStr[1:2]
    unidade = numeroStr[2:3]
    print (numeroStr+" = "+centena+" centenas , "+dezena+" dezenas, "+unidade+ " unidades")

elif qtNumero == 2:
    dezena = numeroStr[0:1]
    unidade = numeroStr[1:2]
    print (numeroStr+" = "+dezena+" dezenas, "+unidade+ " unidades")

elif qtNumero == 1:
    unidade = numeroStr[0:1]
    print (numeroStr+" = "+unidade+ " unidades")
