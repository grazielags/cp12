nota = int(input("Informe a nota entre 0 a 10: "))


while nota < 0 or nota > 10:
    print("Nota invalida!")
    nota = int(input("Informe uma nota valida, entre 0 e 10: "))
print("Nota digitada: ", nota)