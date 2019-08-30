"""

3) Faça uma função que receba um número por parâmetro.
A função deverá retornar 'P', se seu número for positivo,
e 'N', se o número for zero ou negativo.

"""

def VerificaPositivo():
    if n > 0:
        return "P"
    else:
        return "N"
    
n = int(input("Digite um número: "))
print(VerificaPositivo())
