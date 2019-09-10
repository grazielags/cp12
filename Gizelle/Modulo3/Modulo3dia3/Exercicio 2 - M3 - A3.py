"""

2) Imprimir a soma de todos os números pares entre dois números solicitados
para o usuário.

"""

comeco = int(input("Digite o valor do inicio do intervalo: "))
final = int(input("Digite o valor do final do intervalo: "))

quantidadePares = 0;
while comeco <= final:
    if comeco % 2 == 0:
        quantidadePares = quantidadePares + comeco
        '''aqui soma somente os valores pares'''
    comeco+=1
    '''comeco = comeco + 1 '''
    '''aqui soma os valores dos números encontrados'''
            
print("A quantidade de números pares neste intervalo é", quantidadePares)
