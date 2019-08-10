"""

3) Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.

"""

nota = int(input("Digite a nota desejada: "))

if nota >= 0 and nota <= 10: 
    print("Nota válida!")
    
while nota > 10 or nota < 0:
    nota = int(input("Nota inválida: Digite outra nota: "))
print('Sua nota é: ', nota)
    
            

