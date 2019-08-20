
'''
4. Um dado é lançado 50 vezes, e o valor correspondente é
armazenado em um vetor. Faça um programa que determine o
percentual de ocorrências da face 6 do dado dentre esses 50
lançamentos.
'''

from random import randint

vetor = []
qtd6 = 0

for i in range(50):
       vetor.append(randint(1,6))
       if vetor[i] == 6:
              qtd6 = qtd6 + 1
print(vetor)
print("Quantidade que o numero 6 aparece: ",qtd6)
percentual = (qtd6 / len(vetor))*100
print("Percentual de vezes que o numero 6 foi sorteado: ",percentual)
        
