"""

3) Faça um programa que preencha por leitura um vetor de 5 posições,
e informe a primeira vez que o valor x (lido do teclado) se encontra no vetor.
Caso o valor x não seja encontrado, o programa deve imprimir o valor -1.

"""
 
num1 = []

for i in range(5):
    num1.append(eval(input("Digite um n1úmero: ")))

num2 = int(input("Digite o número que deseja saber a primeira posição encontrada: "))

for i in range(5):
    if num2 == num1[i]:
        indice = i
        #i pq é o i que vai passar em todas as posições
        break
    else:
        indice = -1        

print("Número encontra-se na posição: ", indice)
