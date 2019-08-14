turma = [[5.0, 4.5, 7.0, 5.2, 6.1], [2.1, 6.5, 8.0, 7.0, 6.7], [8.6, 7.0, 9.1, 8.7, 9.3]]
#calcula a média
media = 0
mediaAluno = 0
mediasAlunos = []

print(turma)
#for para percorrer as linhas
for linha in range(3):
    #for para percorrer as colunas
    mediaAluno = 0
    for coluna in range(5):
        media = media + turma[linha][coluna]
        mediaAluno = mediaAluno + turma[linha][coluna]
    mediaAluno = mediaAluno / 5
    mediasAlunos.append(mediaAluno)

media = media / 15
print('Média da turma = ', media)
for i in range(len(mediasAlunos)):
    if mediasAlunos[i] >= media:
        print('Parabéns aluno[', i, '], com média = ', mediasAlunos[i])
