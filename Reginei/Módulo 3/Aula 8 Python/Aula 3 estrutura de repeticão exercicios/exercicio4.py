'''
4. Faça um programa que leia um nome de usuário e a sua senha e
não aceite a senha igual ao nome do usuário, mostrando uma
mensagem de erro e voltando a pedir as informações.
'''

nome = input("Digite um Nome: ")
senha = input("Digite uma senha: ")

while nome == senha:
       senha = input("senha digita é igual ao nome, digite outra: ")
print("Dados Cadastrados!")


     
