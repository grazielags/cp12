num_alunos = 40
nomes = []
notas = []
media = 0

for i in range(num_alunos):
	nomes.append(input('Informar o nome do aluno: ')) #Porque nesse caso deixamos sem o eval? Pois todos os elementos serão String nessa lista, então não precisamos converter para objeto.
	notas.append(eval(input('Informar a nota de ' + nomes[i] + ': ')))
	media = media + notas[i]

media = media / num_alunos
print('A média da turma é: ', media)

for i in range(num_alunos):
	if notas[i] > media:
		print('Parabéns ', nomes[i])

