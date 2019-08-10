"""

1) Imprimir a quantidade de números pares entre dois números solicitados para o usuário.

"""


comeco = int(input("Digite o valor do inicio do intervalo: "))
final = int(input("Digite o valor do final do intervalo: "))

quantidadePares = 0;
while comeco <= final:
    if comeco % 2 == 0:
        quantidadePares+=1
    comeco+=1
            
print("A quantidade de números pares neste intervalo é", quantidadePares)
