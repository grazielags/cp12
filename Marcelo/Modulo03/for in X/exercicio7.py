'''7. Faça um programa que peça para n (solicitar a quantidade para
o usuário) pessoas a sua idade, ao final o programa deverá
verificar a média de idade da turma e então informar conforme
a classificação abaixo:
0 e 25 - Jovem
26 e 60 - Adulto
Maior que 60 - Idoso
'''
n=int(input("Escreva a quantidade de pessoas"))
soma = 0
for x in range (0,n,1):
    idade=int(input("Escreva as idades"))     
    soma = soma + idade
media = soma//n
print(media)
if media >= 0 and media<25:
    print("Jovem")
elif media>= 26 and media<60:
    print("Adulto")
elif media>60:
    print("Idoso")
  
