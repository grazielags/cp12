'''
Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
"Telefonou para a vítima?"
"Esteve no local do crime?"
"Mora perto da vítima?"
"Devia para a vítima?"
"Já trabalhou com a vítima?"
O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeito".
Entre 3 e 4 questões como "Cúmplice".
5 questões como "Suposto assassino".
Caso contrário, ele será classificado como "Inocente".

'''
pergunta1 = bool(int(input('Telefonou para a vítima? (0 - Não e 1 - Sim)')))
pergunta2 = bool(int(input('Esteve no local do crime? (0 - Não e 1 - Sim)')))
pergunta3 = bool(int(input('Mora perto da vítima? (0 - Não e 1 - Sim)')))
pergunta4 = bool(int(input('Devia para a vítima? (0 - Não e 1 - Sim)')))
pergunta5 = bool(int(input('Já trabalhou com a vítima? (0 - Não e 1 - Sim)')))
quantidadePerguntasAfirmativas = 0
if pergunta1:
    quantidadePerguntasAfirmativas += 1
if pergunta2:
    quantidadePerguntasAfirmativas += 1
if pergunta3:
    quantidadePerguntasAfirmativas += 1
if pergunta4:
    quantidadePerguntasAfirmativas += 1
if pergunta5:
    quantidadePerguntasAfirmativas += 1
'''
Abaixo o código apenas com inteiro:
pergunta1 = int(input('Telefonou para a vítima? (0 - Não e 1 - Sim)'))
pergunta2 = int(input('Esteve no local do crime? (0 - Não e 1 - Sim)'))
pergunta3 = int(input('Mora perto da vítima? (0 - Não e 1 - Sim)'))
pergunta4 = int(input('Devia para a vítima? (0 - Não e 1 - Sim)'))
pergunta5 = int(input('Já trabalhou com a vítima? (0 - Não e 1 - Sim)'))
quantidadePerguntasAfirmativas = pergunta1 + pergunta2 + pergunta3 + pergunta4 + pergunta5
'''

if quantidadePerguntasAfirmativas == 2:
    print('Suspeito')
elif quantidadePerguntasAfirmativas == 3 or quantidadePerguntasAfirmativas == 4:
    print('Cúmplice')
elif quantidadePerguntasAfirmativas == 5:
    print('Suposto assassino')
else:
    print('Inocente')
