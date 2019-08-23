vet = []
posicao = -1

for i in range(5):
    vet.append(eval(input("Digite um num: ")))

num = int(input("Digite o num para saber a primeira posição encontrada: "))

for i in range(len(vet)):
    if num == vet[i]:
        posicao = i
        break

print("Vetor: ", vet)
print("Primeira posição do ", num, ": ", posicao)