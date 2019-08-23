from random import randint
vet = []
qtd6 = 0


for i in range(50):
    vet.append(randint(1,6))
    if vet[i] == 6:
        qtd6 += 1

print("Vetor: ", vet)
print("Quantidade do num 6 no vetor: ", qtd6)
percentual = (qtd6 / len(vet)) * 100
print("Percentual de vezes que o numero 6 foi sorteado: ", percentual)
