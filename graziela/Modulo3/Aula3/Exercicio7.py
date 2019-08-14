'''
Faça um programa que peça para n (solicitar a quantidade para o usuário)
pessoas a sua idade, ao final o programa deverá verificar a média de idade
da turma e então informar conforme a classificação abaixo:
 0 e 25 - Jovem
26 e 60 - Adulto
Maior que 60 - Idoso
'''

n = int(input('Digite a quantidade de pessoas que deseja saber a idade: '))
soma = 0
media = 0
for i in range(0, n, 1):
    idade = int(input('Digite a idade: '))
    while idade < 0:
        idade = int(input('Idade inválida, digite uma idade: '))
    soma = soma + idade

media = soma / n
print("A média das idade é: ", media)

if media >= 0 and media <= 25:
    print('Turma Jovem!')
elif media >= 26 and media <= 60:
    print('Turma Adulta!')
elif media > 60:
    print('Turma Idosa!')
