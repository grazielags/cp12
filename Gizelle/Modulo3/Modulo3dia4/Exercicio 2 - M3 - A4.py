"""

2) Faça um programa que preencha por leitura um vetor de 10 posições e
obtenha por leitura um número para verificar quantas vezes esse número existe no vetor.

"""
 
num1 = []
count = 0
for i in range(10):
    num1.append(eval(input("Digite umn úmero: ")))


num2 = int(input("Digite número que quer encontrar: "))

for i in range(10):
    if num2 == num1[i]:
        count = count + 1 

print("O número", num2, "aparece", count, "vezes")
