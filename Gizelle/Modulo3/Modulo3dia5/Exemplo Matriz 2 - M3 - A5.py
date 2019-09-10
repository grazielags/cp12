turma = []

for linha in range(3):
    #cria linha vazia
    conteudoLinha = []
    for coluna in range (5):
        #vai adicionndo asnotas na linha
        conteudoLinha.append(int(input("Digite a nota[" +str(linha)+","+str(coluna)+"]:")))
    #adicionar linha na matriz turma
    turma.append(conteudoLinha)
print(turma)

