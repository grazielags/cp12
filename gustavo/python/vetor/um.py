vet1 = []
vet2 = []

for i in range(3):
    vet1.append(eval(input("Digite o " + str(i) + "º valor para o Vetor1")))
    vet2.append(eval(input("Digite o " + str(i) + "º valor para o Vetor1")))

for i in range(3):
    print(vet1[i], '+', vet2[i], '=', vet1[i] + vet2[i])