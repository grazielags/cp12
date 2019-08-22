vet = []
contador = 0

for i in range(10):
    vet.append(input("Digite um valor para adicionar ao vetor: "))

num = input(int("Informe o num para saber se o mesmo esta no vetor e quantas vezes: "))

for i in range(10):
    if vet[i] == num:
        contador += 1

print("Vetor: ", vet[i])
print("O num ", num, " aparece ", contador, "x no vetor!")