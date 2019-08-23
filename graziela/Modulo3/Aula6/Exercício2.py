'''
Faça uma função que informe o status do aluno a partir da sua média de acordo com a
tabela a seguir:
Nota acima de 6 à "Aprovado"
Nota entre 4 e 6 à "Verificação Suplementar"
Nota abaixo de 4 à "Reprovado"
'''
def resultado(nota1, nota2):
    media = (nota1 + nota2) / 2
    if media > 6 and media <= 10:
        print('Aprovado')
    elif media > 4 and media <= 6:
        print('Verificação Suplementar')
    elif media > 0 and media <= 4:
        print('Reprovado')
    else:
        print('Média inválida')

def resultado2(media):
    if media > 6 and media <= 10:
        return 'Aprovado'
    elif media > 4 and media <= 6:
        return 'Verificação Suplementar'
    elif media > 0 and media <= 4:
        return 'Reprovado'
    else:
        return 'Média inválida'

nota1 = int(input('Digite a primeira nota: '))
nota2 = int(input('Digite a segunda nota: '))

media = (nota1 + nota2) / 2

resultado(nota1, nota2)
print('Nova função: ')
print(resultado2(media))
