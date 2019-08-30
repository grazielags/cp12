"""

5) Faça um programa que leia 5 números e informe o maior número.


"""

for i in range (0,5,1):
    numero = int(input("Digite um número: "))
    if i == 0:
         maior = numero
    elif numero > maior:
         maior = numero
print (maior)


"""
exemplo 1 na sala - sem repetição - modo simples

            numero = (int(input("Digite o primeiro número: ")))
            maior = numero

            numero = (int(input("Digite o segundo número: ")))
            if numero > maior:
                maior = numero;

            numero = (int(input("Digite o terceiro número: ")))
            if numero > maior:
                maior = numero;

            numero = (int(input("Digite o quarto número: ")))
            if numero > maior:
                maior = numero;

            numero = (int(input("Digite o quinto número: ")))
            if numero > maior:
                maior = numero;

            print ("O maior número da lista é: ", maior)


exemplo 2 na sala - com repetição

            for i in range (0,5,1)
                numero = int(input("Digite um número: ")
                if i == 0:
                    maior = numero
                elif numero > maior
                maior = numero

            print (maior)
    
exemplo internet - lista - avançado

        lista = []

        for n in range(0,5): 
            lista.append(int(input("Digite o número: ")))

        print ("O maior número da lista é: ", max(lista)

"""
