"""

5) Faça uma calculadora que obtenha do usuário 2 número e uma das seguintes opções:
1 - Somar
2 - Subtrair
3 - Multiplicar
4 - Dividir
5 - Sair do programa

"""

#usar o while  e tem 5  funções,uma para cada opção

def menu():
    print("*******************************")
    print("1 - Somar")
    print("2 - Subtrair")
    print("3 - Multiplicar")
    print("4 - Dividir")
    print("5 - Sair do programa")
    print("*******************************")
menu()


opcao = int(input("Escolha sua opção: "))
if opcao == 0 or opcao > 5:
    print ("Sua opção foi:", opcao, " - Opção inválida")
elif opcao > 1 and opcao < 5:
    
