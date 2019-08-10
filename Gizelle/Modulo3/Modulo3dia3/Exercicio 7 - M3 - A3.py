"""

7) Faça um programa que peça para n (solicitar a quantidade para o usuário) pessoas a sua idade,
ao final o programa deverá verificar a média de idade da turma e então informar conforme a classificação abaixo:
0 e 25 - Jovem
26 e 60 - Adulto
Maior que 60 - Idoso

copiei não entendi

"""
 
z=0
x=[]
while z != -1:
    z = int(input("Digite a idade: "))

    if z != -1:
        x.append(z)

if len(x) != 0:
    media = sum(x)/len(x)

m = round(media,0)

if 0 <= m <= 25:
    print("Populacao jovem")

if 26 <= m <= 60:
    print("Populacao adulta")

if m > 60:
    print("Populacao idosa")
