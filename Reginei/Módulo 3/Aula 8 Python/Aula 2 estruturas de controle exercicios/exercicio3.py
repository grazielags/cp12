'''
3. Faça um programa para a leitura de duas notas parciais de um aluno.
   O programa deve calcular a média alcançada por aluno e apresentar: 
   
a. A mensagem "Aprovado", se a média alcançada for maior ou igual a sete; 
b. A mensagem "Reprovado", se a média for menor do que sete; 
c. A mensagem "Aprovado com Distinção", se a média for igual a dez. 
'''


nota1 = int(input("Digite a Primeira nota: "))
nota2 = int(input("Digite a Segunda nota: "))
media = (nota1 + nota2)/2
print("A média Parcial é: ",media)

if media >= 7 and media < 10:
       print(media,"Aluno Parcialmente Aprovado")
elif media < 7:
       print(media,"Aluno Parcialmente Reprovado")
elif media == 10:
       print(media,"Aprovado com Distinção")






