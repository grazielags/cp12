  
def calcula_media(v):
    soma = 0
    for i in range(len(v)):
        soma = soma + v[i]
    media = soma / len(v)
    return media

a = [1, 2, 3, 4, 5]
print (calcula_media(a))

b = [3, 2, 3, 8, 0]
print (calcula_media(b))
