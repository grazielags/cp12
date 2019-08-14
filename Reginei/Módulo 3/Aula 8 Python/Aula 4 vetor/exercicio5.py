'''
5. Faça um programa que leia um vetor vet de 20 posições. O
programa deve gerar, a partir do vetor lido, um outro vetor pos
que contenha apenas os valores positivos de vet.
'''
vet = []
pos = []
'''for i in range(-10,10,1):
       vet.append(i)
       if i >=0:
              pos.append(i)

print("Lista completa: ")
for i in range(len(vet)):
       print(vet[i])

print("\n\nLista positivos: ")
for i in range(len(pos)):
       print(pos[i])
'''
for i in range(20):
       vet.append(eval(input("Digite um Número: ")))
       if vet[i] >= 0:
              pos.append(vet[i])
print("Lista completa: ", vet)
print("Lista positivos: ",pos)
