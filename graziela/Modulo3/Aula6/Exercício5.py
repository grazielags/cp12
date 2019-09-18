'''
Faça uma calculadora que obtenha do usuário 2 número e uma das seguintes opções:
1 - Somar
2 - Subtrair
3 - Multiplicar
4 - Dividir
5 - Sair do programa
'''

def soma(numero1, numero2):
    return numero1 + numero2

def subtracao(numero1, numero2):
    return numero1 - numero2

def multiplicacao(numero1, numero2):
    return numero1 * numero2

def divisao(numero1, numero2):
    return numero1 / numero2

numero1 = int(input('Digite o primeiro número: '))
operacao = input('Digite a operação (+, -, *, /)')
numero2 = int(input('Digite o segundo número: '))

if (operacao == '+'):
    print(numero1, ' + ', numero2, ' = ', soma(numero1, numero2))
elif (operacao == '-'):
    print(numero1, ' - ', numero2, ' = ', subtracao(numero1, numero2))
elif (operacao == '*'):
    print(numero1, ' * ', numero2, ' = ', multiplicacao(numero1, numero2))
elif (operacao == '/'):
    print(numero1, ' / ', numero2, ' = ', divisao(numero1, numero2))
