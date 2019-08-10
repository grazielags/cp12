"""
3. Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar: 
    a.	A mensagem "Aprovado", se a média alcançada for maior ou igual a sete; 
    b.	A mensagem "Reprovado", se a média for menor do que sete; 
    c.	A mensagem "Aprovado com Distinção", se a média for igual a dez. 

"""
nome = input("Nome do aluno: ")
nota1 = int(input("Digite a primeira nota: " ))
nota2 = int(input("Digite a segunda nota: " ))

media = (nota1+nota2)/2

if media >= 7 and media < 10 :
    print("Aluno(a)", nome, "está APROVADO(A) com a média:", media)
elif media == 10:
    print("Aluno(a)", nome, "está APROVADO(A) COM DESTINÇÃO com a média:", media)
elif media < 7:
    print("Aluno(a)", nome, "está REPROVADO(A) com a média:", media)


