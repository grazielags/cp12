"""

4) Um dado é lançado 50 vezes, e o valor correspondente é armazenado em um vetor.
Faça um programa que determine o percentual de ocorrências da face 6 do dado dentre esses 50 lançamentos.


"""

from random import randint
#o python tem várias bibliotecas já armazenadas, e usamos a randint que tras os números

vetor = []
quantidadeNumero6 = 0

for i in range(50):
    vetor.append(randint(1,6))
    if vetor[i] == 6:
        quantidadeNumero6 = quantidadeNumero6 + 1
       

print(vetor)
print("Quantidade de vezes que o número 6 aparece: ", quantidadeNumero6)
percentual = (quantidadeNumero6/len(vetor))*100
print(percentual, "%")
