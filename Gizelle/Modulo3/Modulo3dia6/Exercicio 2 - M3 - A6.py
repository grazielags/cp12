"""

2) Faça uma função que informe o status do aluno a partir da sua média de
acordo com a tabela a seguir:
    Nota acima de 6 à "Aprovado"
    Nota entre 4 e 6 à "Verificação Suplementar"
    Nota abaixo de 4 à "Reprovado"

"""

def resultado(media):
    if media > 6 and media <= 10:
        print("Nota: ", media, " APROVADO")
    elif media > 4 and media <= 6:
        print("Nota: ", media, " VERIFICAR SUPLEMENTAR")
    elif media > 0 and media <= 4:
        print("Nota: ", media, " REPROVADO")
    else:
        print("Média Inválida")

def resultado2(media):
    #com return em cada if
    if media > 6 and media <= 10:
        return 'Nota: ', media, ' APROVADO'
    elif media > 4 and media <= 6:
        return 'Nota: ', media, ' VERIFICAR SUPLEMENTAR'
    elif media > 0 and media <= 4:
        return "Nota: ", media, " REPROVADO"
    return "Média Inválida"


nota1 = int(input("Digite a primeira nota: "))
nota2 = int(input("Digite a segunda nota: "))

media = (nota1 + nota2)/2

resultado(media)
print("resultado2")
print(resultado2(media)
