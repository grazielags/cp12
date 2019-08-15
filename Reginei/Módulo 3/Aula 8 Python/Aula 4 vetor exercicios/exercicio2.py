'''
2. Faça um programa que preencha por leitura um vetor de 10
posições e obtenha por leitura um número para verificar
quantas vezes esse número existe no vetor.

'''
vetor = []
contador = 0
for i in range(10):
       vetor.append(eval(input("Digite o valor: ")))
numero = int(input("Digite o valor a ser procurado na lista: "))
for i in range(len(vetor)):
       if vetor[i] == numero:
              contador = contador + 1
print("Lista Completa",vetor)
print("O número",numero,"aparece",contador,"vezes na Lista!")
