quantidade = int(input("Informe a quantidade de usuarios a serem digitados: "))
media = 0
classificacao = 0
for x in range (0, quantidade):
    idade = int(input("Informe a idade do usuario: "))
    media += idade
print("Media de idade: ", media/quantidade)
classificacao = media/quantidade
if classificacao >= 0 and classificacao <= 25:
    classificacao = " Turma jovem!"
elif classificacao >= 26 and classificacao <= 60:
    classificacao = "Turma adulta!"
elif classificacao > 60:
    classificacao = "Turma idosa!"
print("Classificação: ", classificacao)