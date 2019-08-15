matriz = []
parar = False
while not(parar):
    linha = [0] * 10
    matriz.append(linha)
    x = input("Deseja parar? (S/N)")
    if x == "S" or x == "s":
        parar = True
print("A matriz possui", len(matriz), " linhas")
print("A matriz possui", len(matriz[0]), " colunas")
