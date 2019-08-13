"""

4) Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário,
mostrando uma mensagem de erro e voltando a pedir as informações.

"""

nome = input("Nome do usuário: ")
senha = input("Digite sua senha: ")


if nome != senha: 
    print("Pode usar o programa")
    
while nome == senha:
    senha = input("Senha inálida! Seja criativo e digite outra senha: ")
print("Pode usar o programa")
