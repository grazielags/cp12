"""

5) Faça uma calculadora que obtenha do usuário 2 número e uma das seguintes opções:
1 - Somar
2 - Subtrair
3 - Multiplicar
4 - Dividir
5 - Sair do programa

"""

#usar o while  e tem 5  funções,uma para cada opção

def soma(numero1, numero2):
    return numero1 + numero2

def subtracao(numero1, numero2):
    return numero1 - numero2

def multiplicacao(numero1, numero2):
    return numero1 * numero2

def divisao(numero1, numero2):
    return numero1 / numero2

numero1 = int(input('Digite o primeiro número: '))
numero2 = int(input('Digite o segundo número: '))
operacao = input('Digite a operação (+, -, *, /)')


if (operacao == '+'):
    print(numero1, ' + ', numero2, ' = ', soma(numero1, numero2))
elif (operacao == '-'):
    print(numero1, ' - ', numero2, ' = ', subtracao(numero1, numero2))
elif (operacao == '*'):
    print(numero1, ' * ', numero2, ' = ', multiplicacao(numero1, numero2))
elif (operacao == '/'):
    print(numero1, ' / ', numero2, ' = ', divisao(numero1, numero2))
