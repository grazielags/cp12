'''4. Faça um programa que leia um nome de usuário e a sua senha e
não aceite a senha igual ao nome do usuário, mostrando uma
mensagem de erro e voltando a pedir as informações.
'''

nome= input("Escreva seu nome: ")
senha=input("Escreva sua senha: ")

while nome.lower()==senha.lower():
    print("Erro, lembrando que a senha não pode ser igual ao nome")
    nome= input("Escreva seu nome: ")
    senha= input("Escreva sua senha: ")




  
