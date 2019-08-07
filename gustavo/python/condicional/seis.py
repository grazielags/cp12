num = int(input("Digite um numero menor que 1000 para saber sua quantidade de centenas, dezenas e unidades: "))
unidade = int(num%10)
dezena = int((num%100 - unidade)/10)
centena = int(num/100)


if num < 1000:
    print("Unidade: ", unidade, "\nDezena: ", dezena,  "\nCentena: ", centena)