'''Faça um programa para a leitura de duas notas parciais de um aluno.
O programa deve calcular a média alcançada por aluno e apresentar: 
a.	A mensagem "Aprovado", se a média alcançada for maior ou igual a sete; 
b.	A mensagem "Reprovado", se a média for menor do que sete; 
c.	A mensagem "Aprovado com Distinção", se a média for igual a dez. 

'''


nota1= int(input("Escreva a primeira nota\n"))
nota2= int(input("Escreva a segunda nota\n"))

media=(nota1+nota2)//2


if media >= 7 and media < 10:        
    print("Aprovado")    
elif media < 7:
    print("Reprovado")
elif media == 10:
    print("Parabens aluno estrela")


