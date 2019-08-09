nome = input("Informe o seu nome de usuario: ")
senha = input("Informe a sua senha: ")


while nome == senha:
    print("ERROR-Senha invalida!")
    senha = input("Escolha uma senha diferente do nome de usuario: ")
print("Nome: ", nome)
print("Senha: ", senha)